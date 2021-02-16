package com.trtrefer.banckend.restController;

import com.trtrefer.banckend.dbEntity.Job;
import com.trtrefer.banckend.dbService.JobService;
import com.trtrefer.banckend.dbService.UserService;
import com.trtrefer.banckend.restEntity.RestJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class JobController {

    @Autowired
    JobService jobService;

    @PostMapping("/job")
    public ResponseEntity newJob(@RequestBody RestJob restJob){
        if(restJob.containsNullField()){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        Job job = new Job(restJob);
        jobService.addJob(job);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/job/exist")
    public ResponseEntity jobExist(@RequestBody String jobLink){
        if(jobLink == null){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        Optional<Job> job = jobService.findJob(jobLink);
        if(job.isEmpty()){
            return new ResponseEntity<String>("do not find exist job",HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Long>(job.get().getId(),HttpStatus.OK);
    }

}
