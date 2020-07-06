package com.spring.docker.controllers;

import com.spring.docker.entities.User;
import com.spring.docker.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/test")
@CrossOrigin
public class TestController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping(path = "/user")
    public ResponseEntity<?> user() {
        return ResponseEntity.ok("user info");
    }

    @PostMapping(path = "/save")
    public ResponseEntity<?> save(@RequestParam String email, @RequestParam String password) {

        User user = new User(null, email, password);

        userRepo.save(user);

        return ResponseEntity.ok("saved");

    }

}
