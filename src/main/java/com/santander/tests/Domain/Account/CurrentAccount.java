package com.santander.tests.Domain.Account;

import com.santander.tests.Domain.Client.Person;
import com.santander.tests.Exceptions.AccountException;

public class CurrentAccount extends Account {

    public CurrentAccount(long id, long agency, Person client) {
        super(id, agency, client);
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


