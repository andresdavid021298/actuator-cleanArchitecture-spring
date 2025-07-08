package com.adac.actuatorPractice.infrastructure.repository.jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.adac.actuatorPractice.infrastructure.entity.BookEntity;

public interface BookJpaRepository extends CrudRepository<BookEntity, Integer> {

	List<BookEntity> findByAuthorId(Integer authorId);
	
}
