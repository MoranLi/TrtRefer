package com.trtrefer.banckend.service;

import com.trtrefer.banckend.entity.Help;
import com.trtrefer.banckend.entity.Refer;
import com.trtrefer.banckend.repository.HelpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.LinkedList;
import java.util.Optional;

@Service
public class HelpService {

    @Autowired
    public HelpRepository helpRepository;

    public Help addHelp(Long userId, Date date, Long companyId, Long jobId){
        Help h = new Help();
        h.setUserId(userId);
        h.setDate(date);
        h.setCompanyId(companyId);
        h.setJobId(jobId);
        h.setStatus(false);
        helpRepository.save(h);
        return h;
    }

    public LinkedList<Help> getUserHelp(Long userId){
        LinkedList<Help> helpLinkedList = new LinkedList<>();
        for(Help h: helpRepository.findAll()){
            if(h.getUserId().equals(userId)){
                helpLinkedList.add(h);
            }
        }
        return helpLinkedList;
    }

    public boolean updateHelp(Long helpId){
        Optional<Help> o = helpRepository.findById(helpId);
        if(o.isPresent()){
            Help h = o.get();
            h.setStatus(true);
            helpRepository.save(h);
            return true;
        }
        return false;
    }

}
