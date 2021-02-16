package com.trtrefer.banckend.restEntity;

import javax.persistence.Entity;
import java.lang.reflect.Field;

@Entity
public class RestUser {
    private String username;
    private String password;
    private String email;
    private Long companyId;
    private Boolean willingness;

    public RestUser() {
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
