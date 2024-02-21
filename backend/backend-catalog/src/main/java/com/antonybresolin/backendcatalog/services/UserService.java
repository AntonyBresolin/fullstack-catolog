package com.antonybresolin.backendcatalog.services;

import com.antonybresolin.backendcatalog.model.User;
import com.antonybresolin.backendcatalog.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean usernameExists(String username) {
        return userRepository.existsByUsername(username);
    }

    public boolean emailExists(String email) {
        return userRepository.existsByEmail(email);
    }

    public void createUser(User user) {
        userRepository.save(user);
    }

    public User getUserByUsername(String username) {
        try{
            return userRepository.findByUsername(username);
        } catch (Exception e) {
            return null;
        }
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    public void updateUser(User user) {
        userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
