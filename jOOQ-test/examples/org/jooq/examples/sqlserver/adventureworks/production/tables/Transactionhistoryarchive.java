/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables;

/**
 * This class is generated by jOOQ.
 */
public class Transactionhistoryarchive extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionhistoryarchiveRecord> {

	private static final long serialVersionUID = -1380338636;

	/**
	 * The singleton instance of Production.TransactionHistoryArchive
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistoryarchive TRANSACTIONHISTORYARCHIVE = new org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistoryarchive();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionhistoryarchiveRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionhistoryarchiveRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionhistoryarchiveRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionhistoryarchiveRecord, java.lang.Integer> TRANSACTIONID = createField("TransactionID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionhistoryarchiveRecord, java.lang.Integer> PRODUCTID = createField("ProductID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionhistoryarchiveRecord, java.lang.Integer> REFERENCEORDERID = createField("ReferenceOrderID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionhistoryarchiveRecord, java.lang.Integer> REFERENCEORDERLINEID = createField("ReferenceOrderLineID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionhistoryarchiveRecord, java.sql.Timestamp> TRANSACTIONDATE = createField("TransactionDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionhistoryarchiveRecord, java.lang.String> TRANSACTIONTYPE = createField("TransactionType", org.jooq.impl.SQLDataType.NCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionhistoryarchiveRecord, java.lang.Integer> QUANTITY = createField("Quantity", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionhistoryarchiveRecord, java.math.BigDecimal> ACTUALCOST = createField("ActualCost", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionhistoryarchiveRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Transactionhistoryarchive() {
		super("TransactionHistoryArchive", org.jooq.examples.sqlserver.adventureworks.production.Production.PRODUCTION);
	}

	/**
	 * No further instances allowed
	 */
	private Transactionhistoryarchive(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.production.Production.PRODUCTION, org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistoryarchive.TRANSACTIONHISTORYARCHIVE);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionhistoryarchiveRecord> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_TRANSACTIONHISTORYARCHIVE_TRANSACTIONID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionhistoryarchiveRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionhistoryarchiveRecord>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_TRANSACTIONHISTORYARCHIVE_TRANSACTIONID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistoryarchive as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.production.tables.Transactionhistoryarchive(alias);
	}
}
