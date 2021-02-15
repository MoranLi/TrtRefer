package com.trtrefer.banckend.dbService;

import com.trtrefer.banckend.dbEntity.Company;
import com.trtrefer.banckend.dbRepository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    public void addCompany(Company c){
        companyRepository.save(c);
    }

    public Optional<Long> getCompanyId(String name){
        for(Company c : companyRepository.findAll()){
            if (c.getCompanyName().equals(name)){
                Optional.of(c.getId());
            }
        }
        return Optional.empty();
    }

}
