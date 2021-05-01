package de.lamp.crud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyCrudApplication {

	private static final Logger log = LoggerFactory.getLogger(MyCrudApplication.class);

	public static void main(String[] args) {SpringApplication.run(MyCrudApplication.class, args);}
	@Bean
	public CommandLineRunner loadData(UserRepository userRepository) {
		return (args) -> {

			// save a couple of Users
			userRepository.save(new User("Jack", "Bauer","jack@mail.de"));
			userRepository.save(new User("Chloe", "Brian","chloe@web.de"));
			userRepository.save(new User("Kim", "Bauer","kim@hotmail.th"));
			userRepository.save(new User("David", "Palmer","David@icloud.com"));
			userRepository.save(new User("Michelle", "Kessler","micha@gmail.com"));

			// fetch all Users
			log.info("User found with findAll():");
			log.info("-------------------------------");
			for (User user : userRepository.findAll()) {
				log.info(user.toString());
			}
			log.info("");

		};
	}
}
