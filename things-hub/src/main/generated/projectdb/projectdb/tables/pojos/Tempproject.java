/**
 * This class is generated by jOOQ
 */
package projectdb.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tempproject implements java.io.Serializable {

	private static final long serialVersionUID = 686801215;

	private Integer id;
	private String  owner;
	private Integer lastvisited;
	private String  projectstring;

	public Tempproject() {}

	public Tempproject(
		Integer id,
		String  owner,
		Integer lastvisited,
		String  projectstring
	) {
		this.id = id;
		this.owner = owner;
		this.lastvisited = lastvisited;
		this.projectstring = projectstring;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Integer getLastvisited() {
		return this.lastvisited;
	}

	public void setLastvisited(Integer lastvisited) {
		this.lastvisited = lastvisited;
	}

	public String getProjectstring() {
		return this.projectstring;
	}

	public void setProjectstring(String projectstring) {
		this.projectstring = projectstring;
	}
}