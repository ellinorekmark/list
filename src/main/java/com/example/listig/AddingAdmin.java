package com.example.listig;

import com.example.listig.user.UserService;
import com.example.listig.user.entities.UserRole;
import com.example.listig.user.repositories.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AddingAdmin implements CommandLineRunner {

    @Autowired
    UserRoleRepository userRoleRepository;

    @Autowired
    UserService userService;


    @Override
    public void run(String... args) throws Exception {
        List<UserRole> all = userRoleRepository.findAll();
        all.forEach(user -> user.setAccountRole("ROLE_USER"));
        userRoleRepository.saveAll(all);
        Long userId = userService.findUserIdByUsername("Ellinor");
        Long userId2 = userService.findUserIdByUsername("Redovisning");

        userRoleRepository.save(new UserRole(userId, "ROLE_ADMIN"));
        userRoleRepository.save(new UserRole(userId2, "ROLE_ADMIN"));
    }

}