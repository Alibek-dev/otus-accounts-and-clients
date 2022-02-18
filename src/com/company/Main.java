package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }

    private List<Client> generateClients() {
        List<Client> clients = new ArrayList<Client>();
        clients.add(new Client(1, "Сысоев Чарльз Иванович", 27));
        clients.add(new Client(2, "Воронцов Цефас Викторович", 45));
        clients.add(new Client(3, "Горбачёв Феликс Артёмович", 44));
        clients.add(new Client(4, "Петрив Донат Богданович", 35));
        clients.add(new Client(5, "Желиба Харитон Евгеньевич", 52));
        clients.add(new Client(6, "Куликов Филипп Брониславович", 23));
        clients.add(new Client(7, "Сафонов Гарри Эдуардович", 25));
        clients.add(new Client(8, "Молчанов Глеб Викторович", 34));
        clients.add(new Client(9, "Суханов Назар Брониславович", 53));
        clients.add(new Client(10, "Зимин Марк Иванович", 22));
        return clients;
    }

    private List<Account> generateAccounts() {
        List<Account> accounts = new ArrayList<Account>();
        accounts.add(new Account(1, "Зимин Марк Иванович", 22000));
        accounts.add(new Account(2, "Молчанов Глеб Викторович", 27000));
        accounts.add(new Account(3, "Сафонов Гарри Эдуардович", 34000));
        accounts.add(new Account(4, "Молчанов Глеб Викторович", 456000));
        accounts.add(new Account(5, "Суханов Назар Брониславович", 237000));
        accounts.add(new Account(6, "Сафонов Гарри Эдуардович", 55000));
        accounts.add(new Account(7, "Петрив Донат Богданович", 4000));
        accounts.add(new Account(8, "Сысоев Чарльз Иванович", 88000));
        accounts.add(new Account(9, "Воронцов Цефас Викторович", 123000));
        accounts.add(new Account(10, "Горбачёв Феликс Артёмович", 99000));
        accounts.add(new Account(11, "Желиба Харитон Евгеньевич", 456000));
        accounts.add(new Account(12, "Суханов Назар Брониславович", 556000));
        accounts.add(new Account(13, "Петрив Донат Богданович", 4567000));
        accounts.add(new Account(14, "Куликов Филипп Брониславович", 876000));
        accounts.add(new Account(15, "Сафонов Гарри Эдуардович", 12000));
        accounts.add(new Account(16, "Зимин Марк Иванович", 49000));
        return accounts;
    }
}
