package com.trtrefer.banckend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String username;
    private String password;
    private String email;
    private Long companyId;
    private Boolean willingness;

    public User() {
    }

    public User(Long id, String username, String password, String email, Long companyId, Boolean willingness) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.companyId = companyId;
        this.willingness = willingness;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Boolean getWillingness() {
        return willingness;
    }

    public void setWillingness(Boolean willingness) {
        this.willingness = willingness;
    }
}
