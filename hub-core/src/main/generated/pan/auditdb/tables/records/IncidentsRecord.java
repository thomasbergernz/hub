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
package pan.auditdb.tables.records;

/**
 * This class is generated by jOOQ.
 * <p>
 * InnoDB free: 8458240 kB
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.3.2"},
        comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({"all", "unchecked", "rawtypes"})
public class IncidentsRecord extends org.jooq.impl.UpdatableRecordImpl<pan.auditdb.tables.records.IncidentsRecord> implements org.jooq.Record11<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> {

    private static final long serialVersionUID = 181731748;

    /**
     * Create a detached IncidentsRecord
     */
    public IncidentsRecord() {
        super(pan.auditdb.tables.Incidents.INCIDENTS);
    }

    /**
     * Create a detached, initialised IncidentsRecord
     */
    public IncidentsRecord(java.lang.Integer id, java.lang.String cluster, java.lang.Integer severity, java.lang.Integer start, java.lang.Integer done, java.lang.String subsystemAffected, java.lang.String description, java.lang.String investigation, java.lang.String outcome, java.lang.String note, java.lang.Integer lostCores) {
        super(pan.auditdb.tables.Incidents.INCIDENTS);

        setValue(0, id);
        setValue(1, cluster);
        setValue(2, severity);
        setValue(3, start);
        setValue(4, done);
        setValue(5, subsystemAffected);
        setValue(6, description);
        setValue(7, investigation);
        setValue(8, outcome);
        setValue(9, note);
        setValue(10, lostCores);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.Integer> field1() {
        return pan.auditdb.tables.Incidents.INCIDENTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field10() {
        return pan.auditdb.tables.Incidents.INCIDENTS.NOTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.Integer> field11() {
        return pan.auditdb.tables.Incidents.INCIDENTS.LOST_CORES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field2() {
        return pan.auditdb.tables.Incidents.INCIDENTS.CLUSTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.Integer> field3() {
        return pan.auditdb.tables.Incidents.INCIDENTS.SEVERITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.Integer> field4() {
        return pan.auditdb.tables.Incidents.INCIDENTS.START;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.Integer> field5() {
        return pan.auditdb.tables.Incidents.INCIDENTS.DONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field6() {
        return pan.auditdb.tables.Incidents.INCIDENTS.SUBSYSTEM_AFFECTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field7() {
        return pan.auditdb.tables.Incidents.INCIDENTS.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field8() {
        return pan.auditdb.tables.Incidents.INCIDENTS.INVESTIGATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field9() {
        return pan.auditdb.tables.Incidents.INCIDENTS.OUTCOME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Row11<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> fieldsRow() {
        return (org.jooq.Row11) super.fieldsRow();
    }

    /**
     * Getter for <code>pandora_audit.incidents.cluster</code>.
     */
    public java.lang.String getCluster() {
        return (java.lang.String) getValue(1);
    }

    /**
     * Getter for <code>pandora_audit.incidents.description</code>.
     */
    public java.lang.String getDescription() {
        return (java.lang.String) getValue(6);
    }

    /**
     * Getter for <code>pandora_audit.incidents.done</code>.
     */
    public java.lang.Integer getDone() {
        return (java.lang.Integer) getValue(4);
    }

    /**
     * Getter for <code>pandora_audit.incidents.id</code>.
     */
    public java.lang.Integer getId() {
        return (java.lang.Integer) getValue(0);
    }

    /**
     * Getter for <code>pandora_audit.incidents.investigation</code>.
     */
    public java.lang.String getInvestigation() {
        return (java.lang.String) getValue(7);
    }

    /**
     * Getter for <code>pandora_audit.incidents.lost_cores</code>.
     */
    public java.lang.Integer getLostCores() {
        return (java.lang.Integer) getValue(10);
    }

    /**
     * Getter for <code>pandora_audit.incidents.note</code>.
     */
    public java.lang.String getNote() {
        return (java.lang.String) getValue(9);
    }

    /**
     * Getter for <code>pandora_audit.incidents.outcome</code>.
     */
    public java.lang.String getOutcome() {
        return (java.lang.String) getValue(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>pandora_audit.incidents.severity</code>.
     */
    public java.lang.Integer getSeverity() {
        return (java.lang.Integer) getValue(2);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>pandora_audit.incidents.start</code>.
     */
    public java.lang.Integer getStart() {
        return (java.lang.Integer) getValue(3);
    }

    /**
     * Getter for <code>pandora_audit.incidents.subsystem_affected</code>.
     */
    public java.lang.String getSubsystemAffected() {
        return (java.lang.String) getValue(5);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Record1<java.lang.Integer> key() {
        return (org.jooq.Record1) super.key();
    }

    /**
     * Setter for <code>pandora_audit.incidents.cluster</code>.
     */
    public void setCluster(java.lang.String value) {
        setValue(1, value);
    }

    /**
     * Setter for <code>pandora_audit.incidents.description</code>.
     */
    public void setDescription(java.lang.String value) {
        setValue(6, value);
    }

    /**
     * Setter for <code>pandora_audit.incidents.done</code>.
     */
    public void setDone(java.lang.Integer value) {
        setValue(4, value);
    }

    /**
     * Setter for <code>pandora_audit.incidents.id</code>.
     */
    public void setId(java.lang.Integer value) {
        setValue(0, value);
    }

    /**
     * Setter for <code>pandora_audit.incidents.investigation</code>.
     */
    public void setInvestigation(java.lang.String value) {
        setValue(7, value);
    }

    /**
     * Setter for <code>pandora_audit.incidents.lost_cores</code>.
     */
    public void setLostCores(java.lang.Integer value) {
        setValue(10, value);
    }

    /**
     * Setter for <code>pandora_audit.incidents.note</code>.
     */
    public void setNote(java.lang.String value) {
        setValue(9, value);
    }

    /**
     * Setter for <code>pandora_audit.incidents.outcome</code>.
     */
    public void setOutcome(java.lang.String value) {
        setValue(8, value);
    }

    /**
     * Setter for <code>pandora_audit.incidents.severity</code>.
     */
    public void setSeverity(java.lang.Integer value) {
        setValue(2, value);
    }

    /**
     * Setter for <code>pandora_audit.incidents.start</code>.
     */
    public void setStart(java.lang.Integer value) {
        setValue(3, value);
    }

    /**
     * Setter for <code>pandora_audit.incidents.subsystem_affected</code>.
     */
    public void setSubsystemAffected(java.lang.String value) {
        setValue(5, value);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IncidentsRecord value1(java.lang.Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.String value10() {
        return getNote();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IncidentsRecord value10(java.lang.String value) {
        setNote(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.Integer value11() {
        return getLostCores();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IncidentsRecord value11(java.lang.Integer value) {
        setLostCores(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.String value2() {
        return getCluster();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IncidentsRecord value2(java.lang.String value) {
        setCluster(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.Integer value3() {
        return getSeverity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IncidentsRecord value3(java.lang.Integer value) {
        setSeverity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.Integer value4() {
        return getStart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IncidentsRecord value4(java.lang.Integer value) {
        setStart(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.Integer value5() {
        return getDone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IncidentsRecord value5(java.lang.Integer value) {
        setDone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.String value6() {
        return getSubsystemAffected();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IncidentsRecord value6(java.lang.String value) {
        setSubsystemAffected(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.String value7() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IncidentsRecord value7(java.lang.String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.String value8() {
        return getInvestigation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IncidentsRecord value8(java.lang.String value) {
        setInvestigation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.String value9() {
        return getOutcome();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IncidentsRecord value9(java.lang.String value) {
        setOutcome(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public IncidentsRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.Integer value3, java.lang.Integer value4, java.lang.Integer value5, java.lang.String value6, java.lang.String value7, java.lang.String value8, java.lang.String value9, java.lang.String value10, java.lang.Integer value11) {
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Row11<java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> valuesRow() {
        return (org.jooq.Row11) super.valuesRow();
    }
}