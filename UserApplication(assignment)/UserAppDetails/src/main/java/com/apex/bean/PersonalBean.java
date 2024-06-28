package com.apex.bean;

public class PersonalBean {
	
	//private int id;
	private String firstName;
	private String middlename;
	private String lastname;
	private String gender;

public PersonalBean(String firstName, String middlename, String lastname, String gender) {
		super();
		this.firstName = firstName;
		this.middlename = middlename;
		this.lastname = lastname;
		this.gender = gender;
	}
	//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "PersonalBean [ firstName=" + firstName + ", middlename=" + middlename + ", lastname="
				+ lastname + ", gender=" + gender + "]";
	}
	
}
