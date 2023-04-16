package com.fyp.foodMark;

import com.fyp.foodMark.controller.UserController;
import com.fyp.foodMark.entity.User;
import com.fyp.foodMark.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static junit.framework.TestCase.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserController userController;

    @Test
    public void testGetAllUsers() {
        List<User> users = Arrays.asList(
                new User(1L, "testuser1", "password1", "1234567890", "testuser1@example.com"),
                new User(2L, "testuser2", "password2", "0987654321", "testuser2@example.com")
        );
        Mockito.when(userRepository.findAll()).thenReturn(users);

        List<User> result = userController.getAllUsers();

        assertEquals(users.size(), result.size());
        assertEquals(users.get(0).getUsername(), result.get(0).getUsername());
        assertEquals(users.get(1).getUsername(), result.get(1).getUsername());
    }

    @Test
    public void testGetUserById() {
        Long id = 1L;
        User user = new User(id, "testuser", "password", "1234567890", "testuser@example.com");
        Mockito.when(userRepository.findById(id)).thenReturn(Optional.of(user));

        ResponseEntity<User> result = userController.getUserById(id);

        assertEquals(HttpStatus.OK, result.getStatusCode());
        assertEquals(user.getUsername(), result.getBody().getUsername());
    }

    @Test
    public void testGetUserByIdNotFound() {
        Long id = 1L;
        Mockito.when(userRepository.findById(id)).thenReturn(Optional.empty());

        ResponseEntity<User> result = userController.getUserById(id);

        assertEquals(HttpStatus.NOT_FOUND, result.getStatusCode());
    }
}