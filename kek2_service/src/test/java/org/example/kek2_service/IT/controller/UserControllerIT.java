package org.example.kek2_service.IT.controller;

import org.example.kek2_service.controller.UserController;
import org.example.kek2_service.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.testcontainers.junit.jupiter.Testcontainers;


//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@WebMvcTest(UserController.class)
public class UserControllerIT {


    @MockitoBean
    private UserService userService;

    @Autowired
    private MockMvc mockMvc;

//    @Autowired
//    private TestRestTemplate testRestTemplate;

    @Test
    public void getUserByIdTest() {

    }

    @Test
    public void getAllUsers() {

    }

    @Test
    public void deleteUserByIdTest() {

    }

}
