package com.bartendersbible.controllers;

import com.bartendersbible.entities.Ingredients;
import com.bartendersbible.entities.User;
import com.bartendersbible.repositories.UserRepository;
import com.bartendersbible.services.IngredientService;
import com.bartendersbible.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController
{

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsersList() {
        return userService.getSomeUsers();
    }
}
