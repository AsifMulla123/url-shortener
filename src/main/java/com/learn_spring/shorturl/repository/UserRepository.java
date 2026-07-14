package com.learn_spring.shorturl.repository;

import com.learn_spring.shorturl.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    List<String> findAllUsers(String username);
    User findByEmail(String email);
}
