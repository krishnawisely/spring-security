package com.springsecurity.security.controller.healthcheck;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("status")
    public ResponseEntity<?> getHealthStatus(){
        return new ResponseEntity<>("my health", HttpStatus.OK);
    }
}
