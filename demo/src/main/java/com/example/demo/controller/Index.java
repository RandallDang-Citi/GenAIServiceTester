package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Linxingwu
 */
@RestController
public class Index {

    @GetMapping("/index")
    public String index(){
        return "hello world";
    }
}
