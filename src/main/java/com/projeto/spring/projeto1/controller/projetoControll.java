package com.example.springdoc.core.springdoc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.configuration;

@configuration
public class projeto SpringDocConfig {

	@Bean
	puplic OpenAPI openAPI() {
		return new OpenAPI()
			.info(new Info()
					.tetle("Criando API")
					.version("v1")
					.description("REST API Test")
		);
	
	}
    
}

