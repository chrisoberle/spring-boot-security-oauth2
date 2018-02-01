package com.baeldung.model;

public class User {

    private final long id;
    private final String username;
    private final int age;

    public User(long id, String username, int age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }
}
