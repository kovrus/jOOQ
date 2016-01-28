/**
 * This class is generated by jOOQ
 */
package org.jooq.util.crate.sys.tables;


import java.sql.Timestamp;

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
public class Jobs extends TableImpl<Record> {

    private static final long serialVersionUID = -1472054467;

    /**
     * The reference instance of <code>sys.jobs</code>
     */
    public static final Jobs JOBS = new Jobs();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>sys.jobs.id</code>.
     */
    public final TableField<Record, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.jobs.started</code>.
     */
    public final TableField<Record, Timestamp> STARTED = createField("started", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>sys.jobs.stmt</code>.
     */
    public final TableField<Record, String> STMT = createField("stmt", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>sys.jobs</code> table reference
     */
    public Jobs() {
        this("jobs", null);
    }

    /**
     * Create an aliased <code>sys.jobs</code> table reference
     */
    public Jobs(String alias) {
        this(alias, JOBS);
    }

    private Jobs(String alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Jobs(String alias, Table<Record> aliased, Field<?>[] parameters) {
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
    public Jobs as(String alias) {
        return new Jobs(alias, this);
    }

    /**
     * Rename this table
     */
    public Jobs rename(String name) {
        return new Jobs(name, null);
    }
}
