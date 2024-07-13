package com.apex.dao;
import com.apex.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersonDAO {
    private SessionFactory sessionFactory;

    public PersonDAO() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    public void savePerson(Person person) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(person);
        transaction.commit();
        session.close();
    }

    public Person getPersonById(int id) {
        Session session = sessionFactory.openSession();
        Person person = session.get(Person.class, id);
        session.close();
        return person;
    }
}