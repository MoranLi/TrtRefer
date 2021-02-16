package com.trtrefer.banckend.dbEntity;

import com.trtrefer.banckend.restEntity.RestCompany;

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

    public Company(RestCompany c){
        companyName = c.getName();
    }

    public Company(String companyName) {
        this.companyName = companyName;
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



}
