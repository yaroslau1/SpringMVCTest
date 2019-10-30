package com.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "account", schema = "userbanklist")
public class AccountEntity {
    private int idAccount;
    private int account;
    private int idUser;

    public  AccountEntity(int idAccount,int account,int idUser){
        this.idAccount=idAccount;
        this.account=account;
        this.idUser=idUser;
    }


    public AccountEntity(int idUser, int account){
        this.idUser=idUser;
        this.account=account;
    }

    public AccountEntity (){

    }
    @Id
    @Column(name = "idAccount", nullable = false)
    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    @Basic
    @Column(name = "account", nullable = false)
    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    @Basic
    @Column(name = "idUser", nullable = false)
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountEntity that = (AccountEntity) o;
        return idAccount == that.idAccount &&
                account == that.account &&
                idUser == that.idUser;
    }

    @Override
    public int hashCode() {

        return Objects.hash(idAccount, account, idUser);
    }
}
