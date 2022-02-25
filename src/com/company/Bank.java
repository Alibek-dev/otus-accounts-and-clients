package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bank implements com.company.interfaces.Bank {
    private final List<Account> accounts;
    private final List<Client> clients;

    private final HashMap<String, List<Account>> clientsMap = new HashMap<>();

    private final HashMap<Integer, Client> accountsMap = new HashMap<>();

    public Bank(List<Account> accounts, List<Client> clients) {
        this.accounts = accounts;
        this.clients = clients;

        for (Client client : this.clients) {
            ArrayList<Account> tempAccounts = new ArrayList<>();
            for (Account account : this.accounts) {
                if (account.fullName().equals(client.fullName())) {
                    tempAccounts.add(account);
                }
            }
            clientsMap.put(client.fullName(), tempAccounts);
        }

        for (Account account : this.accounts) {
            Client tempClient = null;
            for (Client client : this.clients) {
                if (account.fullName().equals(client.fullName())) {
                    tempClient = client;
                }
            }
            accountsMap.put(account.id(), tempClient);
        }
    }

    public HashMap<String, List<Account>> getClientsMap() {
        return clientsMap;
    }

    public HashMap<Integer, Client> getAccountsMap() {
        return accountsMap;
    }

    public List<Account> getAccounts(String fullName) {
        return clientsMap.get(fullName);
    }
    public Client getClient(Integer clientId) { return  accountsMap.get(clientId); }

    public void printAccountMap(HashMap<Integer, Client> hashMap) {
        for (Integer name: hashMap.keySet()) {
            String key = name.toString();
            String value = hashMap.get(name).toString();
            System.out.println(key + ": " + value);
        }
    }

    public void printClientsMap(HashMap<String, List<Account>> hashMap) {
        for (String name: hashMap.keySet()) {
            String value = hashMap.get(name).toString();
            System.out.println(name + ": " + value);
        }
    }
}
