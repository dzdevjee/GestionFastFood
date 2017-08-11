package dz.dzDevs.GestionFastFood.Util;

import dz.dzDevs.GestionFastFood.DAO.IUserDAO;
import dz.dzDevs.GestionFastFood.DAO.UserDAOImpl;
import dz.dzDevs.GestionFastFood.Entity.User;

public class FirstExample {
	public static void main(String[] args) {

			IUserDAO usrDAO = new UserDAOImpl();
			
			User u = new User();
			u.setUserLastName("test");
			u.setUserName("test");
			u.setUserLogin("test");
			u.setUserPassword("test");
			// 
			usrDAO.createUser(u);
			
			
	}
}