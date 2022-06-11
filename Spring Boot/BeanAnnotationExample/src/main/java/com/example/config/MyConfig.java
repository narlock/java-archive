package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.service.UserService;

@Configuration
public class MyConfig {
	
	@Bean(name={"myBean", "mySecondBean"})
    public UserService getUser() {
        return new UserService();
    }
}
