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
public class Usermap extends org.jooq.impl.TableImpl<pan.auditdb.tables.records.UsermapRecord> {

	private static final long serialVersionUID = -346150623;

	/**
	 * The singleton instance of <code>pandora_audit.usermap</code>
	 */
	public static final pan.auditdb.tables.Usermap USERMAP = new pan.auditdb.tables.Usermap();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<pan.auditdb.tables.records.UsermapRecord> getRecordType() {
		return pan.auditdb.tables.records.UsermapRecord.class;
	}

	/**
	 * The column <code>pandora_audit.usermap.id</code>.
	 */
	public final org.jooq.TableField<pan.auditdb.tables.records.UsermapRecord, String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

	/**
	 * The column <code>pandora_audit.usermap.name</code>.
	 */
	public final org.jooq.TableField<pan.auditdb.tables.records.UsermapRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>pandora_audit.usermap.email</code>.
	 */
	public final org.jooq.TableField<pan.auditdb.tables.records.UsermapRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(155), this, "");

	/**
	 * The column <code>pandora_audit.usermap.gold_id</code>.
	 */
	public final org.jooq.TableField<pan.auditdb.tables.records.UsermapRecord, String> GOLD_ID = createField("gold_id", org.jooq.impl.SQLDataType.VARCHAR.length(155).defaulted(true), this, "");

	/**
	 * Create a <code>pandora_audit.usermap</code> table reference
	 */
	public Usermap() {
		this("usermap", null);
	}

	/**
	 * Create an aliased <code>pandora_audit.usermap</code> table reference
	 */
	public Usermap(String alias) {
		this(alias, pan.auditdb.tables.Usermap.USERMAP);
	}

	private Usermap(String alias, org.jooq.Table<pan.auditdb.tables.records.UsermapRecord> aliased) {
		this(alias, aliased, null);
	}

	private Usermap(String alias, org.jooq.Table<pan.auditdb.tables.records.UsermapRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, pan.auditdb.PandoraAudit.PANDORA_AUDIT, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<pan.auditdb.tables.records.UsermapRecord> getPrimaryKey() {
		return pan.auditdb.Keys.KEY_USERMAP_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<pan.auditdb.tables.records.UsermapRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<pan.auditdb.tables.records.UsermapRecord>>asList(pan.auditdb.Keys.KEY_USERMAP_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public pan.auditdb.tables.Usermap as(String alias) {
		return new pan.auditdb.tables.Usermap(alias, this);
	}

	/**
	 * Rename this table
	 */
	public pan.auditdb.tables.Usermap rename(String name) {
		return new pan.auditdb.tables.Usermap(name, null);
	}
}