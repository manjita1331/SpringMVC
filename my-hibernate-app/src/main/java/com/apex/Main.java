package com.apex;

import com.apex.model.Person;
import com.apex.service.PersonService;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();

        // Creating a new person
        Person person = new Person();
        
        person.setFirstname("Test");
        person.setMiddlename("az");
        person.setLastname("Pwe");
        person.setGender("Male");
        person.setAddress("156 Drive");
        person.setCity("Pgfg");
        person.setState("CA");
        person.setCountry("USA");
        person.setPhoneno("123-478-7890");
        person.setBankname("chase");
        person.setAccountno("1276879");
        person.setSsn("123-4556-6789");

        // Saving the person to the database
        personService.savePerson(person);
        System.out.println("Person saved successfully!");

        // Retrieving the person from the database
        
        Person retrievedPerson = personService.getPersonById(person.getId());
        System.out.println("Retrieved Person Details:");
        System.out.println("ID: " + retrievedPerson.getId());
        System.out.println("First Name: " + retrievedPerson.getFirstname());
        System.out.println("Middle Name: " + retrievedPerson.getMiddlename());
        System.out.println("Last Name: " + retrievedPerson.getLastname());
        System.out.println("Gender: " + retrievedPerson.getGender());
        System.out.println("Address: " + retrievedPerson.getAddress());
        System.out.println("City: " + retrievedPerson.getCity());
        System.out.println("State: " + retrievedPerson.getState());
        System.out.println("Country: " + retrievedPerson.getCountry());
        System.out.println("Phone No: " + retrievedPerson.getPhoneno());
        System.out.println("Bank Name: " + retrievedPerson.getBankname());
        System.out.println("Account No: " + retrievedPerson.getAccountno());
        System.out.println("SSN: " + retrievedPerson.getSsn());
    }
}
