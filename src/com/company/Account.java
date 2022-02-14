package com.company;

public class Account {
    private int id;
    private String fullName;
    private int bill;

    public Account(int id, String fullName, int bill) {
        this.id = id;
        this.fullName = fullName;
        this.bill = bill;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getBill() {
        return bill;
    }
}
