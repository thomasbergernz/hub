/**
 * This class is generated by jOOQ
 */
package projectdb.tables.daos;

/**
 * This class is generated by jOOQ.
 *
 * Key Performance Indicators (for us).
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class KpiDao extends org.jooq.impl.DAOImpl<projectdb.tables.records.KpiRecord, projectdb.tables.pojos.Kpi, Integer> {

	/**
	 * Create a new KpiDao without any panAuditConfiguration
	 */
	public KpiDao() {
		super(projectdb.tables.Kpi.KPI, projectdb.tables.pojos.Kpi.class);
	}

	/**
	 * Create a new KpiDao with an attached panAuditConfiguration
	 */
	public KpiDao(org.jooq.Configuration configuration) {
		super(projectdb.tables.Kpi.KPI, projectdb.tables.pojos.Kpi.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(projectdb.tables.pojos.Kpi object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<projectdb.tables.pojos.Kpi> fetchById(Integer... values) {
		return fetch(projectdb.tables.Kpi.KPI.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public projectdb.tables.pojos.Kpi fetchOneById(Integer value) {
		return fetchOne(projectdb.tables.Kpi.KPI.ID, value);
	}

	/**
	 * Fetch records that have <code>type IN (values)</code>
	 */
	public java.util.List<projectdb.tables.pojos.Kpi> fetchByType(String... values) {
		return fetch(projectdb.tables.Kpi.KPI.TYPE, values);
	}

	/**
	 * Fetch records that have <code>title IN (values)</code>
	 */
	public java.util.List<projectdb.tables.pojos.Kpi> fetchByTitle(String... values) {
		return fetch(projectdb.tables.Kpi.KPI.TITLE, values);
	}

	/**
	 * Fetch records that have <code>measures IN (values)</code>
	 */
	public java.util.List<projectdb.tables.pojos.Kpi> fetchByMeasures(String... values) {
		return fetch(projectdb.tables.Kpi.KPI.MEASURES, values);
	}
}