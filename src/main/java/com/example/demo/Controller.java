package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//import antlr.collections.List;

@RestController
@RequestMapping("api")
public class Controller {

    @Autowired
    private UserRepository userRepository;

//    public HelloWorldController(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    @GetMapping("/users")
    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping("/")
    public String helloWorld() {
        return "Hello, World!";
    }
}

