package com.trtrefer.banckend.dbService;

import com.trtrefer.banckend.dbEntity.Job;
import com.trtrefer.banckend.dbRepository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JobService {

    @Autowired
    JobRepository jobRepository;

    public void addJob(Job j){
        jobRepository.save(j);
    }

    public Optional<Job> getJob(Long jobId){
        Optional<Job> o = jobRepository.findById(jobId);
        return o;
    }

}
