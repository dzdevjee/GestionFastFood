package dz.dzDevs.GestionFastFood.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROLE")
public class Role implements  Serializable{
	private static final long serialVersionUID = 1831408933791653701L;

	//Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  roleId;
	@Column(name = "roleName")
	private String roleName;

	public int getRoleId() {
		return roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String nomRole) {
		this.roleName = nomRole;
	}
}