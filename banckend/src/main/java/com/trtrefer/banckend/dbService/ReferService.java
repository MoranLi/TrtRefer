package com.trtrefer.banckend.dbService;

import com.trtrefer.banckend.dbEntity.Refer;
import com.trtrefer.banckend.dbRepository.ReferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.Optional;

@Service
public class ReferService {

    @Autowired
    public ReferRepository referRepository;

    public void addRefer(Refer r){
        referRepository.save(r);
    }

    public Optional<Refer> getRefer(Long referId){
        return referRepository.findById(referId);
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
