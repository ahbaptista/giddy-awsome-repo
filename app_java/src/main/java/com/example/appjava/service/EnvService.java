package com.example.appjava.service;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class EnvService {

    public EnvService() { }

    public Map getEnv() {
        return System.getenv();
    }
}
