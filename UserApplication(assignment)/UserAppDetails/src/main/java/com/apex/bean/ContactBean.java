package com.apex.bean;

public class ContactBean {
	private String address;
	private String city;
	private String state;
	private String country;
	private String phoneno;
	public ContactBean(String address, String city, String state, String country, String phoneno) {
		super();
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.phoneno = phoneno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "cinfo [address=" + address + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", phoneno=" + phoneno + "]";
	}

	
}
