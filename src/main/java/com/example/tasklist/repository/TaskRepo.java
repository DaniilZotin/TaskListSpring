package com.example.tasklist.repository;

import com.example.tasklist.domain.task.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepo {
    Optional<Task> findById(Long id);

    List<Task> findAllByUserId(Long userId);


    //Цей метод буде пов'язувати задачу з користувачем. У нас буде такий механізм
    // ми створюємо таску і вона нічийна але потім через сервіс ми повинні присвоїти цю таску певному користувачу
    void assignToUserById(Long taskId, Long userId);

    void update(Task task);
    void create(Task task);
    void delete(Long taskId);
}
