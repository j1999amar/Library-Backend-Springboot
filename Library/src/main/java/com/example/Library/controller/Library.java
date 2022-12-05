package com.example.Library.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Library {
    @PostMapping()
    public String BookList(){
        return "BookList";
    }
}
