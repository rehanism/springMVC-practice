package springmvc.redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
	@RequestMapping("/one")
	public RedirectView one()
	{
		System.out.println("Handler one");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("enjoy");
		return redirectView;
		//using redirect
		//return "redirect:/enjoy";
	}
	
	@RequestMapping("/enjoy")
	public String enjoy()
	{
		System.out.println("Handler two: enjoy");
		return "contact";
	}

}
