package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @PostConstruct
    public void test(){
        System.out.println("ciao");
    }
}
