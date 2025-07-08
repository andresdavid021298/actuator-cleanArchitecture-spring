package com.adac.actuatorPractice.infrastructure.converter;

import org.mapstruct.Mapper;

import com.adac.actuatorPractice.domain.dto.NewAuthorDto;
import com.adac.actuatorPractice.domain.model.Author;
import com.adac.actuatorPractice.infrastructure.entity.AuthorEntity;
import com.adac.actuatorPractice.infrastructure.rest.request.NewAuthorRequest;

@Mapper(componentModel = "spring")
public interface AuthorMapper {

	Author convertAuthorEntityToAuthor(AuthorEntity authorEntity);
	
	AuthorEntity convertAuthorToAuthorEntity(Author author);
	
	NewAuthorDto convertNewAuthorRequestToNewAuthorDto(NewAuthorRequest request);
	
}
