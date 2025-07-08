package com.adac.actuatorPractice.infrastructure.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.adac.actuatorPractice.domain.dao.AuthorDao;
import com.adac.actuatorPractice.domain.model.Author;
import com.adac.actuatorPractice.infrastructure.converter.AuthorMapper;
import com.adac.actuatorPractice.infrastructure.entity.AuthorEntity;
import com.adac.actuatorPractice.infrastructure.repository.jpa.AuthorJpaRepository;

@Repository
public class AuthorDaoImpl implements AuthorDao {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AuthorDaoImpl.class);

	private AuthorJpaRepository jpaRepository;
	private AuthorMapper authorMapper;
	
	@Override
	public Integer saveNewAuthor(Author author) {
		LOGGER.info("** SAVE NEW AUTHOR **");
		AuthorEntity entity = authorMapper.convertAuthorToAuthorEntity(author);
		entity = jpaRepository.save(entity);
		return entity.getId();
	}

	@Override
	public Author getAuthorById(Integer idAuthor) {
		LOGGER.info("** SEARCH AUTHOR WITH ID {} **", idAuthor);
		AuthorEntity entity = jpaRepository.findById(idAuthor).orElse(null);
		Author authorModel = authorMapper.convertAuthorEntityToAuthor(entity);
		return authorModel;
	}

	@Autowired
	public void setJpaRepository(AuthorJpaRepository jpaRepository) {
		this.jpaRepository = jpaRepository;
	}

	@Autowired
	public void setAuthorMapper(AuthorMapper authorMapper) {
		this.authorMapper = authorMapper;
	}

}
