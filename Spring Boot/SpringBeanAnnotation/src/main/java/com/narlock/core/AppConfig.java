package com.narlock.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * AppConfig
 * @author narlock
 * 
 * This class is responsible for the configurations.
 * We use the annotation to denote this.
 * 
 * This now makes this class responsible for giving us
 * objects.
 * 
 * In XML, we would specify something like
 * 	<beans>
 * 		<bean id="phone" name="Samsung" />
 * 	</beans>
 * 
 * So, inside of our annotation, we can make a method
 * that will return the object. (getPhone)
 */

@Configuration
public class AppConfig {

	//This specifies where the context can find the Bean
	//Without this, we could get a NoSuchBeanDefinitionException.
	@Bean
	public Samsung getPhone() {
		return new Samsung();
	}
	
	//Likewise, this is our Bean definition for MobileProcessor
	@Bean
	public MobileProcessor getProcessor() {
		return new SnapDragon(); //concrete
	}
}
