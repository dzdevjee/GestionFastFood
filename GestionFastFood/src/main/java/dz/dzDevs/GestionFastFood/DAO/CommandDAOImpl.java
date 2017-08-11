package dz.dzDevs.GestionFastFood.DAO;

import java.util.List;
import org.hibernate.Session;
import dz.dzDevs.GestionFastFood.Entity.Command;
import dz.dzDevs.GestionFastFood.Util.HibernateUtil;

public class CommandDAOImpl implements ICommandDAO {
	private Session session = HibernateUtil.openSession();

	public void createCommand(Command command) {
		session.beginTransaction();
		session.save(command);
		session.getTransaction().commit();
	}

	public void updateCommand(Command command) {
		session.beginTransaction();
		session.merge(command);
		session.getTransaction().commit();
	}

	public void deleteCommand(int CommandId) {
		session.beginTransaction();
		Command command = findCommandById(CommandId);
		session.delete(command);
		session.getTransaction().commit();		
	}

	public Command findCommandById(int CommandId) {
		return (Command)session.get(Command.class, CommandId);
	}

	public List<Command> listCommands() {
		return session.createQuery("select o from Command o").list();
	}
}