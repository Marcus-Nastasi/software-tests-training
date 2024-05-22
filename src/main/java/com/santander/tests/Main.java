package com.santander.tests;

import com.santander.tests.Domain.Account.Account;
import com.santander.tests.Domain.Account.SavingsAccount;
import com.santander.tests.Domain.Bank.Bank;
import com.santander.tests.Domain.Client.Client;
import com.santander.tests.Domain.Client.Person;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Person client = new Client("Orga", "121872781");
        bank.addClient(client);
        System.out.println(bank.getClient(client).getName());
    }
}


