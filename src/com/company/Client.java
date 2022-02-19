package com.company;

public record Client(int id, String fullName, int age) {

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }
}
