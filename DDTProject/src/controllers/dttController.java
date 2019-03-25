package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class dttController {
	
	@RequestMapping(value="/")
	public String login_view()
	{
		System.out.println("login_view");
		return "index";
	}

}
