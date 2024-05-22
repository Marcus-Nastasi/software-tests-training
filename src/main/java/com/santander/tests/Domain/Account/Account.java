package com.santander.tests.Domain.Account;

import com.santander.tests.Domain.Client.Client;
import com.santander.tests.Domain.Client.Person;

public abstract class Account implements IAccount {

    private final long id;
    private final long agency;
    private double balance;
    private final Person client;

    protected Account(long id, long agency, Person client) {
        this.id = id;
        this.agency = agency;
        this.client = client;
        this.balance = 0.0;
    }

    @Override
    public abstract void withdraw(double value);

    @Override
    public abstract void deposit(double value);

    @Override
    public abstract void transferBetweenAccounts(Account accountTo, double value);

    public Person getClient() {
        return client;
    }

    public long getId() {
        return id;
    }

    public long getAgency() {
        return agency;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}


