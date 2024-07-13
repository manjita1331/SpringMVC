package com.apex.service;

import com.apex.dao.PersonDAO;
import com.apex.model.Person;

public class PersonService {
    private PersonDAO personDAO;

    public PersonService() {
        personDAO = new PersonDAO();
    }

    public void savePerson(Person person) {
        personDAO.savePerson(person);
    }

    public Person getPersonById(int id) {
        return personDAO.getPersonById(id);
    }
}
