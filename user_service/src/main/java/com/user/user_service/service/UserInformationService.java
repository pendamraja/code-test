package com.user.user_service.service;


import com.user.user_service.model.UserInformation;

public interface UserInformationService {
    UserInformation getUserInformation(String userName);

    void addUserInformation(UserInformation userInformation);
}
