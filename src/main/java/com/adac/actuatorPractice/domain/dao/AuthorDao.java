package com.adac.actuatorPractice.domain.dao;

import com.adac.actuatorPractice.domain.model.Author;

public interface AuthorDao {

	Integer saveNewAuthor(Author author);
	
	Author getAuthorById(Integer idAuthor);
	
}
