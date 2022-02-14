package com.company;

import java.util.ArrayList;
import java.util.Collection;
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
}
