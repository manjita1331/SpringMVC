package com.apex.service;

import com.apex.bean.PersonalBean;
import com.apex.constants.PersonalConstants;
import com.apex.dao.PersonalDAO;



public class PersonalService {
	
	private PersonalDAO personalDAO = new PersonalDAO();
	
	//@SuppressWarnings("static-access")
	public String authenticateAndPopulateUser(PersonalBean personalBean) {
		String error = null;

		
		
		personalBean=personalDAO.getPersonalBean(personalBean);

		return error;

}
}
