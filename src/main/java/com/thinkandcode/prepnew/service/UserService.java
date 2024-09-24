package com.thinkandcode.prepnew.service;

import com.thinkandcode.prepnew.model.User;
import com.thinkandcode.prepnew.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserService {


     public  final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUser() {
       log.info("get all user {}",userRepository.getALLUser().toString());
       return userRepository.getALLUser();
    }
}
