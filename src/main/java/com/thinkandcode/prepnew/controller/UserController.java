package com.thinkandcode.prepnew.controller;


import com.thinkandcode.prepnew.model.User;
import com.thinkandcode.prepnew.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping(path = "/api")
public class UserController {


    public final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/getUser")
    ResponseEntity<List<User>> fetchUser(@RequestParam(value =  "name") String name){
        log.info("inside ---> {}",name);
        List<User> userList = userService.getUser();
        return new ResponseEntity<>(userList, HttpStatus.ACCEPTED);
    }
}
