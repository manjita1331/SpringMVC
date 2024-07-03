package com.apex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.apex.beans.PersonalBeans;

import com.apex.service.PersonalService;

@Controller
public class PersonalController {
	@Autowired

	PersonalService personalService;

	// @ModelAttribute
	@RequestMapping(value = "/personalform")
	public String message() {
		return "PersonalInfo";
	}

	@RequestMapping(value = "/personalform", method = RequestMethod.POST)

	public String showform(@ModelAttribute PersonalBeans personalBean, Model model) {
		System.out.println("In Personal Controller");

		personalService.createpersonal(personalBean);
		

		return "ContactInfo";

	}

}
