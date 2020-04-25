package com.springsecurity.security.service.impl;

import com.springsecurity.security.domain.MyUserDetails;
import com.springsecurity.security.domain.User;
import com.springsecurity.security.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("userDetailsService")
public class MyUserDetailsService implements UserDetailsService {
    private UserRepository userRepository;
    @Autowired
    public MyUserDetailsService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUserName(userName);
        user.orElseThrow( () -> new UsernameNotFoundException("Not found:" + userName));
        return user.map(MyUserDetails::new).get();
    }
}
