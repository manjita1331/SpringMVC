package com.apex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apex.beans.ContactBeans;
import com.apex.dao.ContactDao;

@Service
public class ContactSerivce {
@Autowired
ContactDao contactDao;
public int createcontact(ContactBeans contactBean) {
	int i = contactDao.savecontact(contactBean);
	return i;
}

}
