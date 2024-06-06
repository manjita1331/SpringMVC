package com.apex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController 
{
	@RequestMapping("home")
	public String home(Model model)
	{
		System.out.println("This is our home page");
		model.addAttribute("name","Manjita");
		return "index";
		
	}
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("this is our help page");
		//creating model and view object
		ModelAndView mav=new ModelAndView();
		//setting the data
		mav.addObject("name", "Gopal");
		mav.addObject("contactno",123455);
		//setting the view page name
		mav.setViewName("help");
		return mav;
	}
	@RequestMapping("/friend")
	public ModelAndView friend()
	{
		System.out.println("this is our friends page");
		//creating model and view object
		ModelAndView mav=new ModelAndView();
		//setting the data
		mav.addObject("name", "sudeep");
		mav.addObject("contactno",3572918);
		//setting the view page name
		mav.setViewName("friend");
		return mav;
	}


}
