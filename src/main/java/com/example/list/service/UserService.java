package com.example.list.service;

import com.example.list.dao.ListItem;
import com.example.list.dao.User;
import com.example.list.dao.UserList;
import com.example.list.dto.ItemDto;
import com.example.list.exceptions.AccountMissingException;
import com.example.list.exceptions.EmailExistsException;
import com.example.list.exceptions.InvalidPasswordException;
import com.example.list.ListType;
import com.example.list.dto.ListDto;
import com.example.list.dto.UserDto;
import com.example.list.repositories.ListItemRepository;
import com.example.list.repositories.UserListRepository;
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
    UserListRepository listRepository;
    @Autowired
    ListItemRepository itemRepository;
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

    public User login(String emailOrUsername, String password) throws InvalidPasswordException, AccountMissingException {
        if(emailOrUsername.contains("@")){
            return loginByEmail(emailOrUsername,password);
        }
        else{
             return loginByUsername(emailOrUsername,password);
        }
    }

    private User loginByUsername(String username, String password) throws AccountMissingException, InvalidPasswordException {
        String hash = userRepository.findPasswordByUsername(username);
        if(hash == null){
            logger.log(Level.INFO, "Username not found");
            throw new AccountMissingException();
        }
        if (passwordEncoder.matches(password, hash)) {
            this.user = userRepository.findUserByUsername(username);
            logger.log(Level.INFO,"Logged in user");
            return user;
        } else {
            logger.log(Level.INFO,"Invalid password");
            throw new InvalidPasswordException();
        }
    }

    private User loginByEmail(String email, String password) throws AccountMissingException, InvalidPasswordException {
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
        list = listRepository.save(list);
        user = updateUser();
        logger.log(Level.INFO, "AWESDGWFESEDES LIST HAS ID: "+list.getId());

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

    public Object getEmail() {
        return user.getEmail();
    }

    public UserList addToList(UserList list, ItemDto item) {
        logger.log(Level.INFO,"item has listId: "+item.getListId());
        ListItem listItem = (new ListItem(item));
        logger.log(Level.INFO,"listItem has listId: "+listItem.getListId());


        itemRepository.save(listItem);

        list = listRepository.getUserListById(list.getId());
        user = updateUser();
        return list;
    }

    public UserList getList(Long id) {
        return listRepository.getUserListById(id);
    }
}
