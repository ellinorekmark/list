package com.example.listig.dto;

import com.example.listig.dao.LUser;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserDto {
    @Pattern(regexp = "^[\\w-]{2,10}$", message= "Invalid username: Must be 2-10 characters, no special characters.")
    private String username;
    @Email(message="Must be a valid email address.")
    private String email;

    private LocalDateTime memberSince;


    public UserDto() {
    }
    public UserDto(LUser user) {
        this.username = user.getUsername();
        this.email = user.getEmail();
        this.memberSince = user.getMemberSince();
    }

    public UserDto(
            String username,
            String email,
            LocalDateTime memberSince) {
        this.username = username;
        this.email = email;
        this.memberSince = memberSince;
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

    public LocalDateTime getMemberSince() {
        return memberSince;
    }

    public void setMemberSince(LocalDateTime memberSince) {
        this.memberSince = memberSince;
    }

}
