package dz.dzDevs.GestionFastFood.DAO;

import java.util.List;

import dz.dzDevs.GestionFastFood.Entity.User;

public interface IUserDAO {
	public void 		createUser(User user);
	public void 		updateUser(User user);
	public void 		deleteUser(int idUser);
	public User 		findUserById(int idUser);
	public User 		findUserByLogin(String loginUser);
	public List<User> 	listUsers();
}
