package com.cydeo.controller;

import com.cydeo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name","Cydeo");
        model.addAttribute("course","MVC");

    String subject ="Collections";
    model.addAttribute("subject", subject);


    int id = new Random().nextInt();
    model.addAttribute("studentID",id);

    List <Integer> numbers= Arrays.asList(4,5,6,7,10);
    model.addAttribute("numbers", numbers);

    Student student = new Student(10, "Kime", "Smith");
    model.addAttribute("student",  student);



        return "student/welcome";
    }


}
