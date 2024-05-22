package com.santander.tests.Domain.Account;

import com.santander.tests.Domain.Client.Client;

public abstract class Account implements IAccount {

    private final long id;
    private final long agency;
    private double balance;
    private final Client client;

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

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}


