package com.globomatics.bike;

import com.globomatics.bike.models.Bike;
import com.globomatics.bike.repositorty.BikeRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class BikeApplication {



	private static final Logger log = LoggerFactory.getLogger(BikeApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BikeApplication.class, args);

	}

	@Bean
	public CommandLineRunner demo (BikeRepo repository){
		return (args) -> {
			repository.save(new Bike("bbb","ghgfh" ,"05636", "hjfhj","fdgd",33,new Date(), true));
			repository.save(new Bike("aaaa","ghdfgdgfh" ,"05635556", "hjfhj","f2321dgd",33,new Date(), true));
			repository.save(new Bike("bbsgsgfb","ghgfh" ,"05636", "hjfhj","fdgd",33,new Date(), true));


			for (Bike bike : repository.findAll()) {
				log.info("The application is: " + bike.toString());
			}
		};


	}



}
