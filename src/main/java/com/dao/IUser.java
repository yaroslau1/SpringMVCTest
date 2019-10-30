package com.dao;

import com.entity.User;
import org.hibernate.SessionFactory;

import java.util.List;

public interface IUser {

    SessionFactory getBeanToBeAutowired();
    List<User> selectUsers();
    void insertUsers(User usersEntity);
    User findById(int id);
    List<User> findByName(String  name);
    List<User> findBySurname(String surname);
}
