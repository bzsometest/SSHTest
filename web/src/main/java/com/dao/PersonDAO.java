package com.dao;

import com.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class PersonDAO {

    @Resource
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public List<Person> getPersons() {
        return this.getSession().createCriteria(Person.class).list();
    }

    public Person getPersonById(String id) {
        return (Person) this.getSession().createQuery("from Person where id = ?")
                .setParameter(0, id).uniqueResult();
    }

    public void addPerson(Person person) {
        this.getSession().save(person);
    }

    public void updatePerson(Person person) {
        this.getSession().update(person);
    }

    public void deletePersonById(String id) {
        this.getSession().createQuery("delete Person where id = ?")
                .setParameter(0, id).executeUpdate();
    }
}
