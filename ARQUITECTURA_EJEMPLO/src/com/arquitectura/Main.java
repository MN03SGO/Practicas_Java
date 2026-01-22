package com.arquitectura;

import com.arquitectura.model.User;
import com.arquitectura.repository.UserRepository;
import com.arquitectura.service.UserService;
import com.arquitectura.ui.UserController;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Implementación Mock del repositorio (Principio de Inversión de Dependencias)
        UserRepository mockRepo = new UserRepository() {
            @Override
            public Optional<User> findById(int id) { return Optional.empty(); }
            @Override
            public void save(User user) {
                System.out.println("[DB] Guardado en base de datos: " + user.getName());
            }
        };

        UserService userService = new UserService(mockRepo);
        UserController controller = new UserController(userService);

        // Simulamos la interacción de la UI
        controller.onSaveButtonClicked(1, "Jules");

        System.out.println("[Main] El hilo principal sigue libre y responsivo.");

        // Esperamos un poco para ver el resultado del hilo secundario
        Thread.sleep(3000);
        controller.shutdown();
    }
}
