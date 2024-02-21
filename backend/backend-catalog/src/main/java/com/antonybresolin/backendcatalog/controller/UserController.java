package com.antonybresolin.backendcatalog.controller;


import com.antonybresolin.backendcatalog.model.User;
import com.antonybresolin.backendcatalog.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody User user) {
        if(user.getUsername() == null || user.getPassword() == null || user.getEmail() == null || user.getName() == null) {
            return ResponseEntity.badRequest().body("Invalid input");
        } else if(userService.usernameExists(user.getUsername())) {
            return ResponseEntity.badRequest().body("Username already exists");
        } else if(userService.emailExists(user.getEmail())) {
            return ResponseEntity.badRequest().body("Email already exists");
        } else {
            userService.createUser(user);
            return ResponseEntity.ok("User created");
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        if(user.getUsername() == null || user.getPassword() == null) {
            return ResponseEntity.badRequest().body("Invalid input");
        } else {
            User userFromDb = userService.getUserByUsername(user.getUsername());
            if(userFromDb == null) {
                return ResponseEntity.badRequest().body("User not found");
            } else if(!userFromDb.getPassword().equals(user.getPassword())) {
                return ResponseEntity.badRequest().body("Invalid password");
            } else {
                return ResponseEntity.ok("Login successful");
            }
        }
    }

    @PostMapping("/delete")
    public ResponseEntity<?> delete(@RequestBody User user) {
        if(user.getUsername() == null || user.getPassword() == null) {
            return ResponseEntity.badRequest().body("Invalid input");
        } else {
            User userFromDb = userService.getUserByUsername(user.getUsername());
            if(userFromDb == null) {
                return ResponseEntity.badRequest().body("User not found");
            } else if(!userFromDb.getPassword().equals(user.getPassword())) {
                return ResponseEntity.badRequest().body("Invalid password");
            } else {
                userService.deleteUser(userFromDb);
                return ResponseEntity.ok("User deleted");
            }
        }
    }

    @PostMapping("/update")
    public ResponseEntity<?> update(@RequestBody User user) {
        if(user.getUsername() == null || user.getPassword() == null || user.getEmail() == null || user.getName() == null) {
            return ResponseEntity.badRequest().body("Invalid input");
        } else {
            User userFromDb = userService.getUserByUsername(user.getUsername());
            if(userFromDb == null) {
                return ResponseEntity.badRequest().body("User not found");
            } else if(!userFromDb.getPassword().equals(user.getPassword())) {
                return ResponseEntity.badRequest().body("Invalid password");
            } else {
                userService.updateUser(user);
                return ResponseEntity.ok("User updated");
            }
        }
    }

    @PostMapping("/get")
    public ResponseEntity<?> get(@RequestBody User user) {
        if(user.getUsername() == null || user.getPassword() == null) {
            return ResponseEntity.badRequest().body("Invalid input");
        } else {
            User userFromDb = userService.getUserByUsername(user.getUsername());
            if(userFromDb == null) {
                return ResponseEntity.badRequest().body("User not found");
            } else if(!userFromDb.getPassword().equals(user.getPassword())) {
                return ResponseEntity.badRequest().body("Invalid password");
            } else {
                return ResponseEntity.ok(userFromDb);
            }
        }
    }

    @PostMapping("/getall")
    public List<User> getAll() {
        return userService.getAllUsers();
    }

}
