package dz.dzDevs.GestionFastFood.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dz.dzDevs.GestionFastFood.Entity.Command;
import dz.dzDevs.GestionFastFood.Entity.User;
@Service("WaiterService")
@Transactional
public class WaiterServiceImpl implements IWaiterService {

	public void createCommand(User user, Command command) {
		// TODO Auto-generated method stub

	}

	public void updateCommand(User user, Command command) {
		// TODO Auto-generated method stub

	}

	public Command findCommandById(User user, int commandId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteCommand(User user, int CommandId) {
		// TODO Auto-generated method stub

	}

	public void cancelCommand(User user, int commandId) {
		// TODO Auto-generated method stub

	}

	public void validateCommand(User user, int commandId) {
		// TODO Auto-generated method stub

	}

}
