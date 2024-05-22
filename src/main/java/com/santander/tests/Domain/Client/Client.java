package com.santander.tests.Domain.Client;

import com.santander.tests.Domain.Account.Account;

import java.util.ArrayList;
import java.util.List;

public class Client extends Person {

    private final List<Account> accountList = new ArrayList<>();

    public Client(String name, String cpf) {
        super(name, cpf);
    }

    public void addAccount(Account account) {
        this.accountList.add(account);
    }

    public void removeAccount(Account account) {
        this.accountList.remove(account);
    }

    public List<Account> getAccountList() {
        return accountList;
    }
}


