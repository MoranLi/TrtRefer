package com.trtrefer.banckend.service;

import com.trtrefer.banckend.entity.Company;
import com.trtrefer.banckend.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    public void addCompany(String name){
        Company c = new Company();
        c.setCompanyName(name);
        companyRepository.save(c);
    }

    public Long getCompany(String name){
        for(Company c : companyRepository.findAll()){
            if (c.getCompanyName().equals(name)){
                return c.getId();
            }
        }
        return null;
    }

}
