package com.myspring.controller;

import com.myspring.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {


    @GetMapping("/register")
//    @RequestMapping("/register")
    public String register(Model model){

        model.addAttribute("students", DataGenerator.createStudent());

        return "student/register";

    }

    @GetMapping("/welcome")
//    @RequestMapping("/welcome")
    public String info(){
        return "student/welcome";
    }

}
