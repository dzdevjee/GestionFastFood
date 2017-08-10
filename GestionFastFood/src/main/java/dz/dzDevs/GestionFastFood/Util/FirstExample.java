package dz.dzDevs.GestionFastFood.Util;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dz.dzDevs.GestionFastFood.Entity.Role;
import dz.dzDevs.GestionFastFood.Entity.User;

public class FirstExample {
	private static Session session = HibernateUtil.openSession();
	public static void main(String[] args) {

		Transaction tran = session.beginTransaction();
		try{
			
			Role role = new Role();
			role.setRoleName("lead");
			session.save(role);
			
			User u = new User();
			u.setUserLastName("dz");
			u.setUserName("dev");
			u.setUserLogin("devjee");
			u.setUserPassword("123456");
			u.setUserRole((Role)session.get(Role.class, 1));
			session.save(u);
			
			tran.commit();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		finally{
			session.close();
		}
	}
}