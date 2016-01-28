/**
 * This class is generated by jOOQ
 */
package org.jooq.util.crate.sys.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.util.crate.sys.Sys;
import org.jooq.util.crate.sys.tables.records.ShardsRecord;


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
public class Shards extends TableImpl<ShardsRecord> {

    private static final long serialVersionUID = 1931758340;

    /**
     * The reference instance of <code>sys.shards</code>
     */
    public static final Shards SHARDS = new Shards();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShardsRecord> getRecordType() {
        return ShardsRecord.class;
    }

    /**
     * The column <code>sys.shards.id</code>.
     */
    public final TableField<ShardsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>sys.shards.num_docs</code>.
     */
    public final TableField<ShardsRecord, Long> NUM_DOCS = createField("num_docs", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>sys.shards.orphan_partition</code>.
     */
    public final TableField<ShardsRecord, Boolean> ORPHAN_PARTITION = createField("orphan_partition", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>sys.shards.partition_ident</code>.
     */
    public final TableField<ShardsRecord, String> PARTITION_IDENT = createField("partition_ident", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.shards.primary</code>.
     */
    public final TableField<ShardsRecord, Boolean> PRIMARY = createField("primary", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>sys.shards.recovery</code>.
     */
    public final TableField<ShardsRecord, Object> RECOVERY = createField("recovery", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.shards.recovery['files']</code>.
     */
    public final TableField<ShardsRecord, Object> RECOVERY_5b_27FILES_27_5d = createField("recovery['files']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.shards.recovery['files']['percent']</code>.
     */
    public final TableField<ShardsRecord, Float> RECOVERY_5b_27FILES_27_5d_5b_27PERCENT_27_5d = createField("recovery['files']['percent']", org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * The column <code>sys.shards.recovery['files']['recovered']</code>.
     */
    public final TableField<ShardsRecord, Integer> RECOVERY_5b_27FILES_27_5d_5b_27RECOVERED_27_5d = createField("recovery['files']['recovered']", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>sys.shards.recovery['files']['reused']</code>.
     */
    public final TableField<ShardsRecord, Integer> RECOVERY_5b_27FILES_27_5d_5b_27REUSED_27_5d = createField("recovery['files']['reused']", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>sys.shards.recovery['files']['used']</code>.
     */
    public final TableField<ShardsRecord, Integer> RECOVERY_5b_27FILES_27_5d_5b_27USED_27_5d = createField("recovery['files']['used']", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>sys.shards.recovery['size']</code>.
     */
    public final TableField<ShardsRecord, Object> RECOVERY_5b_27SIZE_27_5d = createField("recovery['size']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.shards.recovery['size']['percent']</code>.
     */
    public final TableField<ShardsRecord, Float> RECOVERY_5b_27SIZE_27_5d_5b_27PERCENT_27_5d = createField("recovery['size']['percent']", org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * The column <code>sys.shards.recovery['size']['recovered']</code>.
     */
    public final TableField<ShardsRecord, Long> RECOVERY_5b_27SIZE_27_5d_5b_27RECOVERED_27_5d = createField("recovery['size']['recovered']", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>sys.shards.recovery['size']['reused']</code>.
     */
    public final TableField<ShardsRecord, Long> RECOVERY_5b_27SIZE_27_5d_5b_27REUSED_27_5d = createField("recovery['size']['reused']", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>sys.shards.recovery['size']['used']</code>.
     */
    public final TableField<ShardsRecord, Long> RECOVERY_5b_27SIZE_27_5d_5b_27USED_27_5d = createField("recovery['size']['used']", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>sys.shards.recovery['stage']</code>.
     */
    public final TableField<ShardsRecord, String> RECOVERY_5b_27STAGE_27_5d = createField("recovery['stage']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.shards.recovery['total_time']</code>.
     */
    public final TableField<ShardsRecord, Long> RECOVERY_5b_27TOTAL_TIME_27_5d = createField("recovery['total_time']", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>sys.shards.recovery['type']</code>.
     */
    public final TableField<ShardsRecord, String> RECOVERY_5b_27TYPE_27_5d = createField("recovery['type']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.shards.relocating_node</code>.
     */
    public final TableField<ShardsRecord, String> RELOCATING_NODE = createField("relocating_node", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.shards.schema_name</code>.
     */
    public final TableField<ShardsRecord, String> SCHEMA_NAME = createField("schema_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.shards.size</code>.
     */
    public final TableField<ShardsRecord, Long> SIZE = createField("size", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>sys.shards.state</code>.
     */
    public final TableField<ShardsRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.shards.table_name</code>.
     */
    public final TableField<ShardsRecord, String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>sys.shards</code> table reference
     */
    public Shards() {
        this("shards", null);
    }

    /**
     * Create an aliased <code>sys.shards</code> table reference
     */
    public Shards(String alias) {
        this(alias, SHARDS);
    }

    private Shards(String alias, Table<ShardsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Shards(String alias, Table<ShardsRecord> aliased, Field<?>[] parameters) {
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
    public Shards as(String alias) {
        return new Shards(alias, this);
    }

    /**
     * Rename this table
     */
    public Shards rename(String name) {
        return new Shards(name, null);
    }
}
