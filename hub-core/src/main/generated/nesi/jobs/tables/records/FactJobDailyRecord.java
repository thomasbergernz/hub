/**
 * This class is generated by jOOQ
 */
package nesi.jobs.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FactJobDailyRecord extends org.jooq.impl.UpdatableRecordImpl<nesi.jobs.tables.records.FactJobDailyRecord> implements org.jooq.Record7<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.sql.Timestamp, java.lang.Double> {

	private static final long serialVersionUID = -747960739;

	/**
	 * Setter for <code>public.fact_job_daily.fact_job_daily_id</code>.
	 */
	public void setFactJobDailyId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.fact_job_daily.fact_job_daily_id</code>.
	 */
	public java.lang.Integer getFactJobDailyId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.fact_job_daily.dim_job_id</code>.
	 */
	public void setDimJobId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.fact_job_daily.dim_job_id</code>.
	 */
	public java.lang.Integer getDimJobId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.fact_job_daily.dim_project_id</code>.
	 */
	public void setDimProjectId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.fact_job_daily.dim_project_id</code>.
	 */
	public java.lang.Integer getDimProjectId() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>public.fact_job_daily.dim_machine_id</code>.
	 */
	public void setDimMachineId(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.fact_job_daily.dim_machine_id</code>.
	 */
	public java.lang.Integer getDimMachineId() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>public.fact_job_daily.dim_user_id</code>.
	 */
	public void setDimUserId(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.fact_job_daily.dim_user_id</code>.
	 */
	public java.lang.Integer getDimUserId() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>public.fact_job_daily.report_day</code>.
	 */
	public void setReportDay(java.sql.Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.fact_job_daily.report_day</code>.
	 */
	public java.sql.Timestamp getReportDay() {
		return (java.sql.Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>public.fact_job_daily.period_charge</code>.
	 */
	public void setPeriodCharge(java.lang.Double value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.fact_job_daily.period_charge</code>.
	 */
	public java.lang.Double getPeriodCharge() {
		return (java.lang.Double) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.sql.Timestamp, java.lang.Double> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.sql.Timestamp, java.lang.Double> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return nesi.jobs.tables.FactJobDaily.FACT_JOB_DAILY.FACT_JOB_DAILY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return nesi.jobs.tables.FactJobDaily.FACT_JOB_DAILY.DIM_JOB_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return nesi.jobs.tables.FactJobDaily.FACT_JOB_DAILY.DIM_PROJECT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return nesi.jobs.tables.FactJobDaily.FACT_JOB_DAILY.DIM_MACHINE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return nesi.jobs.tables.FactJobDaily.FACT_JOB_DAILY.DIM_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field6() {
		return nesi.jobs.tables.FactJobDaily.FACT_JOB_DAILY.REPORT_DAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field7() {
		return nesi.jobs.tables.FactJobDaily.FACT_JOB_DAILY.PERIOD_CHARGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getFactJobDailyId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getDimJobId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getDimProjectId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getDimMachineId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getDimUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value6() {
		return getReportDay();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value7() {
		return getPeriodCharge();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FactJobDailyRecord value1(java.lang.Integer value) {
		setFactJobDailyId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FactJobDailyRecord value2(java.lang.Integer value) {
		setDimJobId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FactJobDailyRecord value3(java.lang.Integer value) {
		setDimProjectId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FactJobDailyRecord value4(java.lang.Integer value) {
		setDimMachineId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FactJobDailyRecord value5(java.lang.Integer value) {
		setDimUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FactJobDailyRecord value6(java.sql.Timestamp value) {
		setReportDay(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FactJobDailyRecord value7(java.lang.Double value) {
		setPeriodCharge(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FactJobDailyRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3, java.lang.Integer value4, java.lang.Integer value5, java.sql.Timestamp value6, java.lang.Double value7) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached FactJobDailyRecord
	 */
	public FactJobDailyRecord() {
		super(nesi.jobs.tables.FactJobDaily.FACT_JOB_DAILY);
	}

	/**
	 * Create a detached, initialised FactJobDailyRecord
	 */
	public FactJobDailyRecord(java.lang.Integer factJobDailyId, java.lang.Integer dimJobId, java.lang.Integer dimProjectId, java.lang.Integer dimMachineId, java.lang.Integer dimUserId, java.sql.Timestamp reportDay, java.lang.Double periodCharge) {
		super(nesi.jobs.tables.FactJobDaily.FACT_JOB_DAILY);

		setValue(0, factJobDailyId);
		setValue(1, dimJobId);
		setValue(2, dimProjectId);
		setValue(3, dimMachineId);
		setValue(4, dimUserId);
		setValue(5, reportDay);
		setValue(6, periodCharge);
	}
}
