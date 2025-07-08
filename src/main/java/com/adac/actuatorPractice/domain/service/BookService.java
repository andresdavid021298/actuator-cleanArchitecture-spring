package com.adac.actuatorPractice.domain.service;

import java.util.List;

import com.adac.actuatorPractice.domain.model.Book;

public interface BookService {

	List<Book> getAllBooks();
	
	Book getBookById(Integer idBook);
	
	List<Book> getBooksByAuthor(Integer idAuthor);
	
}
