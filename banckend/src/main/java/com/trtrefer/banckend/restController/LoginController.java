package com.trtrefer.banckend.restController;

import com.trtrefer.banckend.dbService.UserService;
import com.trtrefer.banckend.restEntity.Creditial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody Creditial c){
        if(c.containsNullField()){
            return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
        }
        if(!userService.verifyUser(c.getUsername(),c.getPassword())){
            return new ResponseEntity(HttpStatus.UNAUTHORIZED);
        }
        return new ResponseEntity(HttpStatus.OK);
    }

}
