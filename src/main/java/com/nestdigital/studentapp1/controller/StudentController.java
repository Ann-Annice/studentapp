package com.nestdigital.studentapp1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
   @GetMapping("/")
    public String Homepage(){
        return "welcome to my homepage";

    }
@GetMapping("/contact")
public  String Contact(){
       return "Welcome to contact page";
    }


}
