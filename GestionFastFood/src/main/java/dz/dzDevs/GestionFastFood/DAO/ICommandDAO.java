package dz.dzDevs.GestionFastFood.DAO;

import java.util.List;
import dz.dzDevs.GestionFastFood.Entity.Command;

public interface ICommandDAO {
	public void 			createCommand(Command command);
	public void 			updateCommand(Command command);
	public void 			deleteCommand(int CommandId);
	public Command 			findCommandById(int CommandId);
	public List<Command> 	listCommands();
}