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

import org.jooq.Record;
import org.jooq.util.AbstractTableDefinition;
import org.jooq.util.ColumnDefinition;
import org.jooq.util.DataTypeDefinition;
import org.jooq.util.DefaultColumnDefinition;
import org.jooq.util.DefaultDataTypeDefinition;
import org.jooq.util.SchemaDefinition;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.jooq.util.crate.information_schema.tables.Columns.COLUMNS;


public class CrateTableDefinition extends AbstractTableDefinition {

    public CrateTableDefinition(SchemaDefinition schema, String name, String comment) {
        super(schema, name, comment);
    }

    @Override
    public List<ColumnDefinition> getElements0() throws SQLException {
        List<ColumnDefinition> result = new ArrayList<ColumnDefinition>();

        for (Record record : create().select(
                COLUMNS.ORDINAL_POSITION,
                COLUMNS.SCHEMA_NAME,
                COLUMNS.TABLE_NAME,
                COLUMNS.COLUMN_NAME,
                COLUMNS.DATA_TYPE,
                COLUMNS.IS_GENERATED,
                COLUMNS.GENERATION_EXPRESSION)
                .from(COLUMNS)
                .where(COLUMNS.SCHEMA_NAME.equal(getSchema().getName()))
                .and(COLUMNS.TABLE_NAME.equal(getName()))
                .orderBy(COLUMNS.ORDINAL_POSITION)
                .fetch()) {

            String dataTypeName = record.getValue(COLUMNS.DATA_TYPE);

            DataTypeDefinition type = new DefaultDataTypeDefinition(
                    getDatabase(),
                    getSchema(),
                    dataTypeName
            );

            ColumnDefinition column = new DefaultColumnDefinition(
                    getDatabase().getTable(getSchema(), getName()),
                    record.getValue(COLUMNS.COLUMN_NAME),
                    record.getValue(COLUMNS.ORDINAL_POSITION, int.class),
                    type,
                    false,
                    ""
            );
            result.add(column);
        }
        return result;
    }
}
