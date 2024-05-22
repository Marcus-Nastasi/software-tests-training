package com.santander.tests.Domain.Bank;

import com.santander.tests.Domain.Account.Account;
import com.santander.tests.Domain.Client.Person;

import java.util.HashSet;
import java.util.Objects;

public class Bank {

    private final HashSet<Person> clientHashSet = new HashSet<>();
    private final HashSet<Account> accountHashSet = new HashSet<>();

    public Bank() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(clientHashSet, bank.clientHashSet) && Objects.equals(accountHashSet, bank.accountHashSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientHashSet, accountHashSet);
    }

    public void addClient(Person client) {
        this.clientHashSet.add(client);
    }

    public void addAccount(Account account) {
        this.accountHashSet.add(account);
    }
}


