package ru.stqa.pft.addressbook.model;

public class ContactData {
    private String firstname;
    private String middlename;
    private String lastname;
    private String nickname;
    private String title;

    public ContactData(String firstname, String middlename, String lastname, String nickname, String title) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.nickname = nickname;
        this.title = title;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getTitle() {
        return title;
    }
}