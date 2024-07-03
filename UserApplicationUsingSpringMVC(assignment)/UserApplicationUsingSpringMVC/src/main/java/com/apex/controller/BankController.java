package com.apex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.apex.beans.BankBeans;
import com.apex.service.BankService;

@Controller
public class BankController {

	@Autowired
	BankService bankService;
	@RequestMapping(value="/bankform", method = RequestMethod.POST)
	
	public String showform(@ModelAttribute BankBeans bankBean, Model model) {
		bankService.createbankinfo(bankBean);
		return "Success";
	}
	
	
}
