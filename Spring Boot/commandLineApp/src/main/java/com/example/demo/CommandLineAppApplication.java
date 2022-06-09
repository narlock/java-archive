package com.example.demo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

@SpringBootApplication
public class CommandLineAppApplication {

	private static final Logger LOG = LoggerFactory.getLogger(CommandLineAppApplication.class);
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Bean 
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			LOG.info("Starting CLR Application");
			ResponseEntity<List<Staff>> staff = restTemplate.exchange("http://localhost:8080/api/staff",
					HttpMethod.GET, null, new ParameterizedTypeReference<List<Staff>>() {
					
					});
			staff.getBody().forEach(member-> {
				LOG.info(member.toString());
			});
			LOG.info("Finishing CLR Application");
		};
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CommandLineAppApplication.class, args);
	}

}
