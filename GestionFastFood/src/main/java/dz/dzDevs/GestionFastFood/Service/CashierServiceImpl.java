package dz.dzDevs.GestionFastFood.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dz.dzDevs.GestionFastFood.DAO.CommandDAOImpl;
import dz.dzDevs.GestionFastFood.Entity.Command;
import dz.dzDevs.GestionFastFood.Entity.User;

@Service("CashierService")
@Transactional
public class CashierServiceImpl implements ICashierService {
	protected final CommandDAOImpl commandDAOImpl;
	@Autowired
	public CashierServiceImpl(CommandDAOImpl commandDAOImpl){
	 this.commandDAOImpl=commandDAOImpl;
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
		return commandDAOImpl.findCommandById(commandId) ;
	}

	public void deleteCommand(User user, int CommandId) {
		Command command= commandDAOImpl.findCommandById(CommandId);
		command.setListUsers(null);
		command.setListFormulas(null);
		command.setListProducts(null);
		command.setTables(null);
		commandDAOImpl.deleteCommand(CommandId);
	}

	public void cancelCommand(User user, int commandId) {
		Command command= commandDAOImpl.findCommandById(commandId);
		command.getListUsers().remove(user);
		command.setCommandState("cancel");
		commandDAOImpl.updateCommand(command);
	}

	// encaisser 
	public void cashCommand(User user, int commandId) {
		Command command= commandDAOImpl.findCommandById(commandId);
		command.setCommandState("payed");
	    commandDAOImpl.updateCommand(command);
	}

	public void validateCommand(User user, int commandId) {
		Command command = commandDAOImpl.findCommandById(commandId);
	    command.setCommandState("validate");
	    commandDAOImpl.updateCommand(command);
	}

	//Imprimer ticket de caisse recu de paiement
	public void printVoucher(User user, int commandId) {
		Command command = commandDAOImpl.findCommandById(commandId);
		command.printVoucher();
	}
}