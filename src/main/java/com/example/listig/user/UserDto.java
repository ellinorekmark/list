package com.example.listig.user;

import com.example.listig.user.entities.LUser;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDateTime;

public class UserDto {
    @Pattern(regexp = "^[\\w-]{2,20}$", message = "Invalid username: Must be 2-20 characters, no special characters.")
    private String username;
    @Email(message = "Must be a valid email address.")
    private String email;
    private LocalDateTime memberSince;

    public UserDto() {
    }

    public UserDto(LUser user) {
        this.username = user.getUsername();
        this.email = user.getEmail();
        this.memberSince = user.getMemberSince();
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
