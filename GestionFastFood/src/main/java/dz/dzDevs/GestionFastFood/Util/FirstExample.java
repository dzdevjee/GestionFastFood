package dz.dzDevs.GestionFastFood.Util;

import java.util.*;
import dz.dzDevs.GestionFastFood.DAO.IUserDAO;
import dz.dzDevs.GestionFastFood.DAO.UserDAOImpl;
import dz.dzDevs.GestionFastFood.Entity.User;

public class FirstExample {
	public static void main(String[] args) {

			IUserDAO usrDAO = new UserDAOImpl();
			//save
			// Create
			User u = new User();
			u.setUserLastName("test");
			u.setUserName("test");
			u.setUserLogin("test");
			u.setUserPassword("test");
			usrDAO.createUser(u);
			
			// FindAll
			List<User> list = new ArrayList<User>();
			list = usrDAO.listUsers();
			
			for (User usr: list) {
				System.out.println("Id: " + usr.getUserId());
				System.out.println("LastName: " + usr.getUserLastName());
				System.out.println("Name: " + usr.getUserName());
				System.out.println("Login: " + usr.getUserLogin());
				System.out.println("Password: " + usr.getUserPassword());
			}
			
			// Find
			//find
			u = usrDAO.findUserById(1);

			System.out.println("Id: " + u.getUserId());
			System.out.println("LastName: " + u.getUserLastName());
			System.out.println("Name: " + u.getUserName());
			System.out.println("Login: " + u.getUserLogin());
			System.out.println("Password: " + u.getUserPassword());

			// Update
			u.setUserLastName("Update");
			u.setUserName("Update");
			u.setUserLogin("Update");
			u.setUserPassword("Update");
			usrDAO.updateUser(u);

			// Delete
			usrDAO.deleteUser(u.getUserId());
	}
}