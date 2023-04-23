package com.fyp.foodMark.service;

import com.fyp.foodMark.entity.User;
import com.fyp.foodMark.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> updateUser(Long id, User newUser) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            user.setUsername(newUser.getUsername());
            user.setPassword(newUser.getPassword());
            user.setPhoneNumber(newUser.getPhoneNumber());
            user.setEmail(newUser.getEmail());
            userRepository.save(user);
            return Optional.of(user);
        } else {
            return Optional.empty();
        }
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public User getIdByUser(User user) {
        String username = user.getUsername();
        String password = user.getPassword();

        User userInfo = new User();
        Long userId = userRepository.findIdByUser(username, password);
        userInfo.setId(userId);
        return userInfo;
    }
}