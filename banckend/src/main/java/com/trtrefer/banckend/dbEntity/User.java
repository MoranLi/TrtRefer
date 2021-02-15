package com.trtrefer.banckend.dbEntity;

import javax.persistence.*;
import java.lang.reflect.Field;

@Entity
@Table(name = "users")
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

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "companyId")
    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    @Column(name = "willingness")
    public Boolean getWillingness() {
        return willingness;
    }

    public void setWillingness(Boolean willingness) {
        this.willingness = willingness;
    }

    public boolean containsNullField(){
        try {
            for (Field f : this.getClass().getDeclaredFields()) {
                f.setAccessible(true);
                if (f.get(this) == null) {
                    return true;
                }
            }
        } catch (IllegalAccessException e){
            return true;
        }
        return false;
    }

}
