package dz.dzDevs.GestionFastFood.Service;

import dz.dzDevs.GestionFastFood.Entity.Command;
import dz.dzDevs.GestionFastFood.Entity.User;

public interface IWaiterService {
	// Gestion des commandes
	public void 					createCommand(User user, Command command);
	public void 					updateCommand(User user, Command command);
	public Command 					findCommandById(User user, int commandId);
	public void 					deleteCommand(User user, int CommandId);
	public void 					cancelCommand(User user, int commandId);
	public void 					validateCommand(User user, int commandId);
}