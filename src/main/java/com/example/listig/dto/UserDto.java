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

    @NotBlank //TODO: Validation: set in past
    private LocalDate birthday;

    private LocalDateTime memberSince;

    private boolean anonymous_data_allowed;


    public UserDto() {
    }
    public UserDto(LUser user) {
        this.username = user.getUsername();
        this.email = user.getEmail();
        this.birthday = user.getBirthday();
        this.memberSince = user.getMemberSince();
        this.anonymous_data_allowed = user.isAnonymousDataAllowed();
    }

    public UserDto(
            String username,
            String email,
            LocalDate birthday,
            LocalDateTime memberSince,
            boolean anonymous_data_allowed) {
        this.username = username;
        this.email = email;
        this.birthday = birthday;
        this.memberSince = memberSince;
        this.anonymous_data_allowed = anonymous_data_allowed;
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDateTime getMemberSince() {
        return memberSince;
    }

    public void setMemberSince(LocalDateTime memberSince) {
        this.memberSince = memberSince;
    }

    public boolean isAnonymous_data_allowed() {
        return anonymous_data_allowed;
    }

    public void setAnonymous_data_allowed(boolean anonymous_data_allowed) {
        this.anonymous_data_allowed = anonymous_data_allowed;
    }
}
