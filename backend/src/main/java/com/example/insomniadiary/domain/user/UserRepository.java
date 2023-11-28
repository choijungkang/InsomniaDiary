package com.example.insomniadiary.domain.user;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository {

    User save(User user);
    Optional<User> findById(Long id);
    Optional<User> findByName(String username);
    List<User> findAll();
    Optional<User> findByEmail(String email);
}