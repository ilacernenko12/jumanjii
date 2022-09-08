package com.overone.first_spring_mvs_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/")
public class MainController {
@GetMapping
    public String getMainPage(){
    return "index";
}
}
