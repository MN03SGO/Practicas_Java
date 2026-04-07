package com.arquitectura.ui;

import com.arquitectura.model.User;
import com.arquitectura.service.UserService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UserController {
    private final UserService userService;
    // Pool de hilos para tareas en segundo plano
    private final ExecutorService executor = Executors.newFixedThreadPool(2);

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void onSaveButtonClicked(int id, String name) {
        System.out.println("[UI] Botón pulsado. Iniciando tarea en segundo plano...");

        // Ejecutamos la tarea en un hilo separado para no bloquear la UI
        executor.submit(() -> {
            try {
                // Simulamos una operación costosa
                Thread.sleep(2000);
                User user = new User(id, name);
                userService.updateUser(user);

                // En JavaFX usaríamos Platform.runLater()
                // En Swing usaríamos SwingUtilities.invokeLater()
                System.out.println("[UI] Tarea completada. UI actualizada.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
    }

    public void shutdown() {
        executor.shutdown();
    }
}
