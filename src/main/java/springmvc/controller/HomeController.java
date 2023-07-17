package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		
		System.out.println("Home page");
		model.addAttribute("name", "Rehan");
		model.addAttribute("id", 12);
		List<String> friends = new ArrayList<String>();
		friends.add("Me");
		friends.add("He");
		
		model.addAttribute("friends", friends);
		return "index";
	}
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("About page");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("this is help controller");
		//creating model and view object
		ModelAndView mnv = new ModelAndView();
		//setting the data
		mnv.addObject("name","Rehan");
		mnv.addObject("rollno", 12);
		LocalDateTime now = LocalDateTime.now();
		mnv.addObject("time", now);
		
		//marks
		List<Integer> list= new ArrayList<Integer>();
		list.add(100);
		list.add(52);
		list.add(62);
		list.add(90);
		mnv.addObject("marks",list);
		
		//setting the page
		mnv.setViewName("help");
		return mnv;
	}

}
