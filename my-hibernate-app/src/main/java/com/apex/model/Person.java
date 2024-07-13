package com.apex.model;

import javax.persistence.*;

@Entity
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstname;
    private String middlename;
    private String lastname;
    private String gender;
    private String address;
    private String city;
    private String state;
    private String country;
    private String phoneno;
    private String bankname;
    private String accountno;
    private String ssn;

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }
    public String getMiddlename() { return middlename; }
    public void setMiddlename(String middlename) { this.middlename = middlename; }
    public String getLastname() { return lastname; }
    public void setLastname(String lastname) { this.lastname = lastname; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }
    public String getPhoneno() { return phoneno; }
    public void setPhoneno(String phoneno) { this.phoneno = phoneno; }
    public String getBankname() { return bankname; }
    public void setBankname(String bankname) { this.bankname = bankname; }
    public String getAccountno() { return accountno; }
    public void setAccountno(String accountno) { this.accountno = accountno; }
    public String getSsn() { return ssn; }
    public void setSsn(String ssn) { this.ssn = ssn; }
}
