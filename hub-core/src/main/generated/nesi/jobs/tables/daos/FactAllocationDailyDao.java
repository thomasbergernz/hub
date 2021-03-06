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
public class FactAllocationDailyDao extends org.jooq.impl.DAOImpl<nesi.jobs.tables.records.FactAllocationDailyRecord, nesi.jobs.tables.pojos.FactAllocationDaily, java.lang.Integer> {

	/**
	 * Create a new FactAllocationDailyDao without any configuration
	 */
	public FactAllocationDailyDao() {
		super(nesi.jobs.tables.FactAllocationDaily.FACT_ALLOCATION_DAILY, nesi.jobs.tables.pojos.FactAllocationDaily.class);
	}

	/**
	 * Create a new FactAllocationDailyDao with an attached configuration
	 */
	public FactAllocationDailyDao(org.jooq.Configuration configuration) {
		super(nesi.jobs.tables.FactAllocationDaily.FACT_ALLOCATION_DAILY, nesi.jobs.tables.pojos.FactAllocationDaily.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(nesi.jobs.tables.pojos.FactAllocationDaily object) {
		return object.getFactAllocationDailyId();
	}

	/**
	 * Fetch records that have <code>fact_allocation_daily_id IN (values)</code>
	 */
	public java.util.List<nesi.jobs.tables.pojos.FactAllocationDaily> fetchByFactAllocationDailyId(java.lang.Integer... values) {
		return fetch(nesi.jobs.tables.FactAllocationDaily.FACT_ALLOCATION_DAILY.FACT_ALLOCATION_DAILY_ID, values);
	}

	/**
	 * Fetch a unique record that has <code>fact_allocation_daily_id = value</code>
	 */
	public nesi.jobs.tables.pojos.FactAllocationDaily fetchOneByFactAllocationDailyId(java.lang.Integer value) {
		return fetchOne(nesi.jobs.tables.FactAllocationDaily.FACT_ALLOCATION_DAILY.FACT_ALLOCATION_DAILY_ID, value);
	}

	/**
	 * Fetch records that have <code>dim_project_id IN (values)</code>
	 */
	public java.util.List<nesi.jobs.tables.pojos.FactAllocationDaily> fetchByDimProjectId(java.lang.Integer... values) {
		return fetch(nesi.jobs.tables.FactAllocationDaily.FACT_ALLOCATION_DAILY.DIM_PROJECT_ID, values);
	}

	/**
	 * Fetch records that have <code>architecture IN (values)</code>
	 */
	public java.util.List<nesi.jobs.tables.pojos.FactAllocationDaily> fetchByArchitecture(java.lang.String... values) {
		return fetch(nesi.jobs.tables.FactAllocationDaily.FACT_ALLOCATION_DAILY.ARCHITECTURE, values);
	}

	/**
	 * Fetch records that have <code>report_day IN (values)</code>
	 */
	public java.util.List<nesi.jobs.tables.pojos.FactAllocationDaily> fetchByReportDay(java.sql.Date... values) {
		return fetch(nesi.jobs.tables.FactAllocationDaily.FACT_ALLOCATION_DAILY.REPORT_DAY, values);
	}

	/**
	 * Fetch records that have <code>per_day IN (values)</code>
	 */
	public java.util.List<nesi.jobs.tables.pojos.FactAllocationDaily> fetchByPerDay(java.lang.Double... values) {
		return fetch(nesi.jobs.tables.FactAllocationDaily.FACT_ALLOCATION_DAILY.PER_DAY, values);
	}
}
