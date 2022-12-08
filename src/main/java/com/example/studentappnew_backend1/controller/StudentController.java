package com.example.studentappnew_backend1.controller;

import com.example.studentappnew_backend1.dao.StudentDao;
import com.example.studentappnew_backend1.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes ="application/json",produces = "application/json")
    public  String AddStudent(@RequestBody Students s){
        System.out.println(s.getName().toString());
        System.out.println(s.getRollno());
        System.out.println(s.getAdmno().toString());
        System.out.println(s.getCollege().toString());
        dao.save(s);
        return "Student Added Successfully";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Students> ViewStudent(){
        return (List<Students>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes ="application/json",produces = "application/json")
    public List<Students> SearchStudents(@RequestBody  Students s)
    {
        String admno = s.getAdmno().toString();
        System.out.println(admno);
        return (List<Students>) dao.SearchStudents(s.getAdmno());
    }





}
