/**
 * This class is generated by jOOQ
 */
package org.jooq.util.crate.information_schema.tables.records;


import javax.annotation.Generated;

import org.jooq.impl.TableRecordImpl;
import org.jooq.util.crate.information_schema.tables.TablePartitions;


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
public class TablePartitionsRecord extends TableRecordImpl<TablePartitionsRecord> {

    private static final long serialVersionUID = 2146704923;

    /**
     * Setter for <code>information_schema.table_partitions.number_of_replicas</code>.
     */
    public void setNumberOfReplicas(String value) {
        setValue(0, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.number_of_replicas</code>.
     */
    public String getNumberOfReplicas() {
        return (String) getValue(0);
    }

    /**
     * Setter for <code>information_schema.table_partitions.number_of_shards</code>.
     */
    public void setNumberOfShards(Integer value) {
        setValue(1, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.number_of_shards</code>.
     */
    public Integer getNumberOfShards() {
        return (Integer) getValue(1);
    }

    /**
     * Setter for <code>information_schema.table_partitions.partition_ident</code>.
     */
    public void setPartitionIdent(String value) {
        setValue(2, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.partition_ident</code>.
     */
    public String getPartitionIdent() {
        return (String) getValue(2);
    }

    /**
     * Setter for <code>information_schema.table_partitions.schema_name</code>.
     */
    public void setSchemaName(String value) {
        setValue(3, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.schema_name</code>.
     */
    public String getSchemaName() {
        return (String) getValue(3);
    }

    /**
     * Setter for <code>information_schema.table_partitions.settings</code>.
     */
    public void setSettings(Object value) {
        setValue(4, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.settings</code>.
     */
    public Object getSettings() {
        return (Object) getValue(4);
    }

    /**
     * Setter for <code>information_schema.table_partitions.settings['blocks']</code>.
     */
    public void setSettings_5b_27blocks_27_5d(Object value) {
        setValue(5, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.settings['blocks']</code>.
     */
    public Object getSettings_5b_27blocks_27_5d() {
        return (Object) getValue(5);
    }

    /**
     * Setter for <code>information_schema.table_partitions.settings['blocks']['metadata']</code>.
     */
    public void setSettings_5b_27blocks_27_5d_5b_27metadata_27_5d(Boolean value) {
        setValue(6, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.settings['blocks']['metadata']</code>.
     */
    public Boolean getSettings_5b_27blocks_27_5d_5b_27metadata_27_5d() {
        return (Boolean) getValue(6);
    }

    /**
     * Setter for <code>information_schema.table_partitions.settings['blocks']['read']</code>.
     */
    public void setSettings_5b_27blocks_27_5d_5b_27read_27_5d(Boolean value) {
        setValue(7, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.settings['blocks']['read']</code>.
     */
    public Boolean getSettings_5b_27blocks_27_5d_5b_27read_27_5d() {
        return (Boolean) getValue(7);
    }

    /**
     * Setter for <code>information_schema.table_partitions.settings['blocks']['read_only']</code>.
     */
    public void setSettings_5b_27blocks_27_5d_5b_27readOnly_27_5d(Boolean value) {
        setValue(8, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.settings['blocks']['read_only']</code>.
     */
    public Boolean getSettings_5b_27blocks_27_5d_5b_27readOnly_27_5d() {
        return (Boolean) getValue(8);
    }

    /**
     * Setter for <code>information_schema.table_partitions.settings['blocks']['write']</code>.
     */
    public void setSettings_5b_27blocks_27_5d_5b_27write_27_5d(Boolean value) {
        setValue(9, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.settings['blocks']['write']</code>.
     */
    public Boolean getSettings_5b_27blocks_27_5d_5b_27write_27_5d() {
        return (Boolean) getValue(9);
    }

    /**
     * Setter for <code>information_schema.table_partitions.settings['gateway']</code>.
     */
    public void setSettings_5b_27gateway_27_5d(Object value) {
        setValue(10, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.settings['gateway']</code>.
     */
    public Object getSettings_5b_27gateway_27_5d() {
        return (Object) getValue(10);
    }

    /**
     * Setter for <code>information_schema.table_partitions.settings['gateway']['local']</code>.
     */
    public void setSettings_5b_27gateway_27_5d_5b_27local_27_5d(Object value) {
        setValue(11, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.settings['gateway']['local']</code>.
     */
    public Object getSettings_5b_27gateway_27_5d_5b_27local_27_5d() {
        return (Object) getValue(11);
    }

    /**
     * Setter for <code>information_schema.table_partitions.settings['gateway']['local']['sync']</code>.
     */
    public void setSettings_5b_27gateway_27_5d_5b_27local_27_5d_5b_27sync_27_5d(String value) {
        setValue(12, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.settings['gateway']['local']['sync']</code>.
     */
    public String getSettings_5b_27gateway_27_5d_5b_27local_27_5d_5b_27sync_27_5d() {
        return (String) getValue(12);
    }

    /**
     * Setter for <code>information_schema.table_partitions.settings['recovery']</code>.
     */
    public void setSettings_5b_27recovery_27_5d(Object value) {
        setValue(13, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.settings['recovery']</code>.
     */
    public Object getSettings_5b_27recovery_27_5d() {
        return (Object) getValue(13);
    }

    /**
     * Setter for <code>information_schema.table_partitions.settings['recovery']['initial_shards']</code>.
     */
    public void setSettings_5b_27recovery_27_5d_5b_27initialShards_27_5d(String value) {
        setValue(14, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.settings['recovery']['initial_shards']</code>.
     */
    public String getSettings_5b_27recovery_27_5d_5b_27initialShards_27_5d() {
        return (String) getValue(14);
    }

    /**
     * Setter for <code>information_schema.table_partitions.settings['routing']</code>.
     */
    public void setSettings_5b_27routing_27_5d(Object value) {
        setValue(15, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.settings['routing']</code>.
     */
    public Object getSettings_5b_27routing_27_5d() {
        return (Object) getValue(15);
    }

    /**
     * Setter for <code>information_schema.table_partitions.settings['routing']['allocation']</code>.
     */
    public void setSettings_5b_27routing_27_5d_5b_27allocation_27_5d(Object value) {
        setValue(16, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.settings['routing']['allocation']</code>.
     */
    public Object getSettings_5b_27routing_27_5d_5b_27allocation_27_5d() {
        return (Object) getValue(16);
    }

    /**
     * Setter for <code>information_schema.table_partitions.settings['routing']['allocation']['enable']</code>.
     */
    public void setSettings_5b_27routing_27_5d_5b_27allocation_27_5d_5b_27enable_27_5d(String value) {
        setValue(17, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.settings['routing']['allocation']['enable']</code>.
     */
    public String getSettings_5b_27routing_27_5d_5b_27allocation_27_5d_5b_27enable_27_5d() {
        return (String) getValue(17);
    }

    /**
     * Setter for <code>information_schema.table_partitions.settings['routing']['allocation']['total_shards_per_node']</code>.
     */
    public void setSettings_5b_27routing_27_5d_5b_27allocation_27_5d_5b_27totalShardsPerNode_27_5d(Integer value) {
        setValue(18, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.settings['routing']['allocation']['total_shards_per_node']</code>.
     */
    public Integer getSettings_5b_27routing_27_5d_5b_27allocation_27_5d_5b_27totalShardsPerNode_27_5d() {
        return (Integer) getValue(18);
    }

    /**
     * Setter for <code>information_schema.table_partitions.settings['translog']</code>.
     */
    public void setSettings_5b_27translog_27_5d(Object value) {
        setValue(19, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.settings['translog']</code>.
     */
    public Object getSettings_5b_27translog_27_5d() {
        return (Object) getValue(19);
    }

    /**
     * Setter for <code>information_schema.table_partitions.settings['translog']['disable_flush']</code>.
     */
    public void setSettings_5b_27translog_27_5d_5b_27disableFlush_27_5d(Boolean value) {
        setValue(20, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.settings['translog']['disable_flush']</code>.
     */
    public Boolean getSettings_5b_27translog_27_5d_5b_27disableFlush_27_5d() {
        return (Boolean) getValue(20);
    }

    /**
     * Setter for <code>information_schema.table_partitions.settings['translog']['flush_threshold_ops']</code>.
     */
    public void setSettings_5b_27translog_27_5d_5b_27flushThresholdOps_27_5d(Integer value) {
        setValue(21, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.settings['translog']['flush_threshold_ops']</code>.
     */
    public Integer getSettings_5b_27translog_27_5d_5b_27flushThresholdOps_27_5d() {
        return (Integer) getValue(21);
    }

    /**
     * Setter for <code>information_schema.table_partitions.settings['translog']['flush_threshold_period']</code>.
     */
    public void setSettings_5b_27translog_27_5d_5b_27flushThresholdPeriod_27_5d(Long value) {
        setValue(22, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.settings['translog']['flush_threshold_period']</code>.
     */
    public Long getSettings_5b_27translog_27_5d_5b_27flushThresholdPeriod_27_5d() {
        return (Long) getValue(22);
    }

    /**
     * Setter for <code>information_schema.table_partitions.settings['translog']['flush_threshold_size']</code>.
     */
    public void setSettings_5b_27translog_27_5d_5b_27flushThresholdSize_27_5d(Long value) {
        setValue(23, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.settings['translog']['flush_threshold_size']</code>.
     */
    public Long getSettings_5b_27translog_27_5d_5b_27flushThresholdSize_27_5d() {
        return (Long) getValue(23);
    }

    /**
     * Setter for <code>information_schema.table_partitions.settings['translog']['interval']</code>.
     */
    public void setSettings_5b_27translog_27_5d_5b_27interval_27_5d(Long value) {
        setValue(24, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.settings['translog']['interval']</code>.
     */
    public Long getSettings_5b_27translog_27_5d_5b_27interval_27_5d() {
        return (Long) getValue(24);
    }

    /**
     * Setter for <code>information_schema.table_partitions.settings['unassigned']</code>.
     */
    public void setSettings_5b_27unassigned_27_5d(Object value) {
        setValue(25, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.settings['unassigned']</code>.
     */
    public Object getSettings_5b_27unassigned_27_5d() {
        return (Object) getValue(25);
    }

    /**
     * Setter for <code>information_schema.table_partitions.settings['unassigned']['node_left']</code>.
     */
    public void setSettings_5b_27unassigned_27_5d_5b_27nodeLeft_27_5d(Object value) {
        setValue(26, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.settings['unassigned']['node_left']</code>.
     */
    public Object getSettings_5b_27unassigned_27_5d_5b_27nodeLeft_27_5d() {
        return (Object) getValue(26);
    }

    /**
     * Setter for <code>information_schema.table_partitions.settings['unassigned']['node_left']['delayed_timeout']</code>.
     */
    public void setSettings_5b_27unassigned_27_5d_5b_27nodeLeft_27_5d_5b_27delayedTimeout_27_5d(Long value) {
        setValue(27, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.settings['unassigned']['node_left']['delayed_timeout']</code>.
     */
    public Long getSettings_5b_27unassigned_27_5d_5b_27nodeLeft_27_5d_5b_27delayedTimeout_27_5d() {
        return (Long) getValue(27);
    }

    /**
     * Setter for <code>information_schema.table_partitions.settings['warmer']</code>.
     */
    public void setSettings_5b_27warmer_27_5d(Object value) {
        setValue(28, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.settings['warmer']</code>.
     */
    public Object getSettings_5b_27warmer_27_5d() {
        return (Object) getValue(28);
    }

    /**
     * Setter for <code>information_schema.table_partitions.settings['warmer']['enabled']</code>.
     */
    public void setSettings_5b_27warmer_27_5d_5b_27enabled_27_5d(Boolean value) {
        setValue(29, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.settings['warmer']['enabled']</code>.
     */
    public Boolean getSettings_5b_27warmer_27_5d_5b_27enabled_27_5d() {
        return (Boolean) getValue(29);
    }

    /**
     * Setter for <code>information_schema.table_partitions.table_name</code>.
     */
    public void setTableName(String value) {
        setValue(30, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.table_name</code>.
     */
    public String getTableName() {
        return (String) getValue(30);
    }

    /**
     * Setter for <code>information_schema.table_partitions.values</code>.
     */
    public void setValues(Object value) {
        setValue(31, value);
    }

    /**
     * Getter for <code>information_schema.table_partitions.values</code>.
     */
    public Object getValues() {
        return (Object) getValue(31);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TablePartitionsRecord
     */
    public TablePartitionsRecord() {
        super(TablePartitions.TABLE_PARTITIONS);
    }

    /**
     * Create a detached, initialised TablePartitionsRecord
     */
    public TablePartitionsRecord(String numberOfReplicas, Integer numberOfShards, String partitionIdent, String schemaName, Object settings, Object settings_5b_27blocks_27_5d, Boolean settings_5b_27blocks_27_5d_5b_27metadata_27_5d, Boolean settings_5b_27blocks_27_5d_5b_27read_27_5d, Boolean settings_5b_27blocks_27_5d_5b_27readOnly_27_5d, Boolean settings_5b_27blocks_27_5d_5b_27write_27_5d, Object settings_5b_27gateway_27_5d, Object settings_5b_27gateway_27_5d_5b_27local_27_5d, String settings_5b_27gateway_27_5d_5b_27local_27_5d_5b_27sync_27_5d, Object settings_5b_27recovery_27_5d, String settings_5b_27recovery_27_5d_5b_27initialShards_27_5d, Object settings_5b_27routing_27_5d, Object settings_5b_27routing_27_5d_5b_27allocation_27_5d, String settings_5b_27routing_27_5d_5b_27allocation_27_5d_5b_27enable_27_5d, Integer settings_5b_27routing_27_5d_5b_27allocation_27_5d_5b_27totalShardsPerNode_27_5d, Object settings_5b_27translog_27_5d, Boolean settings_5b_27translog_27_5d_5b_27disableFlush_27_5d, Integer settings_5b_27translog_27_5d_5b_27flushThresholdOps_27_5d, Long settings_5b_27translog_27_5d_5b_27flushThresholdPeriod_27_5d, Long settings_5b_27translog_27_5d_5b_27flushThresholdSize_27_5d, Long settings_5b_27translog_27_5d_5b_27interval_27_5d, Object settings_5b_27unassigned_27_5d, Object settings_5b_27unassigned_27_5d_5b_27nodeLeft_27_5d, Long settings_5b_27unassigned_27_5d_5b_27nodeLeft_27_5d_5b_27delayedTimeout_27_5d, Object settings_5b_27warmer_27_5d, Boolean settings_5b_27warmer_27_5d_5b_27enabled_27_5d, String tableName, Object values) {
        super(TablePartitions.TABLE_PARTITIONS);

        setValue(0, numberOfReplicas);
        setValue(1, numberOfShards);
        setValue(2, partitionIdent);
        setValue(3, schemaName);
        setValue(4, settings);
        setValue(5, settings_5b_27blocks_27_5d);
        setValue(6, settings_5b_27blocks_27_5d_5b_27metadata_27_5d);
        setValue(7, settings_5b_27blocks_27_5d_5b_27read_27_5d);
        setValue(8, settings_5b_27blocks_27_5d_5b_27readOnly_27_5d);
        setValue(9, settings_5b_27blocks_27_5d_5b_27write_27_5d);
        setValue(10, settings_5b_27gateway_27_5d);
        setValue(11, settings_5b_27gateway_27_5d_5b_27local_27_5d);
        setValue(12, settings_5b_27gateway_27_5d_5b_27local_27_5d_5b_27sync_27_5d);
        setValue(13, settings_5b_27recovery_27_5d);
        setValue(14, settings_5b_27recovery_27_5d_5b_27initialShards_27_5d);
        setValue(15, settings_5b_27routing_27_5d);
        setValue(16, settings_5b_27routing_27_5d_5b_27allocation_27_5d);
        setValue(17, settings_5b_27routing_27_5d_5b_27allocation_27_5d_5b_27enable_27_5d);
        setValue(18, settings_5b_27routing_27_5d_5b_27allocation_27_5d_5b_27totalShardsPerNode_27_5d);
        setValue(19, settings_5b_27translog_27_5d);
        setValue(20, settings_5b_27translog_27_5d_5b_27disableFlush_27_5d);
        setValue(21, settings_5b_27translog_27_5d_5b_27flushThresholdOps_27_5d);
        setValue(22, settings_5b_27translog_27_5d_5b_27flushThresholdPeriod_27_5d);
        setValue(23, settings_5b_27translog_27_5d_5b_27flushThresholdSize_27_5d);
        setValue(24, settings_5b_27translog_27_5d_5b_27interval_27_5d);
        setValue(25, settings_5b_27unassigned_27_5d);
        setValue(26, settings_5b_27unassigned_27_5d_5b_27nodeLeft_27_5d);
        setValue(27, settings_5b_27unassigned_27_5d_5b_27nodeLeft_27_5d_5b_27delayedTimeout_27_5d);
        setValue(28, settings_5b_27warmer_27_5d);
        setValue(29, settings_5b_27warmer_27_5d_5b_27enabled_27_5d);
        setValue(30, tableName);
        setValue(31, values);
    }
}
