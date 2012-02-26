/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.dbo.tables;

/**
 * This class is generated by jOOQ.
 */
public class Errorlog extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorlogRecord> {

	private static final long serialVersionUID = -660834791;

	/**
	 * The singleton instance of dbo.ErrorLog
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.dbo.tables.Errorlog ERRORLOG = new org.jooq.examples.sqlserver.adventureworks.dbo.tables.Errorlog();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorlogRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorlogRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorlogRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorlogRecord, java.lang.Integer> ERRORLOGID = createField("ErrorLogID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorlogRecord, java.sql.Timestamp> ERRORTIME = createField("ErrorTime", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorlogRecord, java.lang.String> USERNAME = createField("UserName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorlogRecord, java.lang.Integer> ERRORNUMBER = createField("ErrorNumber", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorlogRecord, java.lang.Integer> ERRORSEVERITY = createField("ErrorSeverity", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorlogRecord, java.lang.Integer> ERRORSTATE = createField("ErrorState", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorlogRecord, java.lang.String> ERRORPROCEDURE = createField("ErrorProcedure", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorlogRecord, java.lang.Integer> ERRORLINE = createField("ErrorLine", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorlogRecord, java.lang.String> ERRORMESSAGE = createField("ErrorMessage", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * No further instances allowed
	 */
	private Errorlog() {
		super("ErrorLog", org.jooq.examples.sqlserver.adventureworks.dbo.Dbo.DBO);
	}

	/**
	 * No further instances allowed
	 */
	private Errorlog(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.dbo.Dbo.DBO, org.jooq.examples.sqlserver.adventureworks.dbo.tables.Errorlog.ERRORLOG);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorlogRecord, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.dbo.Keys.IDENTITY_ERRORLOG;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorlogRecord> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.dbo.Keys.PK_ERRORLOG_ERRORLOGID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorlogRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.dbo.tables.records.ErrorlogRecord>>asList(org.jooq.examples.sqlserver.adventureworks.dbo.Keys.PK_ERRORLOG_ERRORLOGID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.dbo.tables.Errorlog as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.dbo.tables.Errorlog(alias);
	}
}
