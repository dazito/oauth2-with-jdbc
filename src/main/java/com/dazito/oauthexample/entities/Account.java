package com.dazito.oauthexample.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by daz on 29/06/2017.
 */
@Entity
public class Account {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "username", length = 128)
    private String username;
    @Column(name = "password", length = 128)
    private String password;

    public Account() {
    }

    public Account(String username, String password) {

        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
