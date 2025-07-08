package com.adac.actuatorPractice.infrastructure.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = { "com.adac.actuatorPractice" }, exclude = { DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
@EnableJpaRepositories("com.adac.actuatorPractice.infrastructure")
public class ActuatorPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActuatorPracticeApplication.class, args);
	}

}
