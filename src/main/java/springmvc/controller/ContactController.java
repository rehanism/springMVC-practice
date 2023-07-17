package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;

	@ModelAttribute
	public void commonDataForAll(Model m) {
		m.addAttribute("Header", "Welcome to WorldRehanism");
		m.addAttribute("Description", "Please register yourself to go on a roller coaster ride");
		System.out.println("Adding Common Data to Model");
	}

	@RequestMapping("/contact")
	public String showForm(Model m) {
		System.out.println("Form Submission");

		return "contact";
	}

	// using ModelAttribute annotation
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model m) {
		System.out.println("Form Submitted");
		System.out.println(user);
		if (user.getUsername().isBlank())
		{
			return "redirect:/contact";
		}
		this.userService.createUser(user);

		// process
		return "success";
	}

	// using RequestParam attribute
	/*
	 * @RequestMapping(path="/processform", method = RequestMethod.POST) public
	 * String handleForm(@RequestParam("email") String userEmail,
	 * 
	 * @RequestParam("username") String userName,
	 * 
	 * @RequestParam("password") String userPassword, Model model) {
	 * 
	 * 
	 * User user = new User(); user.setEmail(userEmail); user.setUsername(userName);
	 * user.setPassword(userPassword); System.out.println(user);
	 * 
	 * 
	 * // process // model.addAttribute("email", userEmail); //
	 * model.addAttribute("username",userName); // model.addAttribute("password",
	 * userPassword); model.addAttribute("user", user); return "success"; }
	 */
}
