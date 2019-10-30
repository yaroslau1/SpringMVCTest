package com.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class User {

    @Id
    @Column
    private int userid;

    @Column
    private String name;

    @Column
    private String sureName;

    public User(int idUser, String nameUser, String surnameUser) {
        this.userid = idUser;
        this.name = nameUser;
        this.sureName = surnameUser;
    }

    public User() {
    }


    public int getIdUser() {
        return userid;
    }

    public void setIdUser(int idUser) {
        this.userid = idUser;
    }

    public String getNameUser() {
        return name;
    }

    public void setNameUser(String nameUser) {
        this.name = nameUser;
    }

    public String getSurnameUser() {
        return sureName;
    }

    public void setSurnameUser(String surnameUser) {
        this.sureName = surnameUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User that = (User) o;
        return userid == that.userid &&
                Objects.equals(name, that.name) &&
                Objects.equals(sureName, that.sureName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userid, name, sureName);
    }
}
