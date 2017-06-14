package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by geekyzk on 2017/6/12.
 */
@RestController
@RequestMapping
public class IndexCotroller {



    @GetMapping
    public String index(){
        return "spring demo";
    }
}
