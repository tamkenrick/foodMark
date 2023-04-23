package com.fyp.foodMark.controller;

import com.fyp.foodMark.entity.User;
import com.fyp.foodMark.service.UserService;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@RestController
@Slf4j
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = userService.getUserById(id);
        if (user!=null) {
            log.info("Get user called successfully");
            log.info("Get user by id: "+id);
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("")
    public User createUser(@RequestBody User user) {
        log.info("Create user called successfully");
        return userService.createUser(user);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User newUser) {
        Optional<User> optionalUser = userService.updateUser(id, newUser);
        if (optionalUser.isPresent()) {
            return ResponseEntity.ok(optionalUser.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable Long id, @RequestBody User user) {

        User user1 = userService.getUserById(id);
        if(user.equals(user1)){
            userService.deleteUser(id);
            return ResponseEntity.ok(user);
        }else {
            log.error("The user information is not correct.");
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/login")
    public ResponseEntity<User> getIdByUser(@RequestBody User userInfo) {
        User user = userService.getIdByUser(userInfo);
        if (user.getId()!=null) {
            log.info("Login success");
            return ResponseEntity.ok(user);
        } else {
            log.error("Login Failed");
            return ResponseEntity.notFound().build();
        }
    }
}