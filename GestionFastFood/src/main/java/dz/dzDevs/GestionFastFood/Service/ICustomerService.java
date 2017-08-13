package dz.dzDevs.GestionFastFood.Service;

import dz.dzDevs.GestionFastFood.Entity.Command;
import dz.dzDevs.GestionFastFood.Entity.User;

public interface ICustomerService {
	// Gestion des commandes
	public void 					createCommand(User user, Command command);
	public void 					updateCommand(User user, Command command);
	public void 					cancelCommand(User user, int commandId);
	public void 					payCommand(User user, int commandId);
}