package com.adac.actuatorPractice.domain.dao;

import java.util.List;

import com.adac.actuatorPractice.domain.model.Book;

public interface BookDao {

	List<Book> findAllBooks();
	
	Book findBookById(Integer id);
	
	List<Book> findBooksByAuthor(Integer idAuthor); 
	
}
