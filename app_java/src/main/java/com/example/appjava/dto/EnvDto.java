package com.example.appjava.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.HashMap;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnvDto implements Serializable {

    private HashMap<String, String> env;

    public HashMap<String, String> getEnv() {
        return env;
    }

    public void setEnv(HashMap<String, String> env) {
        this.env = env;
    }
}
