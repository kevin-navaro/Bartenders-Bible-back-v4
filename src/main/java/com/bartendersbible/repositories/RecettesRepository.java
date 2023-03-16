package com.bartendersbible.repositories;

import com.bartendersbible.entities.Recettes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RecettesRepository extends JpaRepository<Recettes, String> {

    @Query("SELECT i FROM Recettes i ORDER by i.name")
    List<Recettes> getASomeRecettes();
}
