package com.example.first_simple_project.controller;

import com.example.first_simple_project.model.User;
import com.example.first_simple_project.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private  final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping
    public  String createUser(@RequestBody User user){
        return userService.createuser(user);
    }
    @GetMapping
    public List<User> getAllUser(){
        return userService.getALlUser();
    }

}