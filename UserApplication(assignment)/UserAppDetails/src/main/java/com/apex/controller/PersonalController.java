package com.apex.controller;

import java.io.IOException;

import com.apex.bean.PersonalBean;
import com.apex.service.PersonalService;
import com.apex.util.PersonalUtil;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/personalform")

public class PersonalController extends HttpServlet

{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PersonalService personalService = new PersonalService();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		String error = null;
		System.out.println("incontroller doPost");
				
		if (error == null) 
		{
			System.out.println("in Controller class");
			String firstname1 = req.getParameter("fname");
			String middlename1 = req.getParameter("mname");
			String lastname1 = req.getParameter("lname");
			String gender1= req.getParameter("gender");


			PersonalBean personalBean = new PersonalBean(firstname1, middlename1, lastname1, gender1);
			
			error = personalService.authenticateAndPopulateUser(personalBean);
			if (error == null)
			{
				System.out.println("in personalController.java");
				HttpSession session = req.getSession();
				session.setAttribute("session_fname", personalBean.getFirstName());
				session.setAttribute("session_lname", personalBean.getLastname());
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("contactinfo.jsp");
				requestDispatcher.forward(req, resp);
			}

	
	}
	
	
         RequestDispatcher requestDispatcher = req.getRequestDispatcher("personalinfo.jsp");
		requestDispatcher.forward(req, resp);
	}
}
