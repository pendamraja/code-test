package com.user.user_service.controller;

import com.user.user_service.model.UserInformation;
import com.user.user_service.service.impl.UserInformationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserInformationController {
    @Autowired
    UserInformationServiceImpl userInformationServiceimpl;

    @PostMapping(value = "/user-service/addUserData", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<?> addUserData(@RequestBody UserInformation userInformation) {
        userInformationServiceimpl.addUserInformation(userInformation);
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @GetMapping(value = "/user-service/getUserData/{userName}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public UserInformation getUserData(@PathVariable String userName) {
        return userInformationServiceimpl.getUserInformation(userName);
    }
}
