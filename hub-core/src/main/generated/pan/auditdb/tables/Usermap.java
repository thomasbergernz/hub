/*
 * Things
 *
 * Copyright (c) 2014, Markus Binsteiner. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3.0 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library.
 */

/**
 * This class is generated by jOOQ
 */
package pan.auditdb.tables;

/**
 * This class is generated by jOOQ.
 * <p>
 * InnoDB free: 8458240 kB
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Usermap extends org.jooq.impl.TableImpl<pan.auditdb.tables.records.UsermapRecord> {

    /**
     * The singleton instance of <code>pandora_audit.usermap</code>
     */
    public static final pan.auditdb.tables.Usermap USERMAP = new pan.auditdb.tables.Usermap();
    private static final long serialVersionUID = 465574178;
    /**
     * The column <code>pandora_audit.usermap.email</code>.
     */
    public final org.jooq.TableField<pan.auditdb.tables.records.UsermapRecord, java.lang.String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(155), this, "");
    /**
     * The column <code>pandora_audit.usermap.gold_id</code>.
     */
    public final org.jooq.TableField<pan.auditdb.tables.records.UsermapRecord, java.lang.String> GOLD_ID = createField("gold_id", org.jooq.impl.SQLDataType.VARCHAR.length(155).defaulted(true), this, "");
    /**
     * The column <code>pandora_audit.usermap.id</code>.
     */
    public final org.jooq.TableField<pan.auditdb.tables.records.UsermapRecord, java.lang.String> ID = createField("id", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");
    /**
     * The column <code>pandora_audit.usermap.name</code>.
     */
    public final org.jooq.TableField<pan.auditdb.tables.records.UsermapRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * Create a <code>pandora_audit.usermap</code> table reference
     */
    public Usermap() {
        this("usermap", null);
    }

    /**
     * Create an aliased <code>pandora_audit.usermap</code> table reference
     */
    public Usermap(java.lang.String alias) {
        this(alias, pan.auditdb.tables.Usermap.USERMAP);
    }

    private Usermap(java.lang.String alias, org.jooq.Table<pan.auditdb.tables.records.UsermapRecord> aliased) {
        this(alias, aliased, null);
    }

    private Usermap(java.lang.String alias, org.jooq.Table<pan.auditdb.tables.records.UsermapRecord> aliased, org.jooq.Field<?>[] parameters) {
        super(alias, pan.auditdb.PandoraAudit.PANDORA_AUDIT, aliased, parameters, "InnoDB free: 8458240 kB");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public pan.auditdb.tables.Usermap as(java.lang.String alias) {
        return new pan.auditdb.tables.Usermap(alias, this);
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
    public org.jooq.UniqueKey<pan.auditdb.tables.records.UsermapRecord> getPrimaryKey() {
        return pan.auditdb.Keys.KEY_USERMAP_PRIMARY;
    }

    /**
     * The class holding records for this type
     */
    @Override
    public java.lang.Class<pan.auditdb.tables.records.UsermapRecord> getRecordType() {
        return pan.auditdb.tables.records.UsermapRecord.class;
    }

    /**
     * Rename this table
     */
    public pan.auditdb.tables.Usermap rename(java.lang.String name) {
        return new pan.auditdb.tables.Usermap(name, null);
    }
}
