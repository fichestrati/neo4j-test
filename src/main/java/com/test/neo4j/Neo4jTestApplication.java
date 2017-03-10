package com.test.neo4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Neo4jTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(Neo4jTestApplication.class, args);
	}
	
	@Bean
	CommandLineRunner demo(TestService service) {
		return args -> {
			service.test();
		};
	}
}