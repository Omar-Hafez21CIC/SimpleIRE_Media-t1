package com.cic.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = {"com.cic.main"})
public class SimpleReMediaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleReMediaServerApplication.class, args);
	}

}
