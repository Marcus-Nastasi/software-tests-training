package com.santander.tests.Domain.Account;

import com.santander.tests.Domain.Client.Client;

public abstract class Account implements IAccount {

    protected final long id;
    protected final long agency;
    protected double balance;
    protected final Client client;

    protected Account(long id, long agency, Client client) {
        this.id = id;
        this.agency = agency;
        this.client = client;
        this.balance = 0.0;
    }

    @Override
    public abstract void withdraw(double value);

    @Override
    public abstract void deposit(double value);

    public Client getClient() {
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

    public void setBalance(double balance) {
        this.balance = balance;
    }
}


