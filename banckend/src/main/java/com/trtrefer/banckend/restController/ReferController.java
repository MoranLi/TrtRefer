package com.trtrefer.banckend.restController;

import com.trtrefer.banckend.dbEntity.Refer;
import com.trtrefer.banckend.dbService.ReferService;
import com.trtrefer.banckend.restEntity.RestRefer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReferController {

    @Autowired
    ReferService referService;

    @PostMapping("/refer")
    public ResponseEntity newRefer(@RequestBody RestRefer refer){
        if(refer.containsNullField()){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        Refer r = new Refer(refer);
        referService.addRefer(r);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/refer")
    public ResponseEntity getOneRefer(@RequestBody Long userId){
        
    }


}
