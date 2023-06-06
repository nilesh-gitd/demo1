package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller{
    private UserRepository userRepository;

    public void UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Controller(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public String getUsers(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return userRepository.findAll().toString();
    }

    @PostMapping("/users")
    public String createUser(User user) {
        userRepository.save(user);
        return "redirect:/users";
    }
}



//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
////import antlr.collections.List;
//
//@RestController
//@RequestMapping("api")
//public class Controller {
//
//    @Autowired
//    private UserRepository userRepository;
//
////    public HelloWorldController(UserRepository userRepository) {
////        this.userRepository = userRepository;
////    }
//
//    @GetMapping("/users")
//    public Iterable<User> getUsers() {
//        return userRepository.findAll();
//    }
//
//    @PostMapping("/users")
//    public User createUser(@RequestBody User user){
//        return userRepository.save(user);
//    }
//
//    @GetMapping("/")
//    public String helloWorld() {
//        return "Hello, World!";
//    }
//}
//
