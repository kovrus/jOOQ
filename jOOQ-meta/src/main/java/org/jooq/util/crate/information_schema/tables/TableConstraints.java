/**
 * This class is generated by jOOQ
 */
package org.jooq.util.crate.information_schema.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.util.crate.information_schema.InformationSchema;
import org.jooq.util.crate.information_schema.tables.records.TableConstraintsRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TableConstraints extends TableImpl<TableConstraintsRecord> {

    private static final long serialVersionUID = 1803635794;

    /**
     * The reference instance of <code>information_schema.table_constraints</code>
     */
    public static final TableConstraints TABLE_CONSTRAINTS = new TableConstraints();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TableConstraintsRecord> getRecordType() {
        return TableConstraintsRecord.class;
    }

    /**
     * The column <code>information_schema.table_constraints.constraint_name</code>.
     */
    public final TableField<TableConstraintsRecord, String[]> CONSTRAINT_NAME = createField("constraint_name", org.jooq.impl.SQLDataType.VARCHAR.getArrayDataType(), this, "");

    /**
     * The column <code>information_schema.table_constraints.constraint_type</code>.
     */
    public final TableField<TableConstraintsRecord, String> CONSTRAINT_TYPE = createField("constraint_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.table_constraints.schema_name</code>.
     */
    public final TableField<TableConstraintsRecord, String> SCHEMA_NAME = createField("schema_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.table_constraints.table_name</code>.
     */
    public final TableField<TableConstraintsRecord, String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.table_constraints</code> table reference
     */
    public TableConstraints() {
        this("table_constraints", null);
    }

    /**
     * Create an aliased <code>information_schema.table_constraints</code> table reference
     */
    public TableConstraints(String alias) {
        this(alias, TABLE_CONSTRAINTS);
    }

    private TableConstraints(String alias, Table<TableConstraintsRecord> aliased) {
        this(alias, aliased, null);
    }

    private TableConstraints(String alias, Table<TableConstraintsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TableConstraints as(String alias) {
        return new TableConstraints(alias, this);
    }

    /**
     * Rename this table
     */
    public TableConstraints rename(String name) {
        return new TableConstraints(name, null);
    }
}
