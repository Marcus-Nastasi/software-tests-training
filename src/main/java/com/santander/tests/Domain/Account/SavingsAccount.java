package com.santander.tests.Domain.Account;

import com.santander.tests.Domain.Client.Person;

public class SavingsAccount extends Account {

    public SavingsAccount(long id, long agency, Person client) {
        super(id, agency, client);
    }

    @Override
    public void withdraw(double value) {

    }

    @Override
    public void deposit(double value) {

    }

    @Override
    public void transferBetweenAccounts(Account accountTo, double value) {

    }
}


