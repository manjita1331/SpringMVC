package com.apex.service;

import com.apex.bean.ContactBean;
import com.apex.constants.PersonalConstants;
import com.apex.dao.ContactDAO;

public class ContactService 
{
	private ContactDAO contactDAO = new ContactDAO();
	
	public String authenticateAndPopulateContact(ContactBean contactBean)
	{
		String error = null;
		System.out.println("in Contact Service");
		contactBean=contactDAO.getContactBean(contactBean);
		if(contactBean.getAddress()==null) {
			error = PersonalConstants.INVALID_USER_CREDENTIALS;
		}
		return error;
	}

}
