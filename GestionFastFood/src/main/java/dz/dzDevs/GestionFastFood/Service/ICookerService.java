package dz.dzDevs.GestionFastFood.Service;

import dz.dzDevs.GestionFastFood.Entity.Command;
import dz.dzDevs.GestionFastFood.Entity.User;

public interface ICookerService {
	// Gestion des commandes
	public Command 					findCommandById(User user, int CommandId);
	public void 					cancelCommand(User user, int commandId);
	public void 					validateCommand(User user, int commandId);
}