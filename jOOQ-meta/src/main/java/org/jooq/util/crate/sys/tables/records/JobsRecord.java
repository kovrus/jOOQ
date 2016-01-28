/**
 * This class is generated by jOOQ
 */
package org.jooq.util.crate.sys.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.util.crate.sys.tables.Jobs;


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
public class JobsRecord extends UpdatableRecordImpl<JobsRecord> implements Record3<String, Timestamp, String> {

    private static final long serialVersionUID = 2124757976;

    /**
     * Setter for <code>sys.jobs.id</code>.
     */
    public void setId(String value) {
        setValue(0, value);
    }

    /**
     * Getter for <code>sys.jobs.id</code>.
     */
    public String getId() {
        return (String) getValue(0);
    }

    /**
     * Setter for <code>sys.jobs.started</code>.
     */
    public void setStarted(Timestamp value) {
        setValue(1, value);
    }

    /**
     * Getter for <code>sys.jobs.started</code>.
     */
    public Timestamp getStarted() {
        return (Timestamp) getValue(1);
    }

    /**
     * Setter for <code>sys.jobs.stmt</code>.
     */
    public void setStmt(String value) {
        setValue(2, value);
    }

    /**
     * Getter for <code>sys.jobs.stmt</code>.
     */
    public String getStmt() {
        return (String) getValue(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record11<String, String, String, Integer, String, String, String, Integer, String, String, String> key() {
        return (Record11) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, Timestamp, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, Timestamp, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Jobs.JOBS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return Jobs.JOBS.STARTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Jobs.JOBS.STMT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getStarted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getStmt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobsRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobsRecord value2(Timestamp value) {
        setStarted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobsRecord value3(String value) {
        setStmt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobsRecord values(String value1, Timestamp value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JobsRecord
     */
    public JobsRecord() {
        super(Jobs.JOBS);
    }

    /**
     * Create a detached, initialised JobsRecord
     */
    public JobsRecord(String id, Timestamp started, String stmt) {
        super(Jobs.JOBS);

        setValue(0, id);
        setValue(1, started);
        setValue(2, stmt);
    }
}
