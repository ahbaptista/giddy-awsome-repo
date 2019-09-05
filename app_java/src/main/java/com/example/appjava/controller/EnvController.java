package com.example.appjava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.Map;

@RestController
public class EnvController {

    private final com.example.appjava.service.EnvService envService;

    @Inject
    public EnvController(com.example.appjava.service.EnvService envService) {
        this.envService = envService;
    }

    @GetMapping("/")
    public Map getEnv(){
        return envService.getEnv();
    }
}
