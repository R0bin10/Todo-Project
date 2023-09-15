package com.robin.todo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Leaving it for later testing
@RestController
public class TestController {

    @GetMapping("/health/check")
    public ResponseEntity<?> healthCheck() {
        return ResponseEntity.status(200).build();
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('USER')")
    public String userAccess() {
        return "User Content.";
    }

}
