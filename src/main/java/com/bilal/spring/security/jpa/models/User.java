package com.bilal.spring.security.jpa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId ;

    private String userName ;

    private String password;
    private boolean active;
    private String roles;

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public boolean isActive() {
        return active;
    }

    public String getRoles() {
        return roles;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }


}
