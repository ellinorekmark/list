package com.example.listig.user;


import com.example.listig.exceptions.InvalidPasswordException;
import com.example.listig.exceptions.UserCreationException;
import com.example.listig.user.entities.LUser;
import com.example.listig.user.entities.UserRole;
import com.example.listig.user.repositories.UserRepository;
import com.example.listig.user.repositories.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserRoleRepository roleRepository;
    @Autowired
    PasswordEncoder encoder;


    public UserService() {
    }

    public UserService(UserRepository userRepository, UserRoleRepository roleRepository, PasswordEncoder encoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.encoder = encoder;
    }

    public Long findUserIdByUsername(String username) {
        return userRepository.getUserByUsername(username).getId();
    }

    public UserDto createUser(CreateUserDto user) throws InvalidPasswordException, UserCreationException {
        if (!user.getPassword().equals(user.getPasswordConfirm())) {
            throw new InvalidPasswordException("Passwords don't match");
        } else if (userRepository.existsByEmail(user.getEmail())) {
            throw new UserCreationException("There is already an account associated with this email");

        } else if (userRepository.existsByUsername(user.getUsername())) {
            throw new UserCreationException("Username is taken");

        } else {
            LUser createUser = new LUser(user);
            if (createUser.getMemberSince() == null) {
                createUser.setMemberSince(LocalDateTime.now());
            }
            createUser.setPwHash(encoder.encode(user.getPassword()));
            createUser = userRepository.save(createUser);
            roleRepository.save(new UserRole(createUser.getId(), "ROLE_USER"));
            return new UserDto(createUser);
        }

    }

    //TODO: can I remove this method?
    public LUser loadUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }

    public UserDto getUser(String userAuth) {
        LUser lUser = userRepository.findByUsername(userAuth);
        return new UserDto(lUser);
    }

    public Boolean doesUserExist(String username) {
        LUser user = userRepository.findUserByUsername(username);
        return user != null;
    }

    public UserDto renewPassword(String username, String newPassword) throws Exception {
        if(userRepository.existsByUsername(username)){
            LUser user = userRepository.getUserByUsername(username);
            user.setPwHash(encoder.encode(newPassword));
            user =  userRepository.save(user);
            return new UserDto(user);
        }
        else{
            throw new Exception("Unable to change password");
        }
    }
}
