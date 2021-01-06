package it.framework.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;


@SpringBootApplication
@PropertySource(value = "classpath:rest.properties")
public class AppRest {
	
	public static void main(String[] args) {
		SpringApplication.run(AppRest.class, args);
	}

}
