package com.user.user_service.service.impl;


import com.user.user_service.model.UserInformation;
import com.user.user_service.repository.UserInformationRepository;
import com.user.user_service.service.UserInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInformationServiceImpl implements UserInformationService
{
    @Autowired
    UserInformationRepository userInformationRepository;

    public UserInformation getUserInformation(String userName)
    {
        return userInformationRepository.findByuserName(userName);
    }

    public void addUserInformation(UserInformation userInformation)
    {
       userInformationRepository.save(userInformation);

    }
}
