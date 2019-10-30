package com.dao;

import com.entity.UserEntity;

import java.util.List;

public interface IUser {

    List<UserEntity> selectUsers();
    void insertUsers(UserEntity usersEntity);
    UserEntity findById(int id);
    List<UserEntity> findByName( String  name);
    List<UserEntity> findBySurname(String surname);
}
