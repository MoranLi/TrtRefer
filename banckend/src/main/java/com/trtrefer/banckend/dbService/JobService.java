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

    public Optional<Job> findJob(String jobLink){
        for(Job job: jobRepository.findAll()){
            if (job.getJobLink().equals(jobLink)){
                return Optional.of(job);
            }
        }
        return Optional.empty();
    }

}
