package com.santander.tests.Domain.Account;

import com.santander.tests.Domain.Client.Person;

public class CurrentAccount extends Account {

    public CurrentAccount(long id, long agency, Person client) {
        super(id, agency, client);
    }

    @Override
    public void withdraw(double value) {
        this.setBalance(this.getBalance() - value);
    }

    @Override
    public void deposit(double value) {
        this.setBalance(this.getBalance() + value);
    }
}


