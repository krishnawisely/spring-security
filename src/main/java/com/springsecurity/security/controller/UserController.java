package com.springsecurity.security.controller;

import com.springsecurity.security.domain.User;
import com.springsecurity.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
    private UserService userService;
    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }
    @GetMapping("/users")
    public ResponseEntity<?> findByUserName(@RequestParam String userName){
        Optional<User> user =userService.findByUserName(userName);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
