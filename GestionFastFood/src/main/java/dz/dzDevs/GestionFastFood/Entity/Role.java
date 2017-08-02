package dz.dzDevs.GestionFastFood.Entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Role")
public class Role implements  Serializable{
@Id    
@GeneratedValue(strategy = GenerationType.AUTO)
private int  roleId;
@Column(name = "roleName")
private String roleName;
public Role(int roleId, String roleName) {
	this.roleId = roleId;
	this.roleName = roleName;
}
public Role(int roleId) {
	this.roleId = roleId;
	
}

public int getRoleId() {
	return roleId;
}
public void setRoleId(int roleId) {
	this.roleId = roleId;
}
public String getRoleName() {
	return roleName;
}
public void setRoleName(String nomRole) {
	this.roleName = nomRole;
}

}
