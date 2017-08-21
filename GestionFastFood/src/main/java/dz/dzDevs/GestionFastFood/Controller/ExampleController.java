package dz.dzDevs.GestionFastFood.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//import com.arjuna.ats.internal.jdbc.drivers.modifiers.list;

import dz.dzDevs.GestionFastFood.DAO.CommandDAOImpl;
import dz.dzDevs.GestionFastFood.DAO.UserDAOImpl;
import dz.dzDevs.GestionFastFood.Entity.Command;
import dz.dzDevs.GestionFastFood.Entity.User;

import org.springframework.stereotype.Controller;
//peut être renommé en User controller
@Controller
public class ExampleController {
//users repository
	@Autowired
	UserDAOImpl users;
//commands repository
	@Autowired
	CommandDAOImpl commands;

	@RequestMapping("/User/{id}")
	public String user(@PathVariable int id, Model model) {
        model.addAttribute("user", users.findUserById(id));
        model.addAttribute("Commands", commands.listCommands());
        return "user";
	}

    @RequestMapping(value="/Users",method=RequestMethod.GET)
	public String usersList(Model model) {
        model.addAttribute("users", users.listUsers());
        return "users";
	}

    @RequestMapping(value="/Users",method=RequestMethod.POST)
	public String UsersAdd(@RequestParam String userName, 
						@RequestParam String userLogin, @RequestParam String userLastName,@RequestParam String UserPassword, Model model) {
        User newUser = new User();
        newUser.setUserName(userName);
        newUser.setUserLogin(userLogin);
        newUser.setUserLastName(userLastName);
        users.createUser(newUser);

        model.addAttribute("user", newUser);
        model.addAttribute("commands", commands.listCommands());
        return "redirect:/user/" + newUser.getUserId();
	}

    @RequestMapping(value="/Users/{id}/commands", method=RequestMethod.POST)
	public String UsersAddCommand(@PathVariable int id, @RequestParam int commandId, Model model) {
    	Command command = commands.findCommandById(commandId);
    	User user = users.findUserById(id);

    	if (user != null) {
    		
    			user.setCommand(command);
    		
    		users.updateUser(user);
            model.addAttribute("user", users.findUserById(id));
            model.addAttribute("Commands", commands.findCommandById(commandId));
            return "redirect:/User/" + user.getUserId();
    	}

        model.addAttribute("users", users.listUsers());
        return "redirect:/users";
    }

}
