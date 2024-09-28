package com.example.program.presentation.controllers;

import com.example.program.business.logic.models.User;
import com.example.program.business.logic.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping
    public ArrayList<User> getUsers(){  
        return this.userService.getUsers();
    }

}
