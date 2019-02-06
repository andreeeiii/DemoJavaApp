package com.sociafy.social.domain;

import java.util.Date;

public class User {

    private String username;
    private String password;
    private Boolean isAdmin;


    public User() {}

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.isAdmin = false;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }
}
