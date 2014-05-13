/**
 * This class is generated by jOOQ
 */
package projectdb.tables.pojos;

/**
 * This class is generated by jOOQ.
 *
 * NeSI and CeR staff
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Adviser implements java.io.Serializable {

	private static final long serialVersionUID = -469642654;

	private Integer  id;
	private String   fullname;
	private String   email;
	private String   phone;
	private String   address;
	private String   institution;
	private String   division;
	private String   department;
	private String   pictureurl;
	private String   startdate;
	private String   enddate;
	private String   notes;
	private Byte     isadmin;
	private String   tuakiriuniqueid;
	private String   tuakiritoken;
	private java.sql.Timestamp lastmodified;

	public Adviser() {}

	public Adviser(
		Integer  id,
		String   fullname,
		String   email,
		String   phone,
		String   address,
		String   institution,
		String   division,
		String   department,
		String   pictureurl,
		String   startdate,
		String   enddate,
		String   notes,
		Byte     isadmin,
		String   tuakiriuniqueid,
		String   tuakiritoken,
		java.sql.Timestamp lastmodified
	) {
		this.id = id;
		this.fullname = fullname;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.institution = institution;
		this.division = division;
		this.department = department;
		this.pictureurl = pictureurl;
		this.startdate = startdate;
		this.enddate = enddate;
		this.notes = notes;
		this.isadmin = isadmin;
		this.tuakiriuniqueid = tuakiriuniqueid;
		this.tuakiritoken = tuakiritoken;
		this.lastmodified = lastmodified;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getInstitution() {
		return this.institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public String getDivision() {
		return this.division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPictureurl() {
		return this.pictureurl;
	}

	public void setPictureurl(String pictureurl) {
		this.pictureurl = pictureurl;
	}

	public String getStartdate() {
		return this.startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return this.enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Byte getIsadmin() {
		return this.isadmin;
	}

	public void setIsadmin(Byte isadmin) {
		this.isadmin = isadmin;
	}

	public String getTuakiriuniqueid() {
		return this.tuakiriuniqueid;
	}

	public void setTuakiriuniqueid(String tuakiriuniqueid) {
		this.tuakiriuniqueid = tuakiriuniqueid;
	}

	public String getTuakiritoken() {
		return this.tuakiritoken;
	}

	public void setTuakiritoken(String tuakiritoken) {
		this.tuakiritoken = tuakiritoken;
	}

	public java.sql.Timestamp getLastmodified() {
		return this.lastmodified;
	}

	public void setLastmodified(java.sql.Timestamp lastmodified) {
		this.lastmodified = lastmodified;
	}
}