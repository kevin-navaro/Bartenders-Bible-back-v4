package com.bartendersbible.repositories;

import com.bartendersbible.entities.Ingredients;
import com.bartendersbible.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository <User, String> {

    @Query("SELECT i FROM User i ORDER BY i.name")
    List<User> getASomeUsers();
}
