package com.trtrefer.banckend.restController;

import com.trtrefer.banckend.dbEntity.User;
import com.trtrefer.banckend.dbService.CompanyService;
import com.trtrefer.banckend.dbService.UserService;
import com.trtrefer.banckend.dbEntity.Company;
import com.trtrefer.banckend.restEntity.Creditial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class UserController {

    private final AtomicInteger idCounter = new AtomicInteger();

    @Autowired
    UserService userService;
    CompanyService companyService;

    @PostMapping("/adduser")
    public ResponseEntity addUser(@RequestBody User u){
        if(u.containsNullField()){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        userService.addNewUser(u);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/updateuser")
    public ResponseEntity updateUser(@RequestBody User u){
        if(u.containsNullField()){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        if(!userService.updateUser(u)){
            return new ResponseEntity<String>("can not find user", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(HttpStatus.OK);
    }

}
