package com.arquitectura.service;

import com.arquitectura.model.User;
import com.arquitectura.repository.UserRepository;
import java.util.concurrent.locks.ReentrantLock;

public class UserService {
    private final UserRepository repository;
    // Lock for critical sections if needed outside DB transactions
    private final ReentrantLock lock = new ReentrantLock();

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void updateUser(User user) {
        // En un escenario real, aquí se manejaría la transacción (JDBC commit/rollback)
        lock.lock();
        try {
            System.out.println("[Service] Actualizando usuario: " + user.getName());
            repository.save(user);
        } finally {
            lock.unlock();
        }
    }
}
