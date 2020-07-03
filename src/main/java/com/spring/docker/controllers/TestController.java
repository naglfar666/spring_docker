package com.spring.docker.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/test")
@CrossOrigin
public class TestController {

    @GetMapping(path = "/user")
    public ResponseEntity<?> user() {
        return ResponseEntity.ok("user info");
    }

}
