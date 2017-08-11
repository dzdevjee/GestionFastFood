package dz.dzDevs.GestionFastFood.DAO;

import java.util.List;
import org.hibernate.Session;
import dz.dzDevs.GestionFastFood.Entity.Role;
import dz.dzDevs.GestionFastFood.Util.HibernateUtil;

public class RoleDAOImpl implements IRoleDAO {
	private Session session = HibernateUtil.openSession();

	public void createRole(Role role) {
		session.beginTransaction();
		session.save(role);
        session.getTransaction().commit();
	}

	public void updateRole(Role role) {
		session.beginTransaction();
		session.merge(role);
        session.getTransaction().commit();
	}

	public void deleteRole(int roleId) {
		session.beginTransaction();
		Role role = findRoleById(roleId);
		session.delete(role);
        session.getTransaction().commit();	
	}

	public Role findRoleById(int roleId) {
		return (Role)session.get(Role.class, roleId);
	}

	public Role findRoleByName(String roleName) {
		System.out.println("En cours de realisation...");
		return null;
	}

	public List<Role> listRoles() {
		return session.createQuery("select o from Role o").list();	
	}
}