package com.apex.bean;

public class BankBean {
	private String bankname;
	private String accountno;
	private String ssn;
	public BankBean(String bankname, String accountno, String ssn) {
		super();
		this.bankname = bankname;
		this.accountno = accountno;
		this.ssn = ssn;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "binfo [bankname=" + bankname + ", accountno=" + accountno + ", ssn=" + ssn + "]";
	}
	
	

}
