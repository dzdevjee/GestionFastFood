package dz.dzDevs.GestionFastFood.DAO;

import java.util.List;
import dz.dzDevs.GestionFastFood.Entity.Role;

public interface IRoleDAO {
	public void 		createRole(Role role);
	public void 		updateRole(Role role);
	public void 		deleteRole(int roleId);
	public Role 		findRoleById(int roleId);
	public Role 		findRoleByName(String roleName);
	public List<Role> 	listRoles();
}