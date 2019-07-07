package com.user.user_service.repository;

import com.user.user_service.model.UserInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInformationRepository extends JpaRepository<UserInformation, String> {

    UserInformation findByuserName(String userName);
}
