package com.example.list.service;

import com.example.list.dao.User;
import com.example.list.dao.UserList;
import com.example.list.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;


@Service
@SessionScope
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    ListService listService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    User user;

    public User createAccount(String email, String username, String password) throws EmailExistsException {
        if (userRepository.existsByEmail(email)) {
            throw new EmailExistsException();
        } else {
            String passwordHash = passwordEncoder.encode(password);
            User newUser = new User(email, username, passwordHash);
            this.user = userRepository.save(newUser);
            return user;
        }

    }

    public User login(String email, String password) throws InvalidPasswordException, AccountMissingException {

        String hash = userRepository.findPasswordByEmail(email);
        if(hash == null){
            throw new AccountMissingException();
        }
        if (passwordEncoder.matches(password, hash)) {
            this.user = userRepository.findUserByEmail(email);
            return user;
        } else {
            throw new InvalidPasswordException();
        }
    }

    public User updateUser(){
        this.user = userRepository.findUserById(user.getId());
        return user;
    }
    public User saveUser(User userToSave){
        this.user = userRepository.save(user);
        return user;
    }

    public void addList(UserList userList){
        userList.setUserId(user.getId());
        user.addList(userList);
        userRepository.save(user);
    }



}
