package com.apex.controller;

import java.io.IOException;

import com.apex.bean.ContactBean;
import com.apex.bean.PersonalBean;
import com.apex.service.ContactService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/contactform")
public class contactcontroller extends HttpServlet
{
	String error = null;
	private ContactService contactService = new ContactService();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("in contact Controller class");

		
		String address = req.getParameter("addr");
		String city = req.getParameter("city");
		String state = req.getParameter("state");
		String country= req.getParameter("country");
		String phoneno= req.getParameter("pno");
		ContactBean contactBean = new ContactBean(address, city, state, country, phoneno);
		
		error=contactService.authenticateAndPopulateContact(contactBean);
		RequestDispatcher reqDispatcher = req.getRequestDispatcher("bankinfo.jsp");
		reqDispatcher.forward(req, resp);

		
		
	}
}
