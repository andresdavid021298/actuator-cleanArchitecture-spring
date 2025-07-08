package com.adac.actuatorPractice.domain.service;

import com.adac.actuatorPractice.domain.dto.NewAuthorDto;
import com.adac.actuatorPractice.domain.model.Author;

public interface AuthorService {

	Integer saveAuthor(NewAuthorDto newAuthorRequest);
	
	Author getAuthorById(Integer idAuthor);
	
}
