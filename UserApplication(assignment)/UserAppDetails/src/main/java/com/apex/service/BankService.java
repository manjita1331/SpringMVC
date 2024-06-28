package com.apex.service;

import com.apex.bean.BankBean;

import com.apex.constants.PersonalConstants;
import com.apex.dao.BankDAO;

public class BankService {

	private BankDAO bankDAO = new BankDAO();
	public String authenticateAndPopulateContact(BankBean bankBean)
	{
		String error = null;
		bankBean=bankDAO.getBankBean(bankBean);
		if(bankBean.getAccountno()==null) {
			error=PersonalConstants.INVALID_USER_CREDENTIALS;
		}
		return error;
	}
	
	
}
