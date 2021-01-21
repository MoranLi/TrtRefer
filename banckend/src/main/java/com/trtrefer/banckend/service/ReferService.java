package com.trtrefer.banckend.service;

import com.trtrefer.banckend.entity.Job;
import com.trtrefer.banckend.entity.Refer;
import com.trtrefer.banckend.repository.ReferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Optional;

@Service
public class ReferService {

    @Autowired
    public ReferRepository referRepository;

    public Refer addRefer(Long refererId, Long refereeId, Long jobId){
        Refer r = new Refer();
        r.setJobId(jobId);
        r.setRefereeId(refereeId);
        r.setRefererId(refererId);
        r.setAccepted(false);
        referRepository.save(r);
        return r;
    }

    public Refer getRefer(Long referId){
        Optional<Refer> o = referRepository.findById(referId);
        if(o.isPresent()){
            return o.get();
        }
        return null;
    }

    public LinkedList<Refer> getReferByUser(Long userId){
        LinkedList<Refer> referList = new LinkedList<Refer>();
        for(Refer r : referRepository.findAll()){
            if(r.getRefererId().equals(userId)){
                referList.add(r);
            }
        }
        return referList;
    }

    public boolean updateRefer(Long referId, Boolean condition){
        Optional<Refer> o = referRepository.findById(referId);
        if(o.isPresent()){
            Refer r = o.get();
            if(condition){
                r.setAccepted(true);
                referRepository.save(r);
            }
            else{
                referRepository.delete(r);
            }
            return true;
        }
        return false;
    }


}
