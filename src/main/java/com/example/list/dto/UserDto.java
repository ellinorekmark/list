package com.example.list.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class UserDto {
    @Pattern(regexp = "^[\\w-]{2,10}$", message= "Invalid username: Must be 2-10 characters, no special characters.")
    private String username;
    @Email(message="Must be a valid email address.")
    private String email;
    @NotBlank(message="Must be a valid password.")
    private String password;

    public UserDto() {
    }

    public UserDto(String username, String email, String password) {
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
