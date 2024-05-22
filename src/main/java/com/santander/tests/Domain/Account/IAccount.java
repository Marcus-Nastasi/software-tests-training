package com.santander.tests.Domain.Account;

public interface IAccount {

    void withdraw(double value);
    void deposit(double value);
    void transferBetweenAccounts(Account accountTo, double value);
}


