package org.example.kek2_service.controller;

import lombok.RequiredArgsConstructor;
import org.example.kek2_service.service.UserService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    private final String string = "3213333";

    private String string2;

}
