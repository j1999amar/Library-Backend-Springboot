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
    @PostMapping("/bookEntry")
    public String BookEntry(){
        return "BookEntry";
    }
    @PostMapping("/bookSearch")
    public String BookSearch(){
        return "BookSearch";
    }
    @PostMapping("/bookDelete")
    public String BookDelete(){
        return "BookDelete";
    }
    @PostMapping("/bookIssue")
    public String BookIssue(){
        return "BookIssue";
    }
}
