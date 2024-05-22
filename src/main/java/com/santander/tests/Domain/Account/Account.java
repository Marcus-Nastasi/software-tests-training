package com.santander.tests.Domain.Account;

public abstract class Account implements IAccount {

    protected final long id;
    protected final long agency;
    protected double balance;

    public Account(long id, long agency) {
        this.id = id;
        this.agency = agency;
        this.balance = 0.0;
    }

    @Override
    public abstract void withdraw();

    @Override
    public abstract void deposit();

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


