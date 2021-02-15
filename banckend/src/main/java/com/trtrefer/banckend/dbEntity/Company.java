package com.trtrefer.banckend.dbEntity;

import javax.persistence.*;

import java.lang.reflect.Field;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "companys")
public class Company {

    private Long id;
    private String companyName;

    public Company() {
    }

    @Id
    @GeneratedValue(strategy= IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "companyName")
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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
