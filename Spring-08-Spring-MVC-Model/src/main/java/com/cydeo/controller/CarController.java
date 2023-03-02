package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/car")
public class CarController {

    @RequestMapping("/info")
    public String carInfo(@RequestParam String make,@RequestParam int year, Model model){

        model.addAttribute("make", make);
        model.addAttribute("year", 2021);
        System.out.println(make);
        return "car/car-info";
    }
}
