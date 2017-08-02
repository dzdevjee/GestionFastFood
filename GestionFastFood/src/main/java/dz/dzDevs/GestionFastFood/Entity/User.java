package dz.dzDevs.GestionFastFood.Entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int userId ;
@Column(name = "userFirstName")
private String userFirstName;
@Column(name = "userLastName")
private String userLastName;
@Column(name = "userLogin")
private String userLogin;
@Column(name = "userPassword")
private String userPassword;
@ManyToOne
@JoinColumn(name = "roleId")
private Role userRole;

public User(int userId, String userFirstName, String userLastName, String userLogin, String userPassword, Role userRole) {
	super();
	this.userId = userId;
	this.userFirstName = userFirstName;
	this.userLastName = userLastName;
	this.userLogin = userLogin;
	this.userPassword = userPassword;
	this.userRole = userRole;
}
public User(){

}
public int getuserId() {
	return userId;
}
public void setuserId(int userId) {
	this.userId = userId;
}
public String getuserFirstName() {
	return userFirstName;
}
public void setuserFirstName(String userFirstName) {
	this.userFirstName = userFirstName;
}
public String getuserLastName() {
	return userLastName;
}
public void setuserLastName(String userLastName) {
	this.userLastName = userLastName;
}
public String getuserLogin() {
	return userLogin;
}
public void setuserLogin(String userLogin) {
	this.userLogin = userLogin;
}
public String getuserPassword() {
	return userPassword;
}
public void setuserPassword(String userPassword) {
	this.userPassword = userPassword;
}
public Role getuserRole() {
	return userRole;
}
public void setuserRole(Role userRole) {
	this.userRole = userRole;
}

}
