package com.apex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.apex.model.User;
import com.apex.service.UserService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class contactController 
{
	@Autowired
	private UserService userService;
	@ModelAttribute
	public void commondatamodel(Model m) 
	{
		m.addAttribute("Header","Learn Coding");
		m.addAttribute("Desc", "Home for Programmers");
		System.out.println("Adding common data");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m)
	{
	System.out.println("Showing form");	
	return "contact";
	}
	/*
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@RequestParam("name") String username,
							@RequestParam("email") String useremail,
							@RequestParam("password" )String userpassword,
							Model model
							)
	 
	{
		User user=new User();
		user.setName(username);
		user.setEmail(useremail);
		user.setPassword(userpassword);
		
	System.out.println(user); 
		
	
	// model.addAttribute("name",username);
	// model.addAttribute("email",useremail);
	// model.addAttribute("password",userpassword);
	model.addAttribute("user",user);
		   
		return "success";
		
	}*/
   
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model m)
							
	 
	{
		
	
	System.out.println(user); 
	
	// model.addAttribute("name",username);
	// model.addAttribute("email",useremail);
	// model.addAttribute("password",userpassword);
	//model.addAttribute("user",user);
		   this.userService.createUser(user);
		return "success";
		
	}
	
	
	
}
