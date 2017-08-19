package dz.dzDevs.GestionFastFood.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dz.dzDevs.GestionFastFood.DAO.CommandDAOImpl;
import dz.dzDevs.GestionFastFood.Entity.Command;
import dz.dzDevs.GestionFastFood.Entity.User;
@Service("WaiterService")
@Transactional
public class WaiterServiceImpl implements IWaiterService {
	protected CommandDAOImpl commandDAOImpl;
	@Autowired
	public WaiterServiceImpl(CommandDAOImpl commandDAOImpl) {
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

	public Command findCommandById(User user, int commandId) {
		commandDAOImpl.findCommandById(commandId).getListUsers().add(user);
		return commandDAOImpl.findCommandById(commandId);
	}

	public void deleteCommand(User user, int CommandId) {
    commandDAOImpl.deleteCommand(CommandId);    
	}

	public void cancelCommand(User user, int commandId) {
		commandDAOImpl.findCommandById(commandId).setCommandState("canceled");
		commandDAOImpl.findCommandById(commandId).getListUsers().add(user);
	}

	public void validateCommand(User user, int commandId) {
		commandDAOImpl.findCommandById(commandId).getListUsers().add(user);
		commandDAOImpl.findCommandById(commandId).setCommandState("validated");
	}
}