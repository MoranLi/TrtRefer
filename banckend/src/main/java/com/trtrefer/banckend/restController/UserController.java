package com.trtrefer.banckend.restController;

import com.trtrefer.banckend.dbEntity.User;
import com.trtrefer.banckend.dbService.CompanyService;
import com.trtrefer.banckend.dbService.UserService;
import com.trtrefer.banckend.dbEntity.Company;
import com.trtrefer.banckend.restEntity.Creditial;
import com.trtrefer.banckend.restEntity.RestUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class UserController {

    private final AtomicInteger idCounter = new AtomicInteger();

    @Autowired
    UserService userService;

    @PostMapping("/user")
    public ResponseEntity addUser(@RequestBody RestUser u){
        if(u.containsNullField()){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        User user = new User(u);
        userService.addNewUser(user);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("/user")
    public ResponseEntity updateUser(@RequestBody RestUser u){
        if(u.containsNullField()){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        User user = new User(u);
        if(!userService.updateUser(user)){
            return new ResponseEntity<String>("can not find user", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/user")
    public ResponseEntity getUser(@RequestBody )

}
