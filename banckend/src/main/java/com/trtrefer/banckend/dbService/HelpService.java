package com.trtrefer.banckend.dbService;

import com.trtrefer.banckend.dbEntity.Help;
import com.trtrefer.banckend.dbRepository.HelpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.Optional;

@Service
public class HelpService {

    @Autowired
    public HelpRepository helpRepository;

    public void addHelp(Help h){
        helpRepository.save(h);
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
            h.setAccepted(true);
            helpRepository.save(h);
            return true;
        }
        return false;
    }

}
