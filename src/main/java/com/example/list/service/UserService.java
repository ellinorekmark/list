package com.example.list.service;

import com.example.list.dao.User;
import com.example.list.dao.UserList;
import com.example.list.exceptions.AccountMissingException;
import com.example.list.exceptions.EmailExistsException;
import com.example.list.exceptions.InvalidPasswordException;
import com.example.list.ListType;
import com.example.list.dto.ListDto;
import com.example.list.dto.UserDto;
import com.example.list.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


@Service
@SessionScope
public class UserService {
    private static final Logger logger = Logger.getLogger( UserService.class.getName() );
    @Autowired
    UserRepository userRepository;
    @Autowired
    ListService listService;
    @Autowired
    private PasswordEncoder passwordEncoder;

    User user;

    public User createAccount(UserDto userDto) throws EmailExistsException {
        if (userRepository.existsByEmail(userDto.getEmail())) {
            throw new EmailExistsException();
        } else {
            String passwordHash = passwordEncoder.encode(userDto.getPassword());
            User newUser = new User(userDto.getEmail(), userDto.getUsername(), passwordHash);
            this.user = userRepository.save(newUser);
            return user;
        }

    }

    public User login(String email, String password) throws InvalidPasswordException, AccountMissingException {

        String hash = userRepository.findPasswordByEmail(email);
        if(hash == null){
            logger.log(Level.INFO, "Email not found");
            throw new AccountMissingException();
        }
        if (passwordEncoder.matches(password, hash)) {
            this.user = userRepository.findUserByEmail(email);
            logger.log(Level.INFO,"Logged in user");
            return user;
        } else {
            logger.log(Level.INFO,"Invalid password");
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

    public UserList addList(ListDto newList){
        UserList list = new UserList();
        list.setUserId(user.getId());
        list.setName(newList.getName());
        list.setType(ListType.valueOf(newList.getType().toUpperCase()));
        list = listService.save(list);
        user = updateUser();
        return list;

    }


    public boolean isLoggedIn() {
        return user != null;
    }
    public User getUser(){
        return user;
    }

    public List<UserList> getLists() {
        return user.getLists();
    }

    public String getUsername() {
        return user.getUsername();
    }
}
