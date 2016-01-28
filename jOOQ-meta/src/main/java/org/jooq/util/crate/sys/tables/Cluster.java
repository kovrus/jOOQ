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
import org.jooq.util.crate.sys.tables.records.ClusterRecord;


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
public class Cluster extends TableImpl<ClusterRecord> {

    private static final long serialVersionUID = 393619361;

    /**
     * The reference instance of <code>sys.cluster</code>
     */
    public static final Cluster CLUSTER = new Cluster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClusterRecord> getRecordType() {
        return ClusterRecord.class;
    }

    /**
     * The column <code>sys.cluster.id</code>.
     */
    public final TableField<ClusterRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.master_node</code>.
     */
    public final TableField<ClusterRecord, String> MASTER_NODE = createField("master_node", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.name</code>.
     */
    public final TableField<ClusterRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings</code>.
     */
    public final TableField<ClusterRecord, Object> SETTINGS = createField("settings", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.cluster.settings['bulk']</code>.
     */
    public final TableField<ClusterRecord, Object> SETTINGS_5b_27BULK_27_5d = createField("settings['bulk']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.cluster.settings['bulk']['partition_creation_timeout']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27BULK_27_5d_5b_27PARTITION_CREATION_TIMEOUT_27_5d = createField("settings['bulk']['partition_creation_timeout']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['bulk']['request_timeout']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27BULK_27_5d_5b_27REQUEST_TIMEOUT_27_5d = createField("settings['bulk']['request_timeout']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']</code>.
     */
    public final TableField<ClusterRecord, Object> SETTINGS_5b_27CLUSTER_27_5d = createField("settings['cluster']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['graceful_stop']</code>.
     */
    public final TableField<ClusterRecord, Object> SETTINGS_5b_27CLUSTER_27_5d_5b_27GRACEFUL_STOP_27_5d = createField("settings['cluster']['graceful_stop']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['graceful_stop']['force']</code>.
     */
    public final TableField<ClusterRecord, Boolean> SETTINGS_5b_27CLUSTER_27_5d_5b_27GRACEFUL_STOP_27_5d_5b_27FORCE_27_5d = createField("settings['cluster']['graceful_stop']['force']", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['graceful_stop']['min_availability']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27CLUSTER_27_5d_5b_27GRACEFUL_STOP_27_5d_5b_27MIN_AVAILABILITY_27_5d = createField("settings['cluster']['graceful_stop']['min_availability']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['graceful_stop']['reallocate']</code>.
     */
    public final TableField<ClusterRecord, Boolean> SETTINGS_5b_27CLUSTER_27_5d_5b_27GRACEFUL_STOP_27_5d_5b_27REALLOCATE_27_5d = createField("settings['cluster']['graceful_stop']['reallocate']", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['graceful_stop']['timeout']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27CLUSTER_27_5d_5b_27GRACEFUL_STOP_27_5d_5b_27TIMEOUT_27_5d = createField("settings['cluster']['graceful_stop']['timeout']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['info']</code>.
     */
    public final TableField<ClusterRecord, Object> SETTINGS_5b_27CLUSTER_27_5d_5b_27INFO_27_5d = createField("settings['cluster']['info']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['info']['update']</code>.
     */
    public final TableField<ClusterRecord, Object> SETTINGS_5b_27CLUSTER_27_5d_5b_27INFO_27_5d_5b_27UPDATE_27_5d = createField("settings['cluster']['info']['update']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['info']['update']['interval']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27CLUSTER_27_5d_5b_27INFO_27_5d_5b_27UPDATE_27_5d_5b_27INTERVAL_27_5d = createField("settings['cluster']['info']['update']['interval']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']</code>.
     */
    public final TableField<ClusterRecord, Object> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d = createField("settings['cluster']['routing']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']['allocation']</code>.
     */
    public final TableField<ClusterRecord, Object> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d = createField("settings['cluster']['routing']['allocation']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']['allocation']['allow_rebalance']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27ALLOW_REBALANCE_27_5d = createField("settings['cluster']['routing']['allocation']['allow_rebalance']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']['allocation']['balance']</code>.
     */
    public final TableField<ClusterRecord, Object> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27BALANCE_27_5d = createField("settings['cluster']['routing']['allocation']['balance']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']['allocation']['balance']['index']</code>.
     */
    public final TableField<ClusterRecord, Float> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27BALANCE_27_5d_5b_27INDEX_27_5d = createField("settings['cluster']['routing']['allocation']['balance']['index']", org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']['allocation']['balance']['primary']</code>.
     */
    public final TableField<ClusterRecord, Float> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27BALANCE_27_5d_5b_27PRIMARY_27_5d = createField("settings['cluster']['routing']['allocation']['balance']['primary']", org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']['allocation']['balance']['shard']</code>.
     */
    public final TableField<ClusterRecord, Float> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27BALANCE_27_5d_5b_27SHARD_27_5d = createField("settings['cluster']['routing']['allocation']['balance']['shard']", org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']['allocation']['balance']['threshold']</code>.
     */
    public final TableField<ClusterRecord, Float> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27BALANCE_27_5d_5b_27THRESHOLD_27_5d = createField("settings['cluster']['routing']['allocation']['balance']['threshold']", org.jooq.impl.SQLDataType.REAL, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']['allocation']['cluster_concurrent_rebalance']</code>.
     */
    public final TableField<ClusterRecord, Integer> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27CLUSTER_CONCURRENT_REBALANCE_27_5d = createField("settings['cluster']['routing']['allocation']['cluster_concurrent_rebalance']", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']['allocation']['disk']</code>.
     */
    public final TableField<ClusterRecord, Object> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27DISK_27_5d = createField("settings['cluster']['routing']['allocation']['disk']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']['allocation']['disk']['threshold_enabled']</code>.
     */
    public final TableField<ClusterRecord, Boolean> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27DISK_27_5d_5b_27THRESHOLD_ENABLED_27_5d = createField("settings['cluster']['routing']['allocation']['disk']['threshold_enabled']", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']['allocation']['disk']['watermark']</code>.
     */
    public final TableField<ClusterRecord, Object> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27DISK_27_5d_5b_27WATERMARK_27_5d = createField("settings['cluster']['routing']['allocation']['disk']['watermark']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']['allocation']['disk']['watermark']['high']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27DISK_27_5d_5b_27WATERMARK_27_5d_5b_27HIGH_27_5d = createField("settings['cluster']['routing']['allocation']['disk']['watermark']['high']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']['allocation']['disk']['watermark']['low']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27DISK_27_5d_5b_27WATERMARK_27_5d_5b_27LOW_27_5d = createField("settings['cluster']['routing']['allocation']['disk']['watermark']['low']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']['allocation']['enable']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27ENABLE_27_5d = createField("settings['cluster']['routing']['allocation']['enable']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']['allocation']['exclude']</code>.
     */
    public final TableField<ClusterRecord, Object> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27EXCLUDE_27_5d = createField("settings['cluster']['routing']['allocation']['exclude']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']['allocation']['exclude']['_host']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27EXCLUDE_27_5d_5b_27_HOST_27_5d = createField("settings['cluster']['routing']['allocation']['exclude']['_host']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']['allocation']['exclude']['_id']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27EXCLUDE_27_5d_5b_27_ID_27_5d = createField("settings['cluster']['routing']['allocation']['exclude']['_id']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']['allocation']['exclude']['_ip']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27EXCLUDE_27_5d_5b_27_IP_27_5d = createField("settings['cluster']['routing']['allocation']['exclude']['_ip']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']['allocation']['exclude']['_name']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27EXCLUDE_27_5d_5b_27_NAME_27_5d = createField("settings['cluster']['routing']['allocation']['exclude']['_name']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']['allocation']['include']</code>.
     */
    public final TableField<ClusterRecord, Object> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27INCLUDE_27_5d = createField("settings['cluster']['routing']['allocation']['include']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']['allocation']['include']['_host']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27INCLUDE_27_5d_5b_27_HOST_27_5d = createField("settings['cluster']['routing']['allocation']['include']['_host']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']['allocation']['include']['_id']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27INCLUDE_27_5d_5b_27_ID_27_5d = createField("settings['cluster']['routing']['allocation']['include']['_id']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']['allocation']['include']['_ip']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27INCLUDE_27_5d_5b_27_IP_27_5d = createField("settings['cluster']['routing']['allocation']['include']['_ip']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']['allocation']['include']['_name']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27INCLUDE_27_5d_5b_27_NAME_27_5d = createField("settings['cluster']['routing']['allocation']['include']['_name']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']['allocation']['node_concurrent_recoveries']</code>.
     */
    public final TableField<ClusterRecord, Integer> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27NODE_CONCURRENT_RECOVERIES_27_5d = createField("settings['cluster']['routing']['allocation']['node_concurrent_recoveries']", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']['allocation']['node_initial_primaries_recoveries']</code>.
     */
    public final TableField<ClusterRecord, Integer> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27NODE_INITIAL_PRIMARIES_RECOVERIES_27_5d = createField("settings['cluster']['routing']['allocation']['node_initial_primaries_recoveries']", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']['allocation']['require']</code>.
     */
    public final TableField<ClusterRecord, Object> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27REQUIRE_27_5d = createField("settings['cluster']['routing']['allocation']['require']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']['allocation']['require']['_host']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27REQUIRE_27_5d_5b_27_HOST_27_5d = createField("settings['cluster']['routing']['allocation']['require']['_host']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']['allocation']['require']['_id']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27REQUIRE_27_5d_5b_27_ID_27_5d = createField("settings['cluster']['routing']['allocation']['require']['_id']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']['allocation']['require']['_ip']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27REQUIRE_27_5d_5b_27_IP_27_5d = createField("settings['cluster']['routing']['allocation']['require']['_ip']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['cluster']['routing']['allocation']['require']['_name']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27CLUSTER_27_5d_5b_27ROUTING_27_5d_5b_27ALLOCATION_27_5d_5b_27REQUIRE_27_5d_5b_27_NAME_27_5d = createField("settings['cluster']['routing']['allocation']['require']['_name']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['discovery']</code>.
     */
    public final TableField<ClusterRecord, Object> SETTINGS_5b_27DISCOVERY_27_5d = createField("settings['discovery']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.cluster.settings['discovery']['zen']</code>.
     */
    public final TableField<ClusterRecord, Object> SETTINGS_5b_27DISCOVERY_27_5d_5b_27ZEN_27_5d = createField("settings['discovery']['zen']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.cluster.settings['discovery']['zen']['minimum_master_nodes']</code>.
     */
    public final TableField<ClusterRecord, Integer> SETTINGS_5b_27DISCOVERY_27_5d_5b_27ZEN_27_5d_5b_27MINIMUM_MASTER_NODES_27_5d = createField("settings['discovery']['zen']['minimum_master_nodes']", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>sys.cluster.settings['discovery']['zen']['ping_timeout']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27DISCOVERY_27_5d_5b_27ZEN_27_5d_5b_27PING_TIMEOUT_27_5d = createField("settings['discovery']['zen']['ping_timeout']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['discovery']['zen']['publish_timeout']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27DISCOVERY_27_5d_5b_27ZEN_27_5d_5b_27PUBLISH_TIMEOUT_27_5d = createField("settings['discovery']['zen']['publish_timeout']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['gateway']</code>.
     */
    public final TableField<ClusterRecord, Object> SETTINGS_5b_27GATEWAY_27_5d = createField("settings['gateway']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.cluster.settings['gateway']['expected_nodes']</code>.
     */
    public final TableField<ClusterRecord, Integer> SETTINGS_5b_27GATEWAY_27_5d_5b_27EXPECTED_NODES_27_5d = createField("settings['gateway']['expected_nodes']", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>sys.cluster.settings['gateway']['recover_after_nodes']</code>.
     */
    public final TableField<ClusterRecord, Integer> SETTINGS_5b_27GATEWAY_27_5d_5b_27RECOVER_AFTER_NODES_27_5d = createField("settings['gateway']['recover_after_nodes']", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>sys.cluster.settings['gateway']['recover_after_time']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27GATEWAY_27_5d_5b_27RECOVER_AFTER_TIME_27_5d = createField("settings['gateway']['recover_after_time']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['indices']</code>.
     */
    public final TableField<ClusterRecord, Object> SETTINGS_5b_27INDICES_27_5d = createField("settings['indices']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.cluster.settings['indices']['breaker']</code>.
     */
    public final TableField<ClusterRecord, Object> SETTINGS_5b_27INDICES_27_5d_5b_27BREAKER_27_5d = createField("settings['indices']['breaker']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.cluster.settings['indices']['breaker']['query']</code>.
     */
    public final TableField<ClusterRecord, Object> SETTINGS_5b_27INDICES_27_5d_5b_27BREAKER_27_5d_5b_27QUERY_27_5d = createField("settings['indices']['breaker']['query']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.cluster.settings['indices']['breaker']['query']['limit']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27INDICES_27_5d_5b_27BREAKER_27_5d_5b_27QUERY_27_5d_5b_27LIMIT_27_5d = createField("settings['indices']['breaker']['query']['limit']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['indices']['breaker']['query']['overhead']</code>.
     */
    public final TableField<ClusterRecord, Double> SETTINGS_5b_27INDICES_27_5d_5b_27BREAKER_27_5d_5b_27QUERY_27_5d_5b_27OVERHEAD_27_5d = createField("settings['indices']['breaker']['query']['overhead']", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>sys.cluster.settings['indices']['breaker']['request']</code>.
     */
    public final TableField<ClusterRecord, Object> SETTINGS_5b_27INDICES_27_5d_5b_27BREAKER_27_5d_5b_27REQUEST_27_5d = createField("settings['indices']['breaker']['request']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.cluster.settings['indices']['breaker']['request']['limit']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27INDICES_27_5d_5b_27BREAKER_27_5d_5b_27REQUEST_27_5d_5b_27LIMIT_27_5d = createField("settings['indices']['breaker']['request']['limit']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['indices']['breaker']['request']['overhead']</code>.
     */
    public final TableField<ClusterRecord, Double> SETTINGS_5b_27INDICES_27_5d_5b_27BREAKER_27_5d_5b_27REQUEST_27_5d_5b_27OVERHEAD_27_5d = createField("settings['indices']['breaker']['request']['overhead']", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>sys.cluster.settings['indices']['fielddata']</code>.
     */
    public final TableField<ClusterRecord, Object> SETTINGS_5b_27INDICES_27_5d_5b_27FIELDDATA_27_5d = createField("settings['indices']['fielddata']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.cluster.settings['indices']['fielddata']['breaker']</code>.
     */
    public final TableField<ClusterRecord, Object> SETTINGS_5b_27INDICES_27_5d_5b_27FIELDDATA_27_5d_5b_27BREAKER_27_5d = createField("settings['indices']['fielddata']['breaker']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.cluster.settings['indices']['fielddata']['breaker']['limit']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27INDICES_27_5d_5b_27FIELDDATA_27_5d_5b_27BREAKER_27_5d_5b_27LIMIT_27_5d = createField("settings['indices']['fielddata']['breaker']['limit']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['indices']['fielddata']['breaker']['overhead']</code>.
     */
    public final TableField<ClusterRecord, Double> SETTINGS_5b_27INDICES_27_5d_5b_27FIELDDATA_27_5d_5b_27BREAKER_27_5d_5b_27OVERHEAD_27_5d = createField("settings['indices']['fielddata']['breaker']['overhead']", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>sys.cluster.settings['indices']['recovery']</code>.
     */
    public final TableField<ClusterRecord, Object> SETTINGS_5b_27INDICES_27_5d_5b_27RECOVERY_27_5d = createField("settings['indices']['recovery']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.cluster.settings['indices']['recovery']['activity_timeout']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27INDICES_27_5d_5b_27RECOVERY_27_5d_5b_27ACTIVITY_TIMEOUT_27_5d = createField("settings['indices']['recovery']['activity_timeout']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['indices']['recovery']['compress']</code>.
     */
    public final TableField<ClusterRecord, Boolean> SETTINGS_5b_27INDICES_27_5d_5b_27RECOVERY_27_5d_5b_27COMPRESS_27_5d = createField("settings['indices']['recovery']['compress']", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>sys.cluster.settings['indices']['recovery']['concurrent_streams']</code>.
     */
    public final TableField<ClusterRecord, Integer> SETTINGS_5b_27INDICES_27_5d_5b_27RECOVERY_27_5d_5b_27CONCURRENT_STREAMS_27_5d = createField("settings['indices']['recovery']['concurrent_streams']", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>sys.cluster.settings['indices']['recovery']['file_chunk_size']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27INDICES_27_5d_5b_27RECOVERY_27_5d_5b_27FILE_CHUNK_SIZE_27_5d = createField("settings['indices']['recovery']['file_chunk_size']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['indices']['recovery']['internal_action_long_timeout']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27INDICES_27_5d_5b_27RECOVERY_27_5d_5b_27INTERNAL_ACTION_LONG_TIMEOUT_27_5d = createField("settings['indices']['recovery']['internal_action_long_timeout']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['indices']['recovery']['internal_action_timeout']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27INDICES_27_5d_5b_27RECOVERY_27_5d_5b_27INTERNAL_ACTION_TIMEOUT_27_5d = createField("settings['indices']['recovery']['internal_action_timeout']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['indices']['recovery']['max_bytes_per_sec']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27INDICES_27_5d_5b_27RECOVERY_27_5d_5b_27MAX_BYTES_PER_SEC_27_5d = createField("settings['indices']['recovery']['max_bytes_per_sec']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['indices']['recovery']['retry_delay_network']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27INDICES_27_5d_5b_27RECOVERY_27_5d_5b_27RETRY_DELAY_NETWORK_27_5d = createField("settings['indices']['recovery']['retry_delay_network']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['indices']['recovery']['retry_delay_state_sync']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27INDICES_27_5d_5b_27RECOVERY_27_5d_5b_27RETRY_DELAY_STATE_SYNC_27_5d = createField("settings['indices']['recovery']['retry_delay_state_sync']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['indices']['recovery']['translog_ops']</code>.
     */
    public final TableField<ClusterRecord, Integer> SETTINGS_5b_27INDICES_27_5d_5b_27RECOVERY_27_5d_5b_27TRANSLOG_OPS_27_5d = createField("settings['indices']['recovery']['translog_ops']", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>sys.cluster.settings['indices']['recovery']['translog_size']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27INDICES_27_5d_5b_27RECOVERY_27_5d_5b_27TRANSLOG_SIZE_27_5d = createField("settings['indices']['recovery']['translog_size']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['indices']['store']</code>.
     */
    public final TableField<ClusterRecord, Object> SETTINGS_5b_27INDICES_27_5d_5b_27STORE_27_5d = createField("settings['indices']['store']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.cluster.settings['indices']['store']['throttle']</code>.
     */
    public final TableField<ClusterRecord, Object> SETTINGS_5b_27INDICES_27_5d_5b_27STORE_27_5d_5b_27THROTTLE_27_5d = createField("settings['indices']['store']['throttle']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.cluster.settings['indices']['store']['throttle']['max_bytes_per_sec']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27INDICES_27_5d_5b_27STORE_27_5d_5b_27THROTTLE_27_5d_5b_27MAX_BYTES_PER_SEC_27_5d = createField("settings['indices']['store']['throttle']['max_bytes_per_sec']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['indices']['store']['throttle']['type']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27INDICES_27_5d_5b_27STORE_27_5d_5b_27THROTTLE_27_5d_5b_27TYPE_27_5d = createField("settings['indices']['store']['throttle']['type']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['stats']</code>.
     */
    public final TableField<ClusterRecord, Object> SETTINGS_5b_27STATS_27_5d = createField("settings['stats']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.cluster.settings['stats']['enabled']</code>.
     */
    public final TableField<ClusterRecord, Boolean> SETTINGS_5b_27STATS_27_5d_5b_27ENABLED_27_5d = createField("settings['stats']['enabled']", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>sys.cluster.settings['stats']['jobs_log_size']</code>.
     */
    public final TableField<ClusterRecord, Integer> SETTINGS_5b_27STATS_27_5d_5b_27JOBS_LOG_SIZE_27_5d = createField("settings['stats']['jobs_log_size']", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>sys.cluster.settings['stats']['operations_log_size']</code>.
     */
    public final TableField<ClusterRecord, Integer> SETTINGS_5b_27STATS_27_5d_5b_27OPERATIONS_LOG_SIZE_27_5d = createField("settings['stats']['operations_log_size']", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>sys.cluster.settings['udc']</code>.
     */
    public final TableField<ClusterRecord, Object> SETTINGS_5b_27UDC_27_5d = createField("settings['udc']", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * The column <code>sys.cluster.settings['udc']['enabled']</code>.
     */
    public final TableField<ClusterRecord, Boolean> SETTINGS_5b_27UDC_27_5d_5b_27ENABLED_27_5d = createField("settings['udc']['enabled']", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>sys.cluster.settings['udc']['initial_delay']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27UDC_27_5d_5b_27INITIAL_DELAY_27_5d = createField("settings['udc']['initial_delay']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['udc']['interval']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27UDC_27_5d_5b_27INTERVAL_27_5d = createField("settings['udc']['interval']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>sys.cluster.settings['udc']['url']</code>.
     */
    public final TableField<ClusterRecord, String> SETTINGS_5b_27UDC_27_5d_5b_27URL_27_5d = createField("settings['udc']['url']", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>sys.cluster</code> table reference
     */
    public Cluster() {
        this("cluster", null);
    }

    /**
     * Create an aliased <code>sys.cluster</code> table reference
     */
    public Cluster(String alias) {
        this(alias, CLUSTER);
    }

    private Cluster(String alias, Table<ClusterRecord> aliased) {
        this(alias, aliased, null);
    }

    private Cluster(String alias, Table<ClusterRecord> aliased, Field<?>[] parameters) {
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
    public Cluster as(String alias) {
        return new Cluster(alias, this);
    }

    /**
     * Rename this table
     */
    public Cluster rename(String name) {
        return new Cluster(name, null);
    }
}
