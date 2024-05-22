package com.santander.tests.Domain.Client;

import com.santander.tests.Domain.Account.Account;
import com.santander.tests.Exceptions.AccountException;
import com.santander.tests.Exceptions.ClientException;

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

    public void removeAccount(Account account) throws ClientException {
        if (this.accountList.isEmpty()) throw new ClientException("Accounts list empty");
        if (!this.accountList.contains(account)) throw new ClientException("Account does not exists on list");
        this.accountList.remove(account);
    }

    public List<Account> getAccountList() {
        return accountList;
    }
}


