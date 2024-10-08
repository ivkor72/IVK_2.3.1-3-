package web.controller;

import application.model.User;
import application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

//	@Autowired
//	private UserService userService;

	@GetMapping(value = "/")
	public String showAllUsers(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("All Users");
		model.addAttribute("messages", messages);
//		List<User> allUsers = userService.getAllUsers();
//		model.addAttribute("user", allUsers);
		return "index";
	}
	
}