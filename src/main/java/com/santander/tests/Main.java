package com.santander.tests;

import com.santander.tests.Domain.Account.Account;
import com.santander.tests.Domain.Account.SavingsAccount;
import com.santander.tests.Domain.Client.Client;

public class Main {
    public static void main(String[] args) {
        Account account = new SavingsAccount(100, 222, new Client("Jorge", "2781271827"));
    }
}


