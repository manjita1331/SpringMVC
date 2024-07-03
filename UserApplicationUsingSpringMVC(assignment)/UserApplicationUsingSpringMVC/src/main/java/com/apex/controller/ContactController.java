package com.apex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.apex.beans.ContactBeans;
import com.apex.service.ContactSerivce;

@Controller
public class ContactController {
	@Autowired

	ContactSerivce contactService;
	@RequestMapping(value = "/contactform", method = RequestMethod.POST)
	
	public String showcontact(@ModelAttribute ContactBeans contactBean, Model model) {
		System.out.println(contactBean.getAddress());
		contactService.createcontact(contactBean);
		return "BankInfo";
	}
	

}
