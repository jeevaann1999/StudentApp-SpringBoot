package com.example.studentappnew_backend1.controller;

import com.example.studentappnew_backend1.model.Students;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/")
    public String Homepage(){
        return "Welcome to my website";
    }


    @PostMapping("/add")
    public  String AddStudent(@RequestBody Students s){
        System.out.println(s.toString());
        return "Student Added Successfully";
    }

}
