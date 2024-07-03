package com.apex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apex.beans.PersonalBeans;
import com.apex.dao.PersonalDao;


@Service
public class PersonalService {
	@Autowired
	PersonalDao personalDao;
    public int createpersonal(PersonalBeans personalBean) {
    	System.out.println("inPersonal Service");
    	int i=personalDao.savepersonal(personalBean);
    	return i;
		
		
		
	}


}
