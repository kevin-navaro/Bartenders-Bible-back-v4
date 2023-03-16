package com.bartendersbible.config;

import com.bartendersbible.entities.User;
import com.bartendersbible.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

public class UserConfig
{
    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository)
    {
        System.out.println("toto");
        return args -> {
            User i = new User();
            i.setId(1L);
            i.setBirthDate("10/10/1990");
            i.setEmail("amaury.bet@hotmail.com");
            i.setName("Amaury BET");
            i.setPassword("momomotdepasse");
            i.setPhoneNumber("0666666666");
            i.setUserName("momo");
            userRepository.save(i);
            System.out.println("test1");
            i = new User();
            i.setId(2L);
            i.setBirthDate("15/8/1985");
            i.setEmail("kevin.navaro@test.fr");
            i.setName("Kévin Navaro");
            i.setPassword("kekemotdepasse");
            i.setPhoneNumber("0777777777");
            i.setUserName("keke");
            userRepository.save(i);
        };
    }
}
