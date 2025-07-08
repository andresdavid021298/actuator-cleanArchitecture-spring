package com.adac.actuatorPractice.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

    @Bean
    OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Practice Actuator - Library")
                        .version("1.0")
                        .description("This is a simple Spring Boot RESTful API for managing a library system. It allows users to perform basic CRUD operations on books, using PostgreSQL as the database."));
    }
	
}
