package com.example.demo.tpcApp.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Authentication {

    private Integer errorCode = 0;
    private String user;
    private String password;

    public Authentication(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public Authentication() {
    }

    public void setNullParams(){
        this.setUser("");
        this.setPassword("");
    }

}