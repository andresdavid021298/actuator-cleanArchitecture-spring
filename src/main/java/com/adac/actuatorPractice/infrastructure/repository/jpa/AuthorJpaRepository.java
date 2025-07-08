package com.adac.actuatorPractice.infrastructure.repository.jpa;

import org.springframework.data.repository.CrudRepository;

import com.adac.actuatorPractice.infrastructure.entity.AuthorEntity;

public interface AuthorJpaRepository extends CrudRepository<AuthorEntity, Integer> {

}
