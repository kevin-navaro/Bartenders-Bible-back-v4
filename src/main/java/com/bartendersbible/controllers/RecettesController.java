package com.bartendersbible.controllers;

import com.bartendersbible.entities.Ingredients;
import com.bartendersbible.entities.Recettes;
import com.bartendersbible.repositories.RecettesRepository;
import com.bartendersbible.services.IngredientService;
import com.bartendersbible.services.RecettesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/recettes")
public class RecettesController
{

    private final RecettesService recettesService;

    public RecettesController(RecettesService recettesService) {
        this.recettesService = recettesService;
    }

    @GetMapping
    public List<Recettes> getRecettesList() {
        return recettesService.getSomeRecettes();
    }
}
