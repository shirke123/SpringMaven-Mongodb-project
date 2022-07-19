package com.example.Java10febSpringMaven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
   private  StudentRepository studentRepository;


    @PostMapping( "saveStudent")
    public String saveStudent(@RequestBody Student student) {
        studentRepository.save(student);
        return "saved";
    }
}
