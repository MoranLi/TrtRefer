package com.trtrefer.banckend.dbService;

import com.trtrefer.banckend.dbEntity.User;
import com.trtrefer.banckend.dbRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void addNewUser (User u) {
        userRepository.save(u);
    }

    public boolean verifyUser(String username, String password){
        for(User u : userRepository.findAll()){
            if (u.getUsername().equals(username)){
                return password.equals(u.getPassword());
            }
        }
        return false;
    }

    public Optional<User> getUser(String username, String password){
        for(User u : userRepository.findAll()){
            if (u.getUsername().equals(username)){
                return Optional.of(u);
            }
        }
        return Optional.empty();
    }

    public boolean updateUser(User u){
        Optional<User> exist = getUser(u.getUsername(),u.getPassword());
        if(exist.isEmpty()){
            return false;
        }
        User existUser = exist.get();
        existUser.setEmail(u.getEmail());
        existUser.setCompanyId(u.getCompanyId());
        existUser.setWillingness(u.getWillingness());
        return true;
    }

}
