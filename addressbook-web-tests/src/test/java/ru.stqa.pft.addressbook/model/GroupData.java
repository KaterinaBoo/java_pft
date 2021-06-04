package ru.stqa.pft.addressbook.model;

public class GroupData {
private String username;
private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public GroupData(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
