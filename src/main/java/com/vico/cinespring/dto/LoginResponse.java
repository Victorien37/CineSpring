package com.vico.cinespring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginResponse {
    private String token;
    private String type = "Bearer";
    private String email;
    private String firstname;
    private String lastname;
    
    public LoginResponse(String token, String email, String firstname, String lastname) {
        this.token = token;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
    }
}