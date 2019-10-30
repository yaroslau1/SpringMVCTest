package com.dao;

import com.entity.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("accountRealizationDAO")
@Transactional
public class AccountRealizationDAO implements IAccount {

    public AccountRealizationDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public SessionFactory getBeanToBeAutowired() {
        return sessionFactory;
    }

    public List<Account> selectUsers()

    {
        return null;
    }

    public void insertUsers(Account accountEntity) {

    }

    public void delete(Account accountEntity) {

    }

    public List<Integer> findBySum() {

        Session session = sessionFactory.openSession();

        Query query = session.createQuery("SELECT SUM(e.account) AS account FROM Account e GROUP BY e.userId ORDER BY account DESC ");

        //Query query1=session.createQuery("SELECT idUser  FROM AccountEntity where SUM(account) as total GROUP BY idUser ORDER BY total ");
        List result = query.list();

        return result;

    }

    public List<Integer> findById() {
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("SELECT userId from Account group by userId order by sum(account) desc ");
        List result = query.list();
        return result;
    }
}
