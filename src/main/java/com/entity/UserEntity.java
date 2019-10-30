package com.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "userbanklist")
public class UserEntity {
    private int idUser;
    private String nameUser;
    private String surnameUser;

    public UserEntity(int idUser, String nameUser, String surnameUser) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.surnameUser = surnameUser;
    }

    public UserEntity() {
    }

    @Id
    @Column(name = "idUser", nullable = false)
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "nameUser", nullable = false, length = 45)
    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    @Basic
    @Column(name = "surnameUser", nullable = false, length = 45)
    public String getSurnameUser() {
        return surnameUser;
    }

    public void setSurnameUser(String surnameUser) {
        this.surnameUser = surnameUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return idUser == that.idUser &&
                Objects.equals(nameUser, that.nameUser) &&
                Objects.equals(surnameUser, that.surnameUser);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idUser, nameUser, surnameUser);
    }
}
