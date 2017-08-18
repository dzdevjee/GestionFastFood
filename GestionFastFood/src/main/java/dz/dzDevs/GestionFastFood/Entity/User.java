package dz.dzDevs.GestionFastFood.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User implements Serializable  {
	private static final long serialVersionUID = -5146869436163390075L;

	//Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId ;
	@Column(name = "userName")
	private String userName;
	@Column(name = "userLastName")
	private String userLastName;
	@Column(name = "userLogin")
	private String userLogin;
	@Column(name = "userPassword")
	private String userPassword;
	@ManyToOne
	@JoinColumn(name = "roleId")
	private Role userRole;
	  @ManyToOne(fetch=FetchType.LAZY)
	  @JoinColumn(name="commandId")
	  private Command command;
	public String getUserName() {
		return userName;
	}
	public Command getCommand() {
		return command;
	}
	public void setCommand(Command command) {
		this.command = command;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserLogin() {
		return userLogin;
	}
	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Role getUserRole() {
		return userRole;
	}
	public void setUserRole(Role userRole) {
		this.userRole = userRole;
	}
	public int getUserId() {
		return userId;
	}
}