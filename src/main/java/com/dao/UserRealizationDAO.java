package com.dao;

import com.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
@Repository
public class UserRealizationDAO implements IUser {
    @Autowired
    private SessionFactory sessionFactory;


    public UserRealizationDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public SessionFactory getBeanToBeAutowired() {
        return sessionFactory;
    }

    public List<User> selectUsers() {

        return null;
    }

    public void insertUsers(User usersEntity) {
        Session session = sessionFactory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(usersEntity);
        tx1.commit();
        session.close();
    }


    public void delete(User usersEntity) {
        Session session = sessionFactory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(usersEntity);
        tx1.commit();
        session.close();

    }

    public User findById(int id) {
        Session session = sessionFactory.openSession();
        User user = session.get(User.class, id);
        System.out.println(user);
        return user;
    }


    public List<User> findByName(String name) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("FROM User where name=:name");
        query.setParameter("name", name);
        List results = query.list();


        return results;
    }


    public List<User> findBySurname(String surname) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("FROM User where sureName=:surname");
        query.setParameter("surname", surname);
        List results = query.list();


        return results;
    }


    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}

