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
public class DimJob extends org.jooq.impl.TableImpl<nesi.jobs.tables.records.DimJobRecord> {

	private static final long serialVersionUID = 509162765;

	/**
	 * The singleton instance of <code>public.dim_job</code>
	 */
	public static final nesi.jobs.tables.DimJob DIM_JOB = new nesi.jobs.tables.DimJob();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<nesi.jobs.tables.records.DimJobRecord> getRecordType() {
		return nesi.jobs.tables.records.DimJobRecord.class;
	}

	/**
	 * The column <code>public.dim_job.dim_job_id</code>.
	 */
	public final org.jooq.TableField<nesi.jobs.tables.records.DimJobRecord, java.lang.Integer> DIM_JOB_ID = createField("dim_job_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.dim_job.jobid</code>.
	 */
	public final org.jooq.TableField<nesi.jobs.tables.records.DimJobRecord, java.lang.String> JOBID = createField("jobid", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>public.dim_job.username</code>.
	 */
	public final org.jooq.TableField<nesi.jobs.tables.records.DimJobRecord, java.lang.String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>public.dim_job.project</code>.
	 */
	public final org.jooq.TableField<nesi.jobs.tables.records.DimJobRecord, java.lang.String> PROJECT = createField("project", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>public.dim_job.machine</code>.
	 */
	public final org.jooq.TableField<nesi.jobs.tables.records.DimJobRecord, java.lang.String> MACHINE = createField("machine", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>public.dim_job.queue</code>.
	 */
	public final org.jooq.TableField<nesi.jobs.tables.records.DimJobRecord, java.lang.String> QUEUE = createField("queue", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>public.dim_job.llgroup</code>.
	 */
	public final org.jooq.TableField<nesi.jobs.tables.records.DimJobRecord, java.lang.String> LLGROUP = createField("llgroup", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>public.dim_job.threshold</code>.
	 */
	public final org.jooq.TableField<nesi.jobs.tables.records.DimJobRecord, java.lang.String> THRESHOLD = createField("threshold", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>public.dim_job.num_cpus</code>.
	 */
	public final org.jooq.TableField<nesi.jobs.tables.records.DimJobRecord, java.lang.Integer> NUM_CPUS = createField("num_cpus", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.dim_job.runtime</code>.
	 */
	public final org.jooq.TableField<nesi.jobs.tables.records.DimJobRecord, java.lang.Integer> RUNTIME = createField("runtime", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.dim_job.start</code>.
	 */
	public final org.jooq.TableField<nesi.jobs.tables.records.DimJobRecord, java.sql.Timestamp> START = createField("start", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>public.dim_job.finish</code>.
	 */
	public final org.jooq.TableField<nesi.jobs.tables.records.DimJobRecord, java.sql.Timestamp> FINISH = createField("finish", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>public.dim_job.qtime</code>.
	 */
	public final org.jooq.TableField<nesi.jobs.tables.records.DimJobRecord, java.sql.Timestamp> QTIME = createField("qtime", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>public.dim_job.waittime</code>.
	 */
	public final org.jooq.TableField<nesi.jobs.tables.records.DimJobRecord, java.lang.Integer> WAITTIME = createField("waittime", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>public.dim_job.runspan</code>.
	 */
	public final org.jooq.TableField<nesi.jobs.tables.records.DimJobRecord, java.lang.Object> RUNSPAN = createField("runspan", org.jooq.impl.DefaultDataType.getDefaultDataType("tsrange"), this, "");

	/**
	 * Create a <code>public.dim_job</code> table reference
	 */
	public DimJob() {
		this("dim_job", null);
	}

	/**
	 * Create an aliased <code>public.dim_job</code> table reference
	 */
	public DimJob(java.lang.String alias) {
		this(alias, nesi.jobs.tables.DimJob.DIM_JOB);
	}

	private DimJob(java.lang.String alias, org.jooq.Table<nesi.jobs.tables.records.DimJobRecord> aliased) {
		this(alias, aliased, null);
	}

	private DimJob(java.lang.String alias, org.jooq.Table<nesi.jobs.tables.records.DimJobRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, nesi.jobs.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<nesi.jobs.tables.records.DimJobRecord, java.lang.Integer> getIdentity() {
		return nesi.jobs.Keys.IDENTITY_DIM_JOB;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<nesi.jobs.tables.records.DimJobRecord> getPrimaryKey() {
		return nesi.jobs.Keys.DIM_JOB_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<nesi.jobs.tables.records.DimJobRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<nesi.jobs.tables.records.DimJobRecord>>asList(nesi.jobs.Keys.DIM_JOB_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public nesi.jobs.tables.DimJob as(java.lang.String alias) {
		return new nesi.jobs.tables.DimJob(alias, this);
	}

	/**
	 * Rename this table
	 */
	public nesi.jobs.tables.DimJob rename(java.lang.String name) {
		return new nesi.jobs.tables.DimJob(name, null);
	}
}