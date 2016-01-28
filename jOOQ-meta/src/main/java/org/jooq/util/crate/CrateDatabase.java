/**
 * Copyright (c) 2009-2015, Data Geekery GmbH (http://www.datageekery.com)
 * All rights reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p>
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 * <p>
 * For more information, please visit: http://www.jooq.org/licenses
 */

package org.jooq.util.crate;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Record4;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.Schema;
import org.jooq.Sequence;
import org.jooq.impl.DSL;
import org.jooq.util.AbstractDatabase;
import org.jooq.util.ArrayDefinition;
import org.jooq.util.CatalogDefinition;
import org.jooq.util.DataTypeDefinition;
import org.jooq.util.DefaultDataTypeDefinition;
import org.jooq.util.DefaultRelations;
import org.jooq.util.DefaultSequenceDefinition;
import org.jooq.util.DomainDefinition;
import org.jooq.util.EnumDefinition;
import org.jooq.util.PackageDefinition;
import org.jooq.util.RoutineDefinition;
import org.jooq.util.SchemaDefinition;
import org.jooq.util.SequenceDefinition;
import org.jooq.util.TableDefinition;
import org.jooq.util.UDTDefinition;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.jooq.util.crate.information_schema.tables.Schemata.SCHEMATA;
import static org.jooq.util.crate.information_schema.tables.Tables.TABLES;
import static org.jooq.util.crate.information_schema.tables.TableConstraints.TABLE_CONSTRAINTS;

public class CrateDatabase extends AbstractDatabase {

    private static final String PRIMARY_KEY_CONSTRAINT = "PRIMARY_KEY";

    private List<Schema> schemas;

    @Override
    protected DSLContext create0() {
        return DSL.using(getConnection(), SQLDialect.CRATE);
    }

    @Override
    protected void loadPrimaryKeys(DefaultRelations relations) throws SQLException {
        for (Record record : fetchKeys(PRIMARY_KEY_CONSTRAINT)) {
            SchemaDefinition schema = getSchema(record.getValue(TABLE_CONSTRAINTS.SCHEMA_NAME));
            String tableName = record.getValue(TABLE_CONSTRAINTS.TABLE_NAME);
            String[] columns = record.getValue(TABLE_CONSTRAINTS.CONSTRAINT_NAME);

            TableDefinition table = getTable(schema, tableName);
            if (table != null) {
                for (String column : columns) {
                    if (!column.equals("_id")) {
                        relations.addPrimaryKey(PRIMARY_KEY_CONSTRAINT, table.getColumn(column));
                    }
                }
            }
        }
    }

    @Override
    protected void loadUniqueKeys(DefaultRelations relations) throws SQLException {
    }

    @Override
    protected void loadForeignKeys(DefaultRelations relations) throws SQLException {
    }

    @Override
    protected void loadCheckConstraints(DefaultRelations r) throws SQLException {
    }

    private Result<Record4<String, String, String, String[]>> fetchKeys(String constraintType) {
        return create().select(
                TABLE_CONSTRAINTS.SCHEMA_NAME,
                TABLE_CONSTRAINTS.TABLE_NAME,
                TABLE_CONSTRAINTS.CONSTRAINT_TYPE,
                TABLE_CONSTRAINTS.CONSTRAINT_NAME)
                .from(TABLE_CONSTRAINTS)
                .where(TABLE_CONSTRAINTS.SCHEMA_NAME.in(getInputSchemata()))
                .and(TABLE_CONSTRAINTS.CONSTRAINT_TYPE.equal(constraintType))
                .fetch();
    }

    @Override
    protected List<CatalogDefinition> getCatalogs0() throws SQLException {
        List<CatalogDefinition> result = new ArrayList<CatalogDefinition>();
        result.add(new CatalogDefinition(this, "", ""));
        return result;
    }

    @Override
    protected List<SchemaDefinition> getSchemata0() throws SQLException {
        List<SchemaDefinition> result = new ArrayList<SchemaDefinition>();

        for (String name : create()
                .select(SCHEMATA.SCHEMA_NAME)
                .from(SCHEMATA)
                .fetch(SCHEMATA.SCHEMA_NAME)) {
            result.add(new SchemaDefinition(this, name, ""));
        }
        return result;
    }

    private List<Schema> getSchemasFromMeta() {
        if (schemas == null) {
            schemas = new ArrayList<Schema>();

            for (Schema schema : create().meta().getSchemas())
                if (getInputSchemata().contains(schema.getName()))
                    schemas.add(schema);
        }

        return schemas;
    }

    @Override
    protected List<SequenceDefinition> getSequences0() throws SQLException {
        List<SequenceDefinition> result = new ArrayList<SequenceDefinition>();

        for (Schema schema : getSchemasFromMeta()) {
            for (Sequence<?> sequence : schema.getSequences()) {
                SchemaDefinition sd = getSchema(schema.getName());

                DataTypeDefinition type = new DefaultDataTypeDefinition(
                        this,
                        sd,
                        sequence.getDataType().getTypeName()
                );

                result.add(new DefaultSequenceDefinition(
                        sd, sequence.getName(), type));
            }
        }

        return result;
    }

    @Override
    protected List<TableDefinition> getTables0() throws SQLException {
        List<TableDefinition> result = new ArrayList<TableDefinition>();

        for (Record record : create().select(
                TABLES.SCHEMA_NAME,
                TABLES.TABLE_NAME)
                .from(TABLES)
                .where(TABLES.SCHEMA_NAME.in(getInputSchemata()))
                .orderBy(
                        TABLES.SCHEMA_NAME,
                        TABLES.TABLE_NAME)
                .fetch()) {

            SchemaDefinition schema = getSchema(record.getValue(TABLES.SCHEMA_NAME));
            String name = record.getValue(TABLES.TABLE_NAME);

            CrateTableDefinition table = new CrateTableDefinition(schema, name, "");
            result.add(table);
        }
        return result;
    }

    @Override
    protected List<EnumDefinition> getEnums0() throws SQLException {
        return Collections.<EnumDefinition>emptyList();
    }

    @Override
    protected List<DomainDefinition> getDomains0() throws SQLException {
        return Collections.<DomainDefinition>emptyList();
    }

    @Override
    protected List<UDTDefinition> getUDTs0() throws SQLException {
        return Collections.<UDTDefinition>emptyList();
    }

    @Override
    protected List<ArrayDefinition> getArrays0() throws SQLException {
        return Collections.<ArrayDefinition>emptyList();
    }

    @Override
    protected List<RoutineDefinition> getRoutines0() throws SQLException {
        return Collections.<RoutineDefinition>emptyList();
    }

    @Override
    protected List<PackageDefinition> getPackages0() throws SQLException {
        return Collections.<PackageDefinition>emptyList();
    }
}
