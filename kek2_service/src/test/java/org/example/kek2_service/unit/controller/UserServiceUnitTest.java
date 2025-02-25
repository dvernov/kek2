package org.example.kek2_service.unit.controller;


import org.example.kek2_service.controller.UserController;
import org.example.kek2_service.entity.User;
import org.example.kek2_service.repository.UserRepository;
import org.example.kek2_service.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

//@WebMvcTest(UserController.class)
@ExtendWith({MockitoExtension.class})
public class UserServiceUnitTest {

    //    @MockitoBean
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

//    @Autowired
//    private MockMvc mockMvc;

    @Test
    public void findByUsername_shouldReturnUser() {

        Optional<User> dummyUser = Optional.of(User.builder()
                .username("username")
                .id("some generated uuid")
                .build());

//        doReturn(dummyUser).when(userService).findByUsername("username");
        when(userService.findByUsername("username")).thenReturn(dummyUser);

        Optional<User> returnedUser = userService.findByUsername("username");

        assertTrue(returnedUser.isPresent());
        assertEquals("username", returnedUser.get().getUsername());
        assertNotNull(returnedUser.get().getId());

        verify(userRepository).findUserByUsername("username");
    }
}
