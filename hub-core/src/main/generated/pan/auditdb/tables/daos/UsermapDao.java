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
package pan.auditdb.tables.daos;

/**
 * This class is generated by jOOQ.
 * <p>
 * InnoDB free: 8458240 kB
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class UsermapDao extends org.jooq.impl.DAOImpl<pan.auditdb.tables.records.UsermapRecord, pan.auditdb.tables.pojos.Usermap, java.lang.String> {

    /**
     * Create a new UsermapDao without any configuration
     */
    public UsermapDao() {
        super(pan.auditdb.tables.Usermap.USERMAP, pan.auditdb.tables.pojos.Usermap.class);
    }

    /**
     * Create a new UsermapDao with an attached configuration
     */
    public UsermapDao(org.jooq.Configuration configuration) {
        super(pan.auditdb.tables.Usermap.USERMAP, pan.auditdb.tables.pojos.Usermap.class, configuration);
    }

    /**
     * Fetch records that have <code>email IN (values)</code>
     */
    public java.util.List<pan.auditdb.tables.pojos.Usermap> fetchByEmail(java.lang.String... values) {
        return fetch(pan.auditdb.tables.Usermap.USERMAP.EMAIL, values);
    }

    /**
     * Fetch records that have <code>gold_id IN (values)</code>
     */
    public java.util.List<pan.auditdb.tables.pojos.Usermap> fetchByGoldId(java.lang.String... values) {
        return fetch(pan.auditdb.tables.Usermap.USERMAP.GOLD_ID, values);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public java.util.List<pan.auditdb.tables.pojos.Usermap> fetchById(java.lang.String... values) {
        return fetch(pan.auditdb.tables.Usermap.USERMAP.ID, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public java.util.List<pan.auditdb.tables.pojos.Usermap> fetchByName(java.lang.String... values) {
        return fetch(pan.auditdb.tables.Usermap.USERMAP.NAME, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public pan.auditdb.tables.pojos.Usermap fetchOneById(java.lang.String value) {
        return fetchOne(pan.auditdb.tables.Usermap.USERMAP.ID, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected java.lang.String getId(pan.auditdb.tables.pojos.Usermap object) {
        return object.getId();
    }
}
