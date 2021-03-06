/**
 * This class is generated by jOOQ
 */
package projectdb.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Changelog extends org.jooq.impl.TableImpl<projectdb.tables.records.ChangelogRecord> {

	private static final long serialVersionUID = 1664535202;

	/**
	 * The singleton instance of <code>projectdb.changelog</code>
	 */
	public static final projectdb.tables.Changelog CHANGELOG = new projectdb.tables.Changelog();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<projectdb.tables.records.ChangelogRecord> getRecordType() {
		return projectdb.tables.records.ChangelogRecord.class;
	}

	/**
	 * The column <code>projectdb.changelog.id</code>.
	 */
	public final org.jooq.TableField<projectdb.tables.records.ChangelogRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>projectdb.changelog.tbl</code>.
	 */
	public final org.jooq.TableField<projectdb.tables.records.ChangelogRecord, java.lang.String> TBL = createField("tbl", org.jooq.impl.SQLDataType.VARCHAR.length(11).nullable(false), this, "");

	/**
	 * The column <code>projectdb.changelog.tbl_id</code>.
	 */
	public final org.jooq.TableField<projectdb.tables.records.ChangelogRecord, java.lang.Integer> TBL_ID = createField("tbl_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>projectdb.changelog.field</code>.
	 */
	public final org.jooq.TableField<projectdb.tables.records.ChangelogRecord, java.lang.String> FIELD = createField("field", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>projectdb.changelog.old_val</code>.
	 */
	public final org.jooq.TableField<projectdb.tables.records.ChangelogRecord, java.lang.String> OLD_VAL = createField("old_val", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>projectdb.changelog.new_val</code>.
	 */
	public final org.jooq.TableField<projectdb.tables.records.ChangelogRecord, java.lang.String> NEW_VAL = createField("new_val", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>projectdb.changelog.timestamp</code>.
	 */
	public final org.jooq.TableField<projectdb.tables.records.ChangelogRecord, java.sql.Timestamp> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>projectdb.changelog.adviserId</code>. adviser who performed this change
	 */
	public final org.jooq.TableField<projectdb.tables.records.ChangelogRecord, java.lang.Integer> ADVISERID = createField("adviserId", org.jooq.impl.SQLDataType.INTEGER, this, "adviser who performed this change");

	/**
	 * Create a <code>projectdb.changelog</code> table reference
	 */
	public Changelog() {
		this("changelog", null);
	}

	/**
	 * Create an aliased <code>projectdb.changelog</code> table reference
	 */
	public Changelog(java.lang.String alias) {
		this(alias, projectdb.tables.Changelog.CHANGELOG);
	}

	private Changelog(java.lang.String alias, org.jooq.Table<projectdb.tables.records.ChangelogRecord> aliased) {
		this(alias, aliased, null);
	}

	private Changelog(java.lang.String alias, org.jooq.Table<projectdb.tables.records.ChangelogRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, projectdb.Projectdb.PROJECTDB, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<projectdb.tables.records.ChangelogRecord, java.lang.Integer> getIdentity() {
		return projectdb.Keys.IDENTITY_CHANGELOG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<projectdb.tables.records.ChangelogRecord> getPrimaryKey() {
		return projectdb.Keys.KEY_CHANGELOG_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<projectdb.tables.records.ChangelogRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<projectdb.tables.records.ChangelogRecord>>asList(projectdb.Keys.KEY_CHANGELOG_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public projectdb.tables.Changelog as(java.lang.String alias) {
		return new projectdb.tables.Changelog(alias, this);
	}

	/**
	 * Rename this table
	 */
	public projectdb.tables.Changelog rename(java.lang.String name) {
		return new projectdb.tables.Changelog(name, null);
	}
}
