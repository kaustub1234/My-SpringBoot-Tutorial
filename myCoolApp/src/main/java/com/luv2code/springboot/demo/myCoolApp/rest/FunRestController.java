package com.luv2code.springboot.demo.myCoolApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose '/' endpoint that returns hello world
//injecting properties for: coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfo()
    {
        return "Coach: "+coachName + ", Team name: "+teamName;
    }

    @GetMapping("/")
    public String sayHello()
    {
        return "<h1>Hello world</h1>";
    }

    @GetMapping("/fortune")
    public String getFortune()
    {
        return "<h1>Your fortune is as bright as light</h1>";
    }
}


