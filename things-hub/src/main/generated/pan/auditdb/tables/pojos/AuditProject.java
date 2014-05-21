/**
 * This class is generated by jOOQ
 */
package pan.auditdb.tables.pojos;

/**
 * This class is generated by jOOQ.
 *
 * InnoDB free: 8458240 kB
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuditProject implements java.io.Serializable {

	private static final long serialVersionUID = 563275;

	private java.lang.String     user;
	private java.lang.Integer    cores;
	private java.lang.Integer    gridJobs;
	private java.math.BigDecimal totalGridCoreHours;
	private java.lang.String     project;
	private java.lang.String     jobtype;
	private java.lang.Integer    done;
	private java.math.BigDecimal coreHours;
	private java.math.BigDecimal waitingTime;

	public AuditProject() {}

	public AuditProject(
		java.lang.String     user,
		java.lang.Integer    cores,
		java.lang.Integer    gridJobs,
		java.math.BigDecimal totalGridCoreHours,
		java.lang.String     project,
		java.lang.String     jobtype,
		java.lang.Integer    done,
		java.math.BigDecimal coreHours,
		java.math.BigDecimal waitingTime
	) {
		this.user = user;
		this.cores = cores;
		this.gridJobs = gridJobs;
		this.totalGridCoreHours = totalGridCoreHours;
		this.project = project;
		this.jobtype = jobtype;
		this.done = done;
		this.coreHours = coreHours;
		this.waitingTime = waitingTime;
	}

	public java.lang.String getUser() {
		return this.user;
	}

	public void setUser(java.lang.String user) {
		this.user = user;
	}

	public java.lang.Integer getCores() {
		return this.cores;
	}

	public void setCores(java.lang.Integer cores) {
		this.cores = cores;
	}

	public java.lang.Integer getGridJobs() {
		return this.gridJobs;
	}

	public void setGridJobs(java.lang.Integer gridJobs) {
		this.gridJobs = gridJobs;
	}

	public java.math.BigDecimal getTotalGridCoreHours() {
		return this.totalGridCoreHours;
	}

	public void setTotalGridCoreHours(java.math.BigDecimal totalGridCoreHours) {
		this.totalGridCoreHours = totalGridCoreHours;
	}

	public java.lang.String getProject() {
		return this.project;
	}

	public void setProject(java.lang.String project) {
		this.project = project;
	}

	public java.lang.String getJobtype() {
		return this.jobtype;
	}

	public void setJobtype(java.lang.String jobtype) {
		this.jobtype = jobtype;
	}

	public java.lang.Integer getDone() {
		return this.done;
	}

	public void setDone(java.lang.Integer done) {
		this.done = done;
	}

	public java.math.BigDecimal getCoreHours() {
		return this.coreHours;
	}

	public void setCoreHours(java.math.BigDecimal coreHours) {
		this.coreHours = coreHours;
	}

	public java.math.BigDecimal getWaitingTime() {
		return this.waitingTime;
	}

	public void setWaitingTime(java.math.BigDecimal waitingTime) {
		this.waitingTime = waitingTime;
	}
}