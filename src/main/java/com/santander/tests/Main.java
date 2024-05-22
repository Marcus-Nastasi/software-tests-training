package com.santander.tests;

import com.santander.tests.Domain.Account.Account;
import com.santander.tests.Domain.Account.CurrentAccount;
import com.santander.tests.Domain.Account.SavingsAccount;
import com.santander.tests.Domain.Bank.Bank;
import com.santander.tests.Domain.Client.Client;
import com.santander.tests.Domain.Client.Person;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Person client = new Client("Orga", "121872781");
        Account account = new CurrentAccount(1000, 1000, client);
        bank.addAccount(account);
        System.out.println(bank.getAccountHashSet());
    }
}


