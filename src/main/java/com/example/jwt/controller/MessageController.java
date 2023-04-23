package com.example.jwt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MessageController {
    
    @GetMapping("/message")
    public ResponseEntity<?> getMessage(){

        return ResponseEntity.ok().body("hello world");
    }
}
