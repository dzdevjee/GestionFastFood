package dz.dzDevs.GestionFastFood.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dz.dzDevs.GestionFastFood.DAO.CommandDAOImpl;
import dz.dzDevs.GestionFastFood.Entity.Command;
import dz.dzDevs.GestionFastFood.Entity.User;
@Service("CookerService")
@Transactional
public class CookerServiceImpl implements ICookerService {
	protected CommandDAOImpl commandDAOImpl;
	@Autowired
	public CookerServiceImpl(CommandDAOImpl commandDAOImpl) {
	 this.commandDAOImpl = commandDAOImpl;
	}

	public Command findCommandById(User user, int CommandId) {
		return commandDAOImpl.findCommandById(CommandId) ;
	}

	public void cancelCommand(User user, int commandId) {
		Command command = commandDAOImpl.findCommandById(commandId);
		command.getListUsers().remove(user);
	    command.setCommandState("cancel");
	    commandDAOImpl.updateCommand(command);
	}

	public void validateCommand(User user, int commandId) {
		Command command = commandDAOImpl.findCommandById(commandId);
	    command.setCommandState("validate");
	    commandDAOImpl.updateCommand(command);
	}
}