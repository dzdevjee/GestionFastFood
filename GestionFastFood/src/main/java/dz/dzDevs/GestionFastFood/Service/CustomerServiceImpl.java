package dz.dzDevs.GestionFastFood.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dz.dzDevs.GestionFastFood.Entity.Command;
import dz.dzDevs.GestionFastFood.Entity.User;
import dz.dzDevs.GestionFastFood.DAO.CommandDAOImpl;
@Service("CustomerService")
@Transactional
public class CustomerServiceImpl implements ICustomerService {
	protected CommandDAOImpl commandDAOImpl;
	@Autowired
	public CustomerServiceImpl(CommandDAOImpl commandDAOImpl) {
		this.commandDAOImpl = commandDAOImpl;
	}

	public void createCommand(User user, Command command) {
	    command.getListUsers().add(user);
	    commandDAOImpl.createCommand(command);
	}

	public void updateCommand(User user, Command command) {
		command.getListUsers().add(user);
		commandDAOImpl.updateCommand(command);
	}

	public void cancelCommand(User user, int commandId) {
		Command command = commandDAOImpl.findCommandById(commandId);
		command.getListUsers().add(user);
	    command.setCommandState("annulée");
	    commandDAOImpl.updateCommand(command);
	}

	public void payCommand(User user, int commandId) {
		Command command = commandDAOImpl.findCommandById(commandId);
		command.getListUsers().add(user);
		command.setCommandState("payée");
	    commandDAOImpl.updateCommand(command);
	}
}