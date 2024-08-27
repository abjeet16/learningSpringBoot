package com.example.demo.REST;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
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
