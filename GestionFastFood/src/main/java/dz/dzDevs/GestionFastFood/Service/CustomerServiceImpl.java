package dz.dzDevs.GestionFastFood.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dz.dzDevs.GestionFastFood.Entity.Command;
import dz.dzDevs.GestionFastFood.Entity.User;
@Service("CustomerService")
@Transactional
public class CustomerServiceImpl implements ICustomerService {

	public void createCommand(User user, Command command) {
		// TODO Auto-generated method stub

	}

	public void updateCommand(User user, Command command) {
		// TODO Auto-generated method stub

	}

	public void cancelCommand(User user, int commandId) {
		// TODO Auto-generated method stub

	}

	public void payCommand(User user, int commandId) {
		// TODO Auto-generated method stub

	}

}
