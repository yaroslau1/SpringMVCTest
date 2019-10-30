package com.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Account {

    @Id
    @Column
    private int accountId;

    @Column
    private int account;

    @Column
    private int userId;

    public Account(int idAccount, int account, int idUser) {
        this.accountId = idAccount;
        this.account = account;
        this.userId = idUser;
    }


    public Account(int idUser, int account) {
        this.userId = idUser;
        this.account = account;
    }

    public Account() {

    }

    public int getIdAccount() {
        return accountId;
    }

    public void setIdAccount(int idAccount) {
        this.accountId = idAccount;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getIdUser() {
        return userId;
    }

    public void setIdUser(int idUser) {
        this.userId = idUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account that = (Account) o;
        return accountId == that.accountId &&
                account == that.account &&
                userId == that.userId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(accountId, account, userId);
    }
}
