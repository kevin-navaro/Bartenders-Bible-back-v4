package com.bartendersbible;

import com.bartendersbible.entities.Ingredients;
import com.bartendersbible.entities.Recettes;
import com.bartendersbible.entities.User;
import com.bartendersbible.repositories.IngredientsRepository;
import com.bartendersbible.repositories.RecettesRepository;
import com.bartendersbible.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import java.util.Date;

@SpringBootApplication
@Configuration
public class BartendersBibleApplication implements CommandLineRunner
{

	@Autowired
	UserRepository userRepository;
	@Autowired
	RecettesRepository recettesRepository;
	@Autowired
	IngredientsRepository ingredientsRepository;

	public static void main(String[] args) {
		SpringApplication.run(BartendersBibleApplication.class, args);
	}
	@Override
	public void run(String... arg)
	{
			User i = new User();
			i.setId(1L);
			i.setBirthDate("10/10/1990");
			i.setEmail("amaury.bet@hotmail.com");
			i.setName("Amaury BET");
			i.setPassword("momomotdepasse");
			i.setPhoneNumber("0666666666");
			i.setUserName("momo");
			userRepository.save(i);

			i = new User();
			i.setId(2L);
			i.setBirthDate("15/8/1985");
			i.setEmail("kevin.navaro@test.fr");
			i.setName("Kévin Navaro");
			i.setPassword("kekemotdepasse");
			i.setPhoneNumber("0777777777");
			i.setUserName("keke");
			userRepository.save(i);


			Recettes i2 = new Recettes();
			i2.setId(1L);
			i2.setCreatedAt(new Date());
			i2.setDescription("Cocktail rafraîchissant à base de Rhum, idéal lors d'une soirée estivale ou d'été. " +
					"Possibilité d'utiliser du rhum ambré pour une variation d'intensité.");
			i2.setEstimatedTime(10);
			i2.setImage("https://cdn.pixabay.com/photo/2015/03/30/12/35/mojito-698499_960_720.jpg");
			i2.setName("Mojito");
			i2.setUserid(1L);
			recettesRepository.save(i2);

			i2 = new Recettes();
			i2.setId(2L);
			i2.setCreatedAt(new Date());
			i2.setDescription("Cocktail rafraîchissant à base de Rhum, idéal lors d'une soirée estivale ou d'été." +
					" Possibilité d'utiliser du rhum ambré pour une variation d'intensité.");
			i2.setEstimatedTime(5);
			i2.setImage("https://www.rhum-cocktails.com/medias/cuba-libre.jpg");
			i2.setName("Cuba Libre");
			i2.setUserid(2L);
			recettesRepository.save(i2);


		Ingredients i3 = new Ingredients();
		i3.setHasAlcohol(true);
		i3.setName("Vodka");
		i3.setImage("https://cdn.selection-prestige.de/media/catalog/product/cache/image/1536x/a4e40ebdc3e371adff845072e1c73f37/9/9/99033_absolut-vodka-1L-40-vol.jpg");
		ingredientsRepository.save(i3);

		i3 = new Ingredients();
		i3.setHasAlcohol(false);
		i3.setName("Coca Cola");
		i3.setImage("https://www.charlemagne-boissons.com/3149-large_default/coca-cola.jpg");
		ingredientsRepository.save(i3);
	}
}