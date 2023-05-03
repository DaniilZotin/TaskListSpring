package com.example.tasklist.repository;

import com.example.tasklist.domain.user.Role;
import com.example.tasklist.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo {

    Optional<User> findById(Long id);

    Optional<User> findByUserName(String username);

    void update(User user);

    void create(User user);

    void insertUserRole(Long userId, Role role);

    //Являється лі користувач з id таски під таким то id

    boolean isTaskOwner(Long userId, Long taskId);

    void delete(Long id);
}
