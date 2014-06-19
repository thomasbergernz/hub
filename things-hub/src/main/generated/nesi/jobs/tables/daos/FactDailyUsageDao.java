/**
 * This class is generated by jOOQ
 */
package nesi.jobs.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FactDailyUsageDao extends org.jooq.impl.DAOImpl<nesi.jobs.tables.records.FactDailyUsageRecord, nesi.jobs.tables.pojos.FactDailyUsage, java.lang.Integer> {

	/**
	 * Create a new FactDailyUsageDao without any configuration
	 */
	public FactDailyUsageDao() {
		super(nesi.jobs.tables.FactDailyUsage.FACT_DAILY_USAGE, nesi.jobs.tables.pojos.FactDailyUsage.class);
	}

	/**
	 * Create a new FactDailyUsageDao with an attached configuration
	 */
	public FactDailyUsageDao(org.jooq.Configuration configuration) {
		super(nesi.jobs.tables.FactDailyUsage.FACT_DAILY_USAGE, nesi.jobs.tables.pojos.FactDailyUsage.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(nesi.jobs.tables.pojos.FactDailyUsage object) {
		return object.getFactDailyUsageId();
	}

	/**
	 * Fetch records that have <code>fact_daily_usage_id IN (values)</code>
	 */
	public java.util.List<nesi.jobs.tables.pojos.FactDailyUsage> fetchByFactDailyUsageId(java.lang.Integer... values) {
		return fetch(nesi.jobs.tables.FactDailyUsage.FACT_DAILY_USAGE.FACT_DAILY_USAGE_ID, values);
	}

	/**
	 * Fetch a unique record that has <code>fact_daily_usage_id = value</code>
	 */
	public nesi.jobs.tables.pojos.FactDailyUsage fetchOneByFactDailyUsageId(java.lang.Integer value) {
		return fetchOne(nesi.jobs.tables.FactDailyUsage.FACT_DAILY_USAGE.FACT_DAILY_USAGE_ID, value);
	}

	/**
	 * Fetch records that have <code>dim_machine_id IN (values)</code>
	 */
	public java.util.List<nesi.jobs.tables.pojos.FactDailyUsage> fetchByDimMachineId(java.lang.Integer... values) {
		return fetch(nesi.jobs.tables.FactDailyUsage.FACT_DAILY_USAGE.DIM_MACHINE_ID, values);
	}

	/**
	 * Fetch records that have <code>dim_project_id IN (values)</code>
	 */
	public java.util.List<nesi.jobs.tables.pojos.FactDailyUsage> fetchByDimProjectId(java.lang.Integer... values) {
		return fetch(nesi.jobs.tables.FactDailyUsage.FACT_DAILY_USAGE.DIM_PROJECT_ID, values);
	}

	/**
	 * Fetch records that have <code>dim_user_id IN (values)</code>
	 */
	public java.util.List<nesi.jobs.tables.pojos.FactDailyUsage> fetchByDimUserId(java.lang.Integer... values) {
		return fetch(nesi.jobs.tables.FactDailyUsage.FACT_DAILY_USAGE.DIM_USER_ID, values);
	}

	/**
	 * Fetch records that have <code>report_day IN (values)</code>
	 */
	public java.util.List<nesi.jobs.tables.pojos.FactDailyUsage> fetchByReportDay(java.sql.Date... values) {
		return fetch(nesi.jobs.tables.FactDailyUsage.FACT_DAILY_USAGE.REPORT_DAY, values);
	}

	/**
	 * Fetch records that have <code>period_charge IN (values)</code>
	 */
	public java.util.List<nesi.jobs.tables.pojos.FactDailyUsage> fetchByPeriodCharge(java.lang.Double... values) {
		return fetch(nesi.jobs.tables.FactDailyUsage.FACT_DAILY_USAGE.PERIOD_CHARGE, values);
	}
}