package com.example.first_simple_project.service;

import com.example.first_simple_project.model.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service

public class UserService {
    private List<User> users=new ArrayList<>();
    public List<User> getALlUser() {
        return users;

    }
    public String createuser(@RequestBody User user){
        users.add(user);
        return "user Added";

    }


}
