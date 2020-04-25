package com.springsecurity.security.service.impl;

import com.springsecurity.security.domain.User;
import com.springsecurity.security.repository.UserRepository;
import com.springsecurity.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public Optional<User> findByUserName(String userName){
        return userRepository.findByUserName(userName);
    }
}
