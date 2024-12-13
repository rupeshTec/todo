package com.practice.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ToDo {
    @GetMapping("/")
    public String home() {
        return "Working!!";
    }
    
}
