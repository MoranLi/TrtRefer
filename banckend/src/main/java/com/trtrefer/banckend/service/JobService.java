package com.trtrefer.banckend.service;

import com.trtrefer.banckend.entity.Job;
import com.trtrefer.banckend.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JobService {

    @Autowired
    JobRepository jobRepository;

    @Autowired
    private CompanyService companyService;

    public Job addJob(String jobTitle, String jobLink, String jobCodeId, String companyName){
        Job j = new Job();
        j.setJobTitle(jobTitle);
        j.setJobLink(jobLink);
        if(jobCodeId != null){
            j.setJobCodeId(jobCodeId);
        }
        Long companyId = companyService.getCompany(companyName);
        if(companyId == null){
            return null;
        }
        j.setCompanyId(companyId);
        jobRepository.save(j);
        return j;
    }

    public Job getJob(Long jobId){
        Optional<Job> o = jobRepository.findById(jobId);
        if(o.isPresent()){
            return o.get();
        }
        return null;
    }

}
