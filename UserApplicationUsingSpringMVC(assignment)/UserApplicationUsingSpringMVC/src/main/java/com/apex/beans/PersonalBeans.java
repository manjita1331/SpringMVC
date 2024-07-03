package com.apex.beans;

public class PersonalBeans {
	private String firstName;
	private String middlename;
	private String lastname;
	private String gender;
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
		return "PersonalBeans [firstName=" + firstName + ", middlename=" + middlename + ", lastname=" + lastname
				+ ", gender=" + gender + "]";
	}
	
	

}
