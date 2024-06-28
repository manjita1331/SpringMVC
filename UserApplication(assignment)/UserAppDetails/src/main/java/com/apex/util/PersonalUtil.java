package com.apex.util;

import com.apex.constants.PersonalConstants;


import jakarta.servlet.http.HttpServletRequest;



public class PersonalUtil
{
	public static String validateRequest(HttpServletRequest req)
	{
		String error = null;
		String firstName = req.getParameter("firstname");
		String lastName = req.getParameter("lastname");
		if (firstName.isEmpty() ||  lastName.isEmpty()) {
			error = PersonalConstants.EMPTY_USERNAME_PASSWORD;
		}
		return error;
	}
}
