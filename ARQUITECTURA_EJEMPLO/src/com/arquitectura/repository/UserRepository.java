package com.arquitectura.repository;

import com.arquitectura.model.User;
import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(int id);
    void save(User user);
}
