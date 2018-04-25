package com.boot.controller;

import com.boot.model.User;
import com.boot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public HttpStatus addNewUser(@RequestBody User user) {
        User n = new User();
        n.setName(user.getName());
        n.setEmail(user.getEmail());
        userRepository.save(n);

        return HttpStatus.OK;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Iterable<User> getAllUsers() {
        System.out.println(userRepository.findAll());
        System.out.println(userRepository.findAll().getClass());
        return userRepository.findAll();
    }

    @RequestMapping(value = "/delete/all", method = RequestMethod.DELETE)
    public HttpStatus deleteAllUseres() {
        userRepository.deleteAll();
        return HttpStatus.OK;
    }


}
