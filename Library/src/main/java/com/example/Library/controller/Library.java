package com.example.Library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Library {
    @GetMapping("/bookList")
    public String BookList(){
        return "BookList";
    }
}
