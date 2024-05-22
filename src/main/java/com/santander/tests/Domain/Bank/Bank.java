package com.santander.tests.Domain.Bank;

import com.santander.tests.Domain.Account.Account;
import com.santander.tests.Domain.Client.Person;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class Bank {

    private final HashSet<Person> clientHashSet = new HashSet<>();
    private final HashMap<Long, Account> accountHashMap = new HashMap<>();

    public Bank() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(clientHashSet, bank.clientHashSet) && Objects.equals(accountHashMap, bank.accountHashMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientHashSet, accountHashMap);
    }

    public void addClient(Person client) {
        this.clientHashSet.add(client);
    }

    public void addAccount(Account account) {
        this.accountHashMap.put(account.getId(), account);
    }

    public Person getClient(Person client) {
        return this.clientHashSet.stream().filter(c -> c.equals(client)).findFirst().get();
    }

    public Person getClient(String cpf) {
        return this.clientHashSet.stream().filter(c -> c.getCpf().equals(cpf)).findFirst().get();
    }

    public Account getAccount(long id) {
        return this.accountHashMap.get(id);
    }

    public HashSet<Person> getClientHashSet() {
        return clientHashSet;
    }
}


