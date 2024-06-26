package com.example.FBJV24001115synergy7firbinfudch4.service;

import com.example.FBJV24001115synergy7firbinfudch4.model.entity.Users;
import com.example.FBJV24001115synergy7firbinfudch4.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void registerUser(String username, String password, String email) {
        userRepository.registerUser(username, password, email);
    }

    @Override
    public Users findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public Users getUserById(UUID userId) {
        Optional<Users> user = userRepository.findById(userId);
        return user.orElse(null);
    }

    @Override
    public void updateUser(UUID id, String new_username, String new_email, String new_password) {
        userRepository.updateUser(id, new_username, new_email, new_password);
    }

    @Override
    public void deleteUser(UUID userId) {
        userRepository.deleteUser(userId);
    }

    @Override
    public Page<Users> findAllUsersByName(String name, Pageable pageable) {
        return userRepository.findByUsernameContaining(name, pageable);
    }
}
