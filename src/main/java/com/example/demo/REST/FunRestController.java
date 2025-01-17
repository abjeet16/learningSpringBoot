package com.example.demo.REST;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // inject properties for coach.name and team.name
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;
    @GetMapping("/teamInfo")
    public String getTeamInfo(){
        return "Coach name : "+coachName+", Team name : "+teamName;
    }
    @GetMapping("/")
    public String sayHello(){
        return "Hello Abjeet";
    }

    @GetMapping("/a")
    public String mappingForA(){
        return "Abjeet Y";
    }

    @GetMapping("b")
    public String mappingForB(){
        return "B";
    }
}
