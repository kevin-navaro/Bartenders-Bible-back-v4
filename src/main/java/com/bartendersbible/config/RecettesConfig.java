package com.bartendersbible.config;

import com.bartendersbible.entities.Ingredients;
import com.bartendersbible.entities.Recettes;
import com.bartendersbible.repositories.RecettesRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Date;

public class RecettesConfig {

    @Bean
    CommandLineRunner commandLineRunner(RecettesRepository recettesRepository) {
        return args -> {
            Recettes i = new Recettes();
            i.setId(1L);
            i.setCreatedAt(new Date());
            i.setDescription("Cocktail rafraîchissant à base de Rhum, idéal lors d'une soirée estivale ou d'été. " +
                    "Possibilité d'utiliser du rhum ambré pour une variation d'intensité.");
            i.setEstimatedTime(10);
            i.setImage("https://cdn.pixabay.com/photo/2015/03/30/12/35/mojito-698499_960_720.jpg");
            i.setName("Mojito");
            i.setUserid(1L);
            recettesRepository.save(i);

            i = new Recettes();
            i.setId(2L);
            i.setCreatedAt(new Date());
            i.setDescription("Cocktail rafraîchissant à base de Rhum, idéal lors d'une soirée estivale ou d'été." +
                    " Possibilité d'utiliser du rhum ambré pour une variation d'intensité.");
            i.setEstimatedTime(5);
            i.setImage("https://www.rhum-cocktails.com/medias/cuba-libre.jpg");
            i.setName("Cuba Libre");
            i.setUserid(2L);
            recettesRepository.save(i);

        };
    }
}
