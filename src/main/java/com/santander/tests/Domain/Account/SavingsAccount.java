package com.santander.tests.Domain.Account;

import com.santander.tests.Domain.Client.Person;
import com.santander.tests.Exceptions.AccountException;

public class SavingsAccount extends Account {

    private final double profitPercentual = 0.1;

    public SavingsAccount(long id, long agency, Person client) {
        super(id, agency, client);
    }

    public void profit() {
        this.setBalance(this.getBalance() + (this.getBalance() * this.profitPercentual));
    }

    @Override
    public void withdraw(double value) throws AccountException {
        if (this.getBalance() < value) throw new AccountException("Balance lower than value");
        this.setBalance(this.getBalance() - value);
}

    @Override
    public void deposit(double value) {
        this.setBalance(this.getBalance() + value);
    }

    @Override
    public void transferBetweenAccounts(Account accountTo, double value) throws AccountException {
        this.withdraw(value);
        accountTo.deposit(value);
    }
}


