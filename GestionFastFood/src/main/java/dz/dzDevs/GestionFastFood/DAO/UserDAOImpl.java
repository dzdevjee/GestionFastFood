package dz.dzDevs.GestionFastFood.DAO;

import java.util.List;

import org.hibernate.Session;

import dz.dzDevs.GestionFastFood.Entity.User;
import dz.dzDevs.GestionFastFood.Util.HibernateUtil;

public class UserDAOImpl implements IUserDAO {
	private Session session = HibernateUtil.openSession();

	public void createUser(User user) {
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
	}

	public void updateUser(User user) {
		session.beginTransaction();
		session.merge(user);
		session.getTransaction().commit();
	}

	public void deleteUser(int idUser) {
		session.beginTransaction();
		User user = findUserById(idUser);
		session.delete(user);
		session.getTransaction().commit();
	}

	public User findUserById(int idUser) {
		return (User)session.get(User.class, idUser);
	}

	public User findUserByLogin(String loginUser) {
		System.out.println("En cours de realisation...");
		return null;
	}

	public List<User> listUsers() {
		return session.createQuery("select o from User o").list();
	}
}