package com.example.listig.service;


import com.example.listig.dao.LUser;

import com.example.listig.dto.UserDto;
import com.example.listig.exceptions.UserCreationException;
import com.example.listig.exceptions.InvalidPasswordException;
import com.example.listig.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;


@Service
public class UserService {
    private static final Logger logger = Logger.getLogger( UserService.class.getName() );
    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder encoder;

    public Long findUserIdByUsername(String username){
        return userRepository.getUserByUsername(username).getId();
    }

    public UserDto createUser(UserDto user, String password, String passwordConfirm) throws InvalidPasswordException, UserCreationException {
        if(password.equals(passwordConfirm)){
            throw new InvalidPasswordException("Passwords don't match");
        } else if (userRepository.existsByEmail(user.getEmail())) {
            throw new UserCreationException("There is already an account associated with this email");

        } else if (userRepository.existsByUsername(user.getUsername())) {
            throw new UserCreationException("Username is taken");

        } else{
            LUser createUser = new LUser(user);
            createUser.setPwHash(encoder.encode(password));
            createUser = userRepository.save(createUser);
            return new UserDto(createUser);
        }

    }

    public void updatePassword(String username, String oldPassword, String newPassword, String passwordConfirm) throws InvalidPasswordException {
        LUser user = userRepository.getUserByUsername(username);

        if(!encoder.matches(oldPassword,user.getPwHash())) {
            throw new InvalidPasswordException("Current password does not match");
        }
        if(!newPassword.equals(passwordConfirm)){
            throw new InvalidPasswordException("New passwords don't match");
        }
        else user.setPwHash(encoder.encode(newPassword));
    }

    public void delete(String username) {
        LUser user = userRepository.findUserByUsername(username);
        userRepository.delete(user);
    }


    public LUser loadUserByUsername(String username){
        return userRepository.findUserByUsername(username);
    }
}
