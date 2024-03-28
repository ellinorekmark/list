package com.example.list.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class SimpleUser {
    @Pattern(regexp = "^[\\w-]{2,10}$", message = "Invalid username")
    private String username;
    @Email
    private String email;
    @NotBlank
    private String password;

    public SimpleUser() {
    }

    public SimpleUser(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
