package com.thoughtworks.capability.gtb.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private int id;
    private List<User> users;

    public Group(int id, String s) {
        this.id = id;
        this.users = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void addUser(User user) {
        this.users.add(user);
    }
}

