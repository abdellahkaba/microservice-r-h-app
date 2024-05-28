package com.kaba.authenticateservice.controllers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {
    private String token;
    private long expiresIn;
    public String getToken() {
        return token;
    }
    public LoginResponse setToken(String token) {
        this.token = token;
        return this;
    }
    public long getExpiresIn() {
        return expiresIn;
    }
    public LoginResponse setExpiresIn(long expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

}
