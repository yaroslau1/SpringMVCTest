package com.dao;

import com.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userRealizationDAO")
@Transactional
public class UserRealizationDAO implements IUser {
    @Autowired
    private SessionFactory sessionFactory;


    public UserRealizationDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<UserEntity> selectUsers() {

        return null;
    }

    public void insertUsers(UserEntity usersEntity) {
        Session session = sessionFactory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(usersEntity);
        tx1.commit();
        session.close();
    }


    public void delete(UserEntity usersEntity) {
        Session session = sessionFactory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(usersEntity);
        tx1.commit();
        session.close();

    }

    public UserEntity findById(int id) {
        Session session = sessionFactory.openSession();
        UserEntity userEntity = session.get(UserEntity.class, id);
        System.out.println(userEntity);
        return userEntity;
    }


    public List<UserEntity> findByName(String name) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("FROM UserEntity where nameUser=:name");
        query.setParameter("name", name);
        List results = query.list();


        return results;
    }




    public List<UserEntity> findBySurname(String surname) {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("FROM UserEntity where surnameUser=:surname");
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

