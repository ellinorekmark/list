package com.example.listig.service;

import com.example.listig.dao.LUser;
import com.example.listig.dao.UserRole;
import com.example.listig.dto.CreateUserDto;
import com.example.listig.exceptions.InvalidPasswordException;
import com.example.listig.exceptions.UserCreationException;
import com.example.listig.repositories.UserRepository;
import com.example.listig.repositories.UserRoleRepository;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import static org.junit.jupiter.api.Assertions.assertThrows;


import java.util.Random;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class UserServiceTest {


    UserRepository userRepository = mock(UserRepository.class);
    UserRoleRepository roleRepository = mock(UserRoleRepository.class);
    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    ArgumentCaptor<LUser> userCaptor = ArgumentCaptor.forClass(LUser.class);
    UserService service = new UserService(userRepository,roleRepository,passwordEncoder);


    @Test
    void createNewUser() throws UserCreationException, InvalidPasswordException {
        CreateUserDto createUserDto = newCreateUserDto("user", "password");
        when(service.userRepository.existsByEmail(any())).thenReturn(false);
        when(service.userRepository.existsByUsername(any())).thenReturn(false);
        when(service.userRepository.save(any())).thenReturn(lUserFromDb(createUserDto));
        when(service.roleRepository.save(any())).thenReturn(new UserRole());

        service.createUser(createUserDto);

        verify(service.userRepository).save(userCaptor.capture());
        verify(service.userRepository, times(1)).save(any());
    }

    @Test
    void createUserFailsWhenEmailAlreadyExists(){
        CreateUserDto createUserDto = newCreateUserDto("user","password");
        when(service.userRepository.existsByEmail(any())).thenReturn(true);

        assertThrows(UserCreationException.class, () ->service.createUser(createUserDto));

        verify(service.userRepository, never()).findUserByUsername(any());
        verify(service.userRepository, never()).save(any());
        verifyNoInteractions(service.roleRepository);

    }
    @Test
    void createUserFailsWhenPasswordsDontMatch(){
        CreateUserDto createUserDto = newCreateUserDto("user","password");
        createUserDto.setPasswordConfirm("mismatch");

        assertThrows(InvalidPasswordException.class, () ->service.createUser(createUserDto));

        verifyNoInteractions(service.userRepository);
        verifyNoInteractions(service.roleRepository);
    }

    private static LUser lUserFromDb(CreateUserDto createUserDto) {
        Random random = new Random();
        LUser lUser = new LUser(createUserDto);
        lUser.setId(random.nextLong());

        return lUser;
    }

    private static CreateUserDto newCreateUserDto( String username, String password) {
        CreateUserDto user = new CreateUserDto();
        user.setUsername(username);
        user.setEmail(username+"@email.com");
        user.setPassword(password);
        user.setPasswordConfirm(password);
        return user;
    }

}