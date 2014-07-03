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
package pan.auditdb;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class PandoraAudit extends org.jooq.impl.SchemaImpl {

    /**
     * The singleton instance of <code>pandora_audit</code>
     */
    public static final PandoraAudit PANDORA_AUDIT = new PandoraAudit();
    private static final long serialVersionUID = 528847496;

    /**
     * No further instances allowed
     */
    private PandoraAudit() {
        super("pandora_audit");
    }

    @Override
    public final java.util.List<org.jooq.Table<?>> getTables() {
        java.util.List result = new java.util.ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final java.util.List<org.jooq.Table<?>> getTables0() {
        return java.util.Arrays.<org.jooq.Table<?>>asList(
                pan.auditdb.tables.Abbreviations.ABBREVIATIONS,
                pan.auditdb.tables.Affiliation.AFFILIATION,
                pan.auditdb.tables.Audit.AUDIT,
                pan.auditdb.tables.AuditAdmin.AUDIT_ADMIN,
                pan.auditdb.tables.AuditProject.AUDIT_PROJECT,
                pan.auditdb.tables.AuditProjectPrev.AUDIT_PROJECT_PREV,
                pan.auditdb.tables.AuditUser.AUDIT_USER,
                pan.auditdb.tables.AuditUserPrev.AUDIT_USER_PREV,
                pan.auditdb.tables.DepartmentInfo.DEPARTMENT_INFO,
                pan.auditdb.tables.Incidents.INCIDENTS,
                pan.auditdb.tables.Nomenclature.NOMENCLATURE,
                pan.auditdb.tables.Organisation.ORGANISATION,
                pan.auditdb.tables.ProjectAllocation.PROJECT_ALLOCATION,
                pan.auditdb.tables.T1.T1,
                pan.auditdb.tables.Usermap.USERMAP);
    }
}