package com.trtrefer.banckend.restController;

import com.trtrefer.banckend.dbEntity.Company;
import com.trtrefer.banckend.dbService.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @PostMapping
    public ResponseEntity addCompany(@RequestBody Company c){

        companyService.addCompany();
    }

}
