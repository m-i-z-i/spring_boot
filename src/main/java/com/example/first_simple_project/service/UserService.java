package com.example.first_simple_project.service;

import com.example.first_simple_project.model.User;
import com.example.first_simple_project.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    // Constructor Injection
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Create User
    public String addUser(User user) {
        userRepository.save(user);
        return "User saved to database!";
    }

    // Get All Users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Get User by ID
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    // Delete User
    public String deleteUser(Long id) {
        userRepository.deleteById(id);
        return "User deleted!";
    }

    // Update User
    public User updateUser(Long id, User newUser) {
        User user = userRepository.findById(id).orElse(null);

        if (user != null) {
            user.setName(newUser.getName());
            user.setAge(newUser.getAge());
            return userRepository.save(user);
        }

        return null;
    }
}