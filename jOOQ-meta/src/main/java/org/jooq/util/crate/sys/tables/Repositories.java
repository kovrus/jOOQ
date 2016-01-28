/**
 * This class is generated by jOOQ
 */
package org.jooq.util.crate.sys.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.util.crate.sys.Sys;


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
public class Repositories extends TableImpl<Record> {

    private static final long serialVersionUID = -2029395476;

    /**
     * The reference instance of <code>sys.repositories</code>
     */
    public static final Repositories REPOSITORIES = new Repositories();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>sys.repositories.name</code>.
     */
    public final TableField<Record, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.repositories.settings</code>.
     */
    public final TableField<Record, Object> SETTINGS = createField("settings", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.repositories.type</code>.
     */
    public final TableField<Record, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>sys.repositories</code> table reference
     */
    public Repositories() {
        this("repositories", null);
    }

    /**
     * Create an aliased <code>sys.repositories</code> table reference
     */
    public Repositories(String alias) {
        this(alias, REPOSITORIES);
    }

    private Repositories(String alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Repositories(String alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Sys.SYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Repositories as(String alias) {
        return new Repositories(alias, this);
    }

    /**
     * Rename this table
     */
    public Repositories rename(String name) {
        return new Repositories(name, null);
    }
}
