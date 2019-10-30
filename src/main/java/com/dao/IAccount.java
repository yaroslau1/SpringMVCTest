package com.dao;

import com.entity.Account;
import org.hibernate.SessionFactory;

import java.util.List;

public interface IAccount {
    SessionFactory getBeanToBeAutowired();
    List<Account> selectUsers();
    void insertUsers(Account accountEntity );
    void  delete(Account accountEntity );
    List<Integer>findBySum();
    List<Integer> findById( );


}
