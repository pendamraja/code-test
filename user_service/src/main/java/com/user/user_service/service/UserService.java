package com.user.user_service.service;

import com.user.user_service.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    void createUser(User user);
}
