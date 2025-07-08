package com.adac.actuatorPractice.usercases.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.adac.actuatorPractice.domain.dao.AuthorDao;
import com.adac.actuatorPractice.domain.dto.NewAuthorDto;
import com.adac.actuatorPractice.domain.model.Author;
import com.adac.actuatorPractice.domain.service.AuthorService;

public class AuthorServiceImpl implements AuthorService {

	private AuthorDao authorDao;
	
	public AuthorServiceImpl(AuthorDao authorDao) {
		this.authorDao = authorDao;
	}
	
	@Override
	public Integer saveAuthor(NewAuthorDto newAuthorDto) {
		Author authorModel = new Author(null, newAuthorDto.getName(), newAuthorDto.getCountry(), newAuthorDto.getBirthdate()); 
		Integer idNewAuthor = authorDao.saveNewAuthor(authorModel);
		return idNewAuthor;
	}

	@Override
	public Author getAuthorById(Integer idAuthor) {
		Author author = authorDao.getAuthorById(idAuthor);
		return author;
	}
	
	@Autowired
	public void setAuthorDao(AuthorDao authorDao) {
		this.authorDao = authorDao;
	}

}
