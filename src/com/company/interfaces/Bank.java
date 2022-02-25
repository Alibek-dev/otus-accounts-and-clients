package com.company.interfaces;

import com.company.Account;
import com.company.Client;

import java.util.HashMap;
import java.util.List;

public interface Bank {
    Client getClient(Integer clientId);

    List<Account> getAccounts(String fullName);

    void printAccountMap(HashMap<Integer, Client> hashMap);

    void printClientsMap(HashMap<String, List<Account>> hashMap);
}
