package com.adac.actuatorPractice.infrastructure.converter;

import java.util.List;

import org.mapstruct.Mapper;

import com.adac.actuatorPractice.domain.model.Book;
import com.adac.actuatorPractice.infrastructure.entity.BookEntity;

@Mapper(componentModel = "spring")
public interface BookMapper {
	
	Book convertBookEntityToBook(BookEntity bookEntity);
	
	List<Book> convertBooksEntitiesToBooks(List<BookEntity> bookEntity);
	
}
