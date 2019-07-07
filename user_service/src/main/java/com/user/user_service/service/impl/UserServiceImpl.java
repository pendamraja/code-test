package com.user.user_service.service.impl;


import com.user.user_service.model.User;
import com.user.user_service.repository.UserRepository;
import com.user.user_service.service.UserService;
import com.user.user_service.util.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUserByUsername(String username) {
        return userRepository.findByuserName(username);
    }

    public void createUser(User user) {
        String orginalPass = user.getPassword();
        String generatedSecuredPasswordHash = BCrypt.hashpw(orginalPass, BCrypt.gensalt());
        user.setPassword(generatedSecuredPasswordHash);
        userRepository.save(user);
    }

    public void removeUser(String username) {
        userRepository.deleteByuserName(username);

    }

}
