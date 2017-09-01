package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by heiqie on 2017/9/1.
 */
@RestController
public class ConfigController {


    @Value("${name}")
    private String name;

    @RequestMapping(value = "/name")
    public String name() {
        return this.name;
    }
}
