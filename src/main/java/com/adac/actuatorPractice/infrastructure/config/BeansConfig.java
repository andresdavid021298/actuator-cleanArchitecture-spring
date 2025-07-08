package com.adac.actuatorPractice.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.adac.actuatorPractice.domain.dao.AuthorDao;
import com.adac.actuatorPractice.domain.dao.BookDao;
import com.adac.actuatorPractice.domain.service.AuthorService;
import com.adac.actuatorPractice.domain.service.BookService;
import com.adac.actuatorPractice.usercases.service.AuthorServiceImpl;
import com.adac.actuatorPractice.usercases.service.BookServiceImpl;

@Configuration
public class BeansConfig {

	@Bean
	AuthorService authorService(AuthorDao authorDao) {
		return new AuthorServiceImpl(authorDao);
	}
	
	@Bean
	BookService bookService(BookDao bookDao) {
		return new BookServiceImpl(bookDao);
	}
	
}
