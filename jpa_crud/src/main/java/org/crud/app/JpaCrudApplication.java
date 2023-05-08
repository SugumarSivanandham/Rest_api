package org.crud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(
				title="SUPER MARKET",
				version="1.1.2",
				description="super market item details",
				contact=@Contact(
						name="SUGUMAR",
						email="ssugumar553@gmail.com"
						)
				)	
		)
public class JpaCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaCrudApplication.class, args);
	}
}
