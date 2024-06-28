package com.apex.controller;

import java.io.IOException;

import com.apex.bean.BankBean;
import com.apex.dao.BankDAO;
import com.apex.service.BankService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/bankform")
public class bankcontroller extends HttpServlet {
	
	String error = null;
	private BankService bankService = new BankService();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String bankname = req.getParameter("banknm");
		String accountno = req.getParameter("accno");
		String ssnno = req.getParameter("ssn");
		BankBean bankBean = new BankBean(bankname, accountno, ssnno);
		error = bankService.authenticateAndPopulateContact(bankBean);
		RequestDispatcher reqDispatcher = req.getRequestDispatcher("success.jsp");
		reqDispatcher.forward(req,resp);
	}


}
