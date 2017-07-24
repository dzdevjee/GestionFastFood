public class Role {
	private static int cpt=1;
	private int  idRole;
	private String roleName ;
	
	
	
	public Role(String roleName) {
		idRole=cpt; cpt++;
		this.roleName = roleName;
	}


	public int getIdRole() {
		return idRole;
	}


	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	@Override
	public String toString() {
		return "Role [idRole=" + idRole + ", roleName=" + roleName + "]";
	}
	
	public void afficherRole(){
		System.out.println(""+this.toString());
	}
	
	
}