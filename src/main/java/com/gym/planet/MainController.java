package com.gym.planet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.gym.planet.Constants;

@Controller
public class MainController
{
	@RequestMapping("/")
	public String returnLogin()
	{
		return "login.html";
	}

	
	  @RequestMapping("/verifyuser")
	  public ModelAndView verifyUserCredential(@RequestParam("username") String un, @RequestParam ("password") String pwd)
	  {
		  
		  ModelAndView mv= new ModelAndView();
		//  System.out.println(un);
		//  System.out.println(pwd);
		  if (un.equalsIgnoreCase("planet") && pwd.equalsIgnoreCase("planet"))
		  {
			  mv.setViewName("Homepage.html");
		  }
		  else
		  {
			  mv.setViewName("Error.html");
		  }
	  
		  return mv;
	  }
	 
	
	
}
