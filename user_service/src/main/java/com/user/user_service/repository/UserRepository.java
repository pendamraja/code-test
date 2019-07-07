package com.user.user_service.repository;

import com.user.user_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByuserName(String userName);

    void deleteByuserName(String userName);
}
