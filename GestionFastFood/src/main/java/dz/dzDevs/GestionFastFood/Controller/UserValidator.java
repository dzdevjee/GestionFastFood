
package dz.dzDevs.GestionFastFood.Controller;

import dz.dzDevs.GestionFastFood.Entity.User;
import dz.dzDevs.GestionFastFood.DAO.UserDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {
    @Autowired
    private UserDAOImpl userService;



  

		public boolean supports(Class<?> clazz) {
			return User.class.equals(clazz);
		}

		public void validate(Object o, Errors errors) {
			// TODO Auto-generated method stub
		      User user = (User) o;

		        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
		        if (user.getUserName().length() < 6 || user.getUserName().length() > 32) {
		            errors.rejectValue("username", "Size.userForm.username");
		        }
		        if (userService.findUserByLogin(user.getUserLogin()) != null) {
		            errors.rejectValue("username", "Duplicate.userForm.username");
		        }

		        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
		        if (user.getUserPassword().length() < 8 || user.getUserPassword().length() > 32) {
		            errors.rejectValue("password", "Size.userForm.password");
		        }

		       /* if (!user.getPasswordConfirm().equals(user.getPassword())) {
		            errors.rejectValue("passwordConfirm", "Diff.userForm.passwordConfirm");
		        }*/
			
		
    }
}