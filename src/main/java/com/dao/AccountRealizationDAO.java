package com.dao;

import com.entity.AccountEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("accountRealizationDAO")
@Transactional
public class AccountRealizationDAO implements IAccount {

    public AccountRealizationDAO(SessionFactory sessionFactory){
        this.sessionFactory=sessionFactory;
    }


    @Autowired
    private SessionFactory sessionFactory;


    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    public List<AccountEntity> selectUsers()

    {
        return null;
    }

    public void insertUsers(AccountEntity accountEntity) {

    }

    public void delete(AccountEntity accountEntity) {

    }

    public List<Integer> findBySum() {

        Session session = sessionFactory.openSession();

        Query query = session.createQuery("SELECT SUM(e.account) AS account FROM AccountEntity e GROUP BY e.idUser ORDER BY account DESC ");

        //Query query1=session.createQuery("SELECT idUser  FROM AccountEntity where SUM(account) as total GROUP BY idUser ORDER BY total ");
       List result =query.list();

        return result;

    }

    public List<Integer> findById() {


        Session session =sessionFactory.openSession();
        Query query=session.createQuery("SELECT idUser from AccountEntity group by idUser order by sum(account) desc ");
        List result=query.list();
        return result;
    }
}
