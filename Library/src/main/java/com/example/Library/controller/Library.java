package com.example.Library.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Library {
    @PostMapping("/bookList")
    public String BookList(){
        return "BookList";
    }
    @PostMapping("/bookEntry")
    public String BookEntry(){
        return "BookEntry";
    }
}
