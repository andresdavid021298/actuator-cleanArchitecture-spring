package com.adac.actuatorPractice.infrastructure.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.adac.actuatorPractice.domain.dao.BookDao;
import com.adac.actuatorPractice.domain.model.Book;
import com.adac.actuatorPractice.infrastructure.converter.BookMapper;
import com.adac.actuatorPractice.infrastructure.entity.BookEntity;
import com.adac.actuatorPractice.infrastructure.repository.jpa.BookJpaRepository;

@Repository
public class BookDaoImpl implements BookDao {

	private static final Logger LOGGER = LoggerFactory.getLogger(BookDaoImpl.class);

	private BookJpaRepository jpaRepository;
	private BookMapper bookMapper;

	@Override
	public List<Book> findAllBooks() {
		LOGGER.info("** SEARCH ALL BOOKS **");
		List<BookEntity> booksEntites = (List<BookEntity>) jpaRepository.findAll();
		List<Book> allBooks = bookMapper.convertBooksEntitiesToBooks(booksEntites);
		return allBooks;
	}

	@Override
	public Book findBookById(Integer id) {
		LOGGER.info("** SEARCH BOOK WITH ID {} **", id);
		BookEntity bookEntity = jpaRepository.findById(id).orElse(null);
		Book book = bookMapper.convertBookEntityToBook(bookEntity);
		return book;
	}

	@Override
	public List<Book> findBooksByAuthor(Integer idAuthor) {
		LOGGER.info("** SEARCH ALL BOOKS **");
		List<BookEntity> booksEntities = jpaRepository.findByAuthorId(idAuthor);
		List<Book> booksModels = bookMapper.convertBooksEntitiesToBooks(booksEntities);
		return booksModels;
	}

	@Autowired
	public void setJpaRepository(BookJpaRepository jpaRepository) {
		this.jpaRepository = jpaRepository;
	}

	@Autowired
	public void setBookMapper(BookMapper bookMapper) {
		this.bookMapper = bookMapper;
	}

}
