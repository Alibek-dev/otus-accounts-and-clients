package com.company;

public record Account(int id, String fullName, int bill) {

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
