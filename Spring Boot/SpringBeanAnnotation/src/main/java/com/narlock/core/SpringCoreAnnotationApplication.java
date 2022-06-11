package com.narlock.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringCoreAnnotationApplication {

	public static void main(String[] args) {
		/*
		 * Traditionally, if we wanted to call the config method
		 * for the samsung class, we would do something like:
		 * 
		 * Samsung s7 = new Samsung();
		 * s7.config();
		 */
		
		/*
		 * The problem is, we don't want to write "new Samsung()"
		 * because it is not dependence injection.
		 * Using Spring, we can inject the object.
		 */
		
		/*
		 * We want our factory to used annotation based configuration, to do this,
		 * we have to create a class that is responsible for it.
		 * We specify this config class in the parameter
		 */
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Samsung s7 = factory.getBean(Samsung.class); //Asks the factory to give us the object
		s7.config();
	}

}
