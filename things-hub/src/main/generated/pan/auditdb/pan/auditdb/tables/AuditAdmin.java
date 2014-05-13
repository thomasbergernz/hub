/**
 * This class is generated by jOOQ
 */
package pan.auditdb.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.1" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuditAdmin extends org.jooq.impl.TableImpl<pan.auditdb.tables.records.AuditAdminRecord> {

	private static final long serialVersionUID = 104555930;

	/**
	 * The singleton instance of <code>pandora_audit.audit_admin</code>
	 */
	public static final pan.auditdb.tables.AuditAdmin AUDIT_ADMIN = new pan.auditdb.tables.AuditAdmin();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<pan.auditdb.tables.records.AuditAdminRecord> getRecordType() {
		return pan.auditdb.tables.records.AuditAdminRecord.class;
	}

	/**
	 * The column <code>pandora_audit.audit_admin.tuakiriUniqueId</code>.
	 */
	public final org.jooq.TableField<pan.auditdb.tables.records.AuditAdminRecord, String> TUAKIRIUNIQUEID = createField("tuakiriUniqueId", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * Create a <code>pandora_audit.audit_admin</code> table reference
	 */
	public AuditAdmin() {
		this("audit_admin", null);
	}

	/**
	 * Create an aliased <code>pandora_audit.audit_admin</code> table reference
	 */
	public AuditAdmin(String alias) {
		this(alias, pan.auditdb.tables.AuditAdmin.AUDIT_ADMIN);
	}

	private AuditAdmin(String alias, org.jooq.Table<pan.auditdb.tables.records.AuditAdminRecord> aliased) {
		this(alias, aliased, null);
	}

	private AuditAdmin(String alias, org.jooq.Table<pan.auditdb.tables.records.AuditAdminRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, pan.auditdb.PandoraAudit.PANDORA_AUDIT, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public pan.auditdb.tables.AuditAdmin as(String alias) {
		return new pan.auditdb.tables.AuditAdmin(alias, this);
	}

	/**
	 * Rename this table
	 */
	public pan.auditdb.tables.AuditAdmin rename(String name) {
		return new pan.auditdb.tables.AuditAdmin(name, null);
	}
}