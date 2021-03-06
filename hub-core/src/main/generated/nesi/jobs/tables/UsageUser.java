/**
 * This class is generated by jOOQ
 */
package nesi.jobs.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UsageUser extends org.jooq.impl.TableImpl<nesi.jobs.tables.records.UsageUserRecord> {

	private static final long serialVersionUID = 510355098;

	/**
	 * The singleton instance of <code>public.usage_user</code>
	 */
	public static final nesi.jobs.tables.UsageUser USAGE_USER = new nesi.jobs.tables.UsageUser();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<nesi.jobs.tables.records.UsageUserRecord> getRecordType() {
		return nesi.jobs.tables.records.UsageUserRecord.class;
	}

	/**
	 * The column <code>public.usage_user.username</code>.
	 */
	public final org.jooq.TableField<nesi.jobs.tables.records.UsageUserRecord, java.lang.String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>public.usage_user.last_query_date</code>.
	 */
	public final org.jooq.TableField<nesi.jobs.tables.records.UsageUserRecord, java.sql.Timestamp> LAST_QUERY_DATE = createField("last_query_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

	/**
	 * The column <code>public.usage_user.total_usage</code>.
	 */
	public final org.jooq.TableField<nesi.jobs.tables.records.UsageUserRecord, java.lang.Long> TOTAL_USAGE = createField("total_usage", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>public.usage_user.total_jobs</code>.
	 */
	public final org.jooq.TableField<nesi.jobs.tables.records.UsageUserRecord, java.lang.Long> TOTAL_JOBS = createField("total_jobs", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>public.usage_user</code> table reference
	 */
	public UsageUser() {
		this("usage_user", null);
	}

	/**
	 * Create an aliased <code>public.usage_user</code> table reference
	 */
	public UsageUser(java.lang.String alias) {
		this(alias, nesi.jobs.tables.UsageUser.USAGE_USER);
	}

	private UsageUser(java.lang.String alias, org.jooq.Table<nesi.jobs.tables.records.UsageUserRecord> aliased) {
		this(alias, aliased, null);
	}

	private UsageUser(java.lang.String alias, org.jooq.Table<nesi.jobs.tables.records.UsageUserRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, nesi.jobs.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<nesi.jobs.tables.records.UsageUserRecord> getPrimaryKey() {
		return nesi.jobs.Keys.USAGE_USER_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<nesi.jobs.tables.records.UsageUserRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<nesi.jobs.tables.records.UsageUserRecord>>asList(nesi.jobs.Keys.USAGE_USER_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public nesi.jobs.tables.UsageUser as(java.lang.String alias) {
		return new nesi.jobs.tables.UsageUser(alias, this);
	}

	/**
	 * Rename this table
	 */
	public nesi.jobs.tables.UsageUser rename(java.lang.String name) {
		return new nesi.jobs.tables.UsageUser(name, null);
	}
}
