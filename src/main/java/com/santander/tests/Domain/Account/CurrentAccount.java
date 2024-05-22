package com.santander.tests.Domain.Account;

import com.santander.tests.Domain.Client.Client;

public class CurrentAccount extends Account {

    public CurrentAccount(long id, long agency, Client client) {
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


