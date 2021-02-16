package com.trtrefer.banckend.restController;

import com.trtrefer.banckend.restEntity.RestCompany;
import com.trtrefer.banckend.dbEntity.Company;
import com.trtrefer.banckend.dbService.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.Optional;

@RestController
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @PostMapping("/company")
    public ResponseEntity addCompany(@RequestBody RestCompany c){
        if(c.containsNullField()){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        Company company = new Company();
        company.setCompanyName(c.getName());
        companyService.addCompany(company);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/company")
    public ResponseEntity getCompany(@RequestBody String companyName){
        if(companyName == null){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        Optional<Long> id = companyService.getCompanyId(companyName);
        if(id.isEmpty()){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Long>(id.get(), HttpStatus.OK);
    }



}
