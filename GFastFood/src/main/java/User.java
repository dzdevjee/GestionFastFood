
public class User {
	private static int cpt=1;
	private int id_user ;
	private String username ;
	private String userfirstname;
	private Role userRole;
	private String userlogin;
	private String userpassword;
	public int getId_user() {
		return id_user;
	}

	public User() {
		super();
		id_user=cpt; cpt++;
	}
    
	public User(String username, String userfirstname, Role userRole,
			String userlogin, String userpassword) {
		super();
		id_user=cpt; cpt++;
		this.username = username;
		this.userfirstname = userfirstname;
		this.userRole = userRole;
		this.userlogin = userlogin;
		this.userpassword = userpassword;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserfirstname() {
		return userfirstname;
	}
	public void setUserfirstname(String userfirstname) {
		this.userfirstname = userfirstname;
	}
	public Role getUserRole() {
		return userRole;
	}
	public void setUserRole(Role userRole) {
		this.userRole = userRole;
	}
	public String getUserlogin() {
		return userlogin;
	}
	public void setUserlogin(String userlogin) {
		this.userlogin = userlogin;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	@Override
	public String toString() {
		return "User [id_user=" + id_user + ", username=" + username
				+ ", userfirstname=" + userfirstname + ", userRole=" + userRole.getRoleName()
				+ ", userlogin=" + userlogin + ", userpassword=" + userpassword + "]";
	}
	public void afficherUser(){
		System.out.println(""+this.toString());
	}
	
	
}
