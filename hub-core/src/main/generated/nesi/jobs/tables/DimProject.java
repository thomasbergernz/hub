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
public class DimProject extends org.jooq.impl.TableImpl<nesi.jobs.tables.records.DimProjectRecord> {

	private static final long serialVersionUID = -943791802;

	/**
	 * The singleton instance of <code>public.dim_project</code>
	 */
	public static final nesi.jobs.tables.DimProject DIM_PROJECT = new nesi.jobs.tables.DimProject();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<nesi.jobs.tables.records.DimProjectRecord> getRecordType() {
		return nesi.jobs.tables.records.DimProjectRecord.class;
	}

	/**
	 * The column <code>public.dim_project.dim_project_id</code>.
	 */
	public final org.jooq.TableField<nesi.jobs.tables.records.DimProjectRecord, java.lang.Integer> DIM_PROJECT_ID = createField("dim_project_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.dim_project.projectcode</code>.
	 */
	public final org.jooq.TableField<nesi.jobs.tables.records.DimProjectRecord, java.lang.String> PROJECTCODE = createField("projectcode", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>public.dim_project.projecttitle</code>.
	 */
	public final org.jooq.TableField<nesi.jobs.tables.records.DimProjectRecord, java.lang.String> PROJECTTITLE = createField("projecttitle", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>public.dim_project.projectclass</code>.
	 */
	public final org.jooq.TableField<nesi.jobs.tables.records.DimProjectRecord, java.lang.String> PROJECTCLASS = createField("projectclass", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>public.dim_project.affiliation</code>.
	 */
	public final org.jooq.TableField<nesi.jobs.tables.records.DimProjectRecord, java.lang.String> AFFILIATION = createField("affiliation", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>public.dim_project.principalinvestigator</code>.
	 */
	public final org.jooq.TableField<nesi.jobs.tables.records.DimProjectRecord, java.lang.String> PRINCIPALINVESTIGATOR = createField("principalinvestigator", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>public.dim_project.otherprojectmembers</code>.
	 */
	public final org.jooq.TableField<nesi.jobs.tables.records.DimProjectRecord, java.lang.String> OTHERPROJECTMEMBERS = createField("otherprojectmembers", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * Create a <code>public.dim_project</code> table reference
	 */
	public DimProject() {
		this("dim_project", null);
	}

	/**
	 * Create an aliased <code>public.dim_project</code> table reference
	 */
	public DimProject(java.lang.String alias) {
		this(alias, nesi.jobs.tables.DimProject.DIM_PROJECT);
	}

	private DimProject(java.lang.String alias, org.jooq.Table<nesi.jobs.tables.records.DimProjectRecord> aliased) {
		this(alias, aliased, null);
	}

	private DimProject(java.lang.String alias, org.jooq.Table<nesi.jobs.tables.records.DimProjectRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, nesi.jobs.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<nesi.jobs.tables.records.DimProjectRecord, java.lang.Integer> getIdentity() {
		return nesi.jobs.Keys.IDENTITY_DIM_PROJECT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<nesi.jobs.tables.records.DimProjectRecord> getPrimaryKey() {
		return nesi.jobs.Keys.DIM_PROJECT_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<nesi.jobs.tables.records.DimProjectRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<nesi.jobs.tables.records.DimProjectRecord>>asList(nesi.jobs.Keys.DIM_PROJECT_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public nesi.jobs.tables.DimProject as(java.lang.String alias) {
		return new nesi.jobs.tables.DimProject(alias, this);
	}

	/**
	 * Rename this table
	 */
	public nesi.jobs.tables.DimProject rename(java.lang.String name) {
		return new nesi.jobs.tables.DimProject(name, null);
	}
}
