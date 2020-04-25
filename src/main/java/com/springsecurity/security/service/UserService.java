package com.springsecurity.security.service;

import com.springsecurity.security.domain.User;

import java.util.Optional;

public interface UserService {
    public Optional<User> findByUserName(String email);
}
