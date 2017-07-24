package dz.gestionFastFood.Entites;

public class User {
	private int 	idUser;
	private String 	nomUser;
	private String 	prenomUser;
	private Role 	roleUser;
	private String 	loginUser;
	private String 	passwordUser;

	public User() {
	}
	public int getidUser() {
		return idUser;
	}
	public String getNomUser() {
		return nomUser;
	}
	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}
	public String getPrenomUser() {
		return prenomUser;
	}
	public void setPrenomUser(String prenomUser) {
		this.prenomUser = prenomUser;
	}
	public Role getRoleUser() {
		return roleUser;
	}
	public void setfirstNameUser(Role roleUser) {
		this.roleUser = roleUser;
	}
	public String getLoginUser() {
		return loginUser;
	}
	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}
	public String getPasswordUser() {
		return passwordUser;
	}
	public void setPasswordUser(String passwordUser) {
		this.passwordUser = passwordUser;
	}
}