package dz.dzDevs.GestionFastFood.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dz.dzDevs.GestionFastFood.Entity.Command;
import dz.dzDevs.GestionFastFood.Entity.User;
@Service("CookerService")
@Transactional
public class CookerServiceImpl implements ICookerService {

	public Command findCommandById(User user, int CommandId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void cancelCommand(User user, int commandId) {
		// TODO Auto-generated method stub

	}

	public void validateCommand(User user, int commandId) {
		// TODO Auto-generated method stub

	}

}
