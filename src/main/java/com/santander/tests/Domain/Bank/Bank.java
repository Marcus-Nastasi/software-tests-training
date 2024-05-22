package com.santander.tests.Domain.Bank;

import com.santander.tests.Domain.Account.Account;
import com.santander.tests.Domain.Client.Person;
import com.santander.tests.Exceptions.BankException;

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

    public void addClient(Person client) throws BankException {
        if (this.getClient(client) != null) throw new BankException("Client already on bank");
        this.clientHashSet.add(client);
    }

    public void addAccount(Account account) throws BankException {
        if (this.accountHashMap.get(account.getId()) != null) throw new BankException("Account number already exists.");
        this.accountHashMap.put(account.getId(), account);
    }

    public Person getClient(Person client) {
        if (this.clientHashSet.isEmpty()) return null;
        return this.getClient(client.getCpf());
    }

    public Person getClient(String cpf) {
        if (this.clientHashSet.isEmpty()) return null;
        Person pFinded = null;
        for (Person p: this.clientHashSet) if (p.getCpf().equals(cpf)) pFinded = p;
        return pFinded;
    }

    public Account getAccount(long id) {
        return this.accountHashMap.get(id);
    }

    public HashMap<Long, Account> getAccountHashMap() {
        return accountHashMap;
    }

    public HashSet<Person> getClientHashSet() {
        return clientHashSet;
    }
}


