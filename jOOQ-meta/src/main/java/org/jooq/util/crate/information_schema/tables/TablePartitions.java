/**
 * This class is generated by jOOQ
 */
package org.jooq.util.crate.information_schema.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.util.crate.information_schema.InformationSchema;


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
public class TablePartitions extends TableImpl<Record> {

    private static final long serialVersionUID = -323137600;

    /**
     * The reference instance of <code>information_schema.table_partitions</code>
     */
    public static final TablePartitions TABLE_PARTITIONS = new TablePartitions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.table_partitions.number_of_replicas</code>.
     */
    public final TableField<Record, String> NUMBER_OF_REPLICAS = createField("number_of_replicas", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.table_partitions.number_of_shards</code>.
     */
    public final TableField<Record, Integer> NUMBER_OF_SHARDS = createField("number_of_shards", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.table_partitions.partition_ident</code>.
     */
    public final TableField<Record, String> PARTITION_IDENT = createField("partition_ident", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.table_partitions.schema_name</code>.
     */
    public final TableField<Record, String> SCHEMA_NAME = createField("schema_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.table_partitions.settings</code>.
     */
    public final TableField<Record, Object> SETTINGS = createField("settings", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>information_schema.table_partitions.settings['blocks']</code>.
     */
    public final TableField<Record, Object> SETTINGS_5b_27BLOCKS_27_5d = createField("settings['blocks']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>information_schema.table_partitions.settings['blocks']['metadata']</code>.
     */
    public final TableField<Record, Boolean> SETTINGS_5b_27BLOCKS_27_5d_5b_27METADATA_27_5d = createField("settings['blocks']['metadata']", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>information_schema.table_partitions.settings['blocks']['read']</code>.
     */
    public final TableField<Record, Boolean> SETTINGS_5b_27BLOCKS_27_5d_5b_27READ_27_5d = createField("settings['blocks']['read']", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>information_schema.table_partitions.settings['blocks']['read_only']</code>.
     */
    public final TableField<Record, Boolean> SETTINGS_5b_27BLOCKS_27_5d_5b_27READ_ONLY_27_5d = createField("settings['blocks']['read_only']", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>information_schema.table_partitions.settings['blocks']['write']</code>.
     */
    public final TableField<Record, Boolean> SETTINGS_5b_27BLOCKS_27_5d_5b_27WRITE_27_5d = createField("settings['blocks']['write']", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>information_schema.table_partitions.settings['gateway']</code>.
     */
    public final TableField<Record, Object> SETTINGS_5b_27GATEWAY_27_5d = createField("settings['gateway']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>information_schema.table_partitions.settings['gateway']['local']</code>.
     */
    public final TableField<Record, Object> SETTINGS_5b_27GATEWAY_27_5d_5b_27LOCAL_27_5d = createField("settings['gateway']['local']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>information_schema.table_partitions.settings['gateway']['local']['sync']</code>.
     */
    public final TableField<Record, String> SETTINGS_5b_27GATEWAY_27_5d_5b_27LOCAL_27_5d_5b_27SYNC_27_5d = createField("settings['gateway']['local']['sync']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.table_partitions.settings['recovery']</code>.
     */
    public final TableField<Record, Object> SETTINGS_5b_27RECOVERY_27_5d = createField("settings['recovery']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>information_schema.table_partitions.settings['recovery']['initial_shards']</code>.
     */
    public final TableField<Record, String> SETTINGS_5b_27RECOVERY_27_5d_5b_27INITIAL_SHARDS_27_5d = createField("settings['recovery']['initial_shards']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.table_partitions.settings['routing']</code>.
     */
    public final TableField<Record, Object> SETTINGS_5b_27ROUTING_27_5d = createField("settings['routing']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>information_schema.table_partitions.settings['routing']['allocation']</code>.
     */
    public final TableField<Record, Object> SETTINGS_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d = createField("settings['routing']['allocation']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>information_schema.table_partitions.settings['routing']['allocation']['enable']</code>.
     */
    public final TableField<Record, String> SETTINGS_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27ENABLE_27_5d = createField("settings['routing']['allocation']['enable']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.table_partitions.settings['routing']['allocation']['total_shards_per_node']</code>.
     */
    public final TableField<Record, Integer> SETTINGS_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27TOTAL_SHARDS_PER_NODE_27_5d = createField("settings['routing']['allocation']['total_shards_per_node']", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.table_partitions.settings['translog']</code>.
     */
    public final TableField<Record, Object> SETTINGS_5b_27TRANSLOG_27_5d = createField("settings['translog']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>information_schema.table_partitions.settings['translog']['disable_flush']</code>.
     */
    public final TableField<Record, Boolean> SETTINGS_5b_27TRANSLOG_27_5d_5b_27DISABLE_FLUSH_27_5d = createField("settings['translog']['disable_flush']", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>information_schema.table_partitions.settings['translog']['flush_threshold_ops']</code>.
     */
    public final TableField<Record, Integer> SETTINGS_5b_27TRANSLOG_27_5d_5b_27FLUSH_THRESHOLD_OPS_27_5d = createField("settings['translog']['flush_threshold_ops']", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.table_partitions.settings['translog']['flush_threshold_period']</code>.
     */
    public final TableField<Record, Long> SETTINGS_5b_27TRANSLOG_27_5d_5b_27FLUSH_THRESHOLD_PERIOD_27_5d = createField("settings['translog']['flush_threshold_period']", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.table_partitions.settings['translog']['flush_threshold_size']</code>.
     */
    public final TableField<Record, Long> SETTINGS_5b_27TRANSLOG_27_5d_5b_27FLUSH_THRESHOLD_SIZE_27_5d = createField("settings['translog']['flush_threshold_size']", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.table_partitions.settings['translog']['interval']</code>.
     */
    public final TableField<Record, Long> SETTINGS_5b_27TRANSLOG_27_5d_5b_27INTERVAL_27_5d = createField("settings['translog']['interval']", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.table_partitions.settings['unassigned']</code>.
     */
    public final TableField<Record, Object> SETTINGS_5b_27UNASSIGNED_27_5d = createField("settings['unassigned']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>information_schema.table_partitions.settings['unassigned']['node_left']</code>.
     */
    public final TableField<Record, Object> SETTINGS_5b_27UNASSIGNED_27_5d_5b_27NODE_LEFT_27_5d = createField("settings['unassigned']['node_left']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>information_schema.table_partitions.settings['unassigned']['node_left']['delayed_timeout']</code>.
     */
    public final TableField<Record, Long> SETTINGS_5b_27UNASSIGNED_27_5d_5b_27NODE_LEFT_27_5d_5b_27DELAYED_TIMEOUT_27_5d = createField("settings['unassigned']['node_left']['delayed_timeout']", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.table_partitions.settings['warmer']</code>.
     */
    public final TableField<Record, Object> SETTINGS_5b_27WARMER_27_5d = createField("settings['warmer']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>information_schema.table_partitions.settings['warmer']['enabled']</code>.
     */
    public final TableField<Record, Boolean> SETTINGS_5b_27WARMER_27_5d_5b_27ENABLED_27_5d = createField("settings['warmer']['enabled']", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>information_schema.table_partitions.table_name</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.table_partitions.values</code>.
     */
    public final TableField<Record, Object> VALUES = createField("values", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * Create a <code>information_schema.table_partitions</code> table reference
     */
    public TablePartitions() {
        this("table_partitions", null);
    }

    /**
     * Create an aliased <code>information_schema.table_partitions</code> table reference
     */
    public TablePartitions(String alias) {
        this(alias, TABLE_PARTITIONS);
    }

    private TablePartitions(String alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private TablePartitions(String alias, Table<Record> aliased, Field<?>[] parameters) {
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
    public TablePartitions as(String alias) {
        return new TablePartitions(alias, this);
    }

    /**
     * Rename this table
     */
    public TablePartitions rename(String name) {
        return new TablePartitions(name, null);
    }
}