package com.dtdb.KnowNow;

import com.dtdb.KnowNow.interfaces.UserRepository;
import com.dtdb.KnowNow.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication

public class KnowNowApplication {
	private static final Logger log = LoggerFactory.getLogger(KnowNowApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(KnowNowApplication.class, args);
	}

	@Bean
	public CommandLineRunner knowNowDataBase(UserRepository repository) {
		return (args) -> {
			// save a couple of customers

			repository.save(User.builder().name("Dawid").surname("Tracz").build());
			repository.save(User.builder().name("Dima").countrySymbol("UKR").build());

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (User customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");

			// fetch an individual customer by ID
//			User user = repository.findOne(1L);
//			log.info("Customer found with findOne(1L):");
//			log.info("--------------------------------");
//			log.info(user.toString());
//			log.info("");

			// fetch customers by last name
//			log.info("Customer found with findByLastName('Bauer'):");
//			log.info("--------------------------------------------");
//			for (User bauer : repository.findByLastName("Bauer")) {
//				log.info(bauer.toString());
//			}
			log.info("");
		};
	}
}