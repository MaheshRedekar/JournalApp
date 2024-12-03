package com.journalApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("/HC")
    public String healthcheck(){
        return "Health is fine..";
    }
}
