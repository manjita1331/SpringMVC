package com.apex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apex.beans.BankBeans;
import com.apex.dao.BankDao;

@Service
public class BankService {

	@Autowired
	BankDao bankDao;
	public int createbankinfo(BankBeans bankBean) {
		int i = bankDao.savebankinfo(bankBean);
		return i;
	}

}
