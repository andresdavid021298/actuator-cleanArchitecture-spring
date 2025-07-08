package com.adac.actuatorPractice.usercases.service;

import java.util.List;

import com.adac.actuatorPractice.domain.dao.BookDao;
import com.adac.actuatorPractice.domain.model.Book;
import com.adac.actuatorPractice.domain.service.BookService;

public class BookServiceImpl implements BookService {

	private BookDao bookDao;
	
	public BookServiceImpl(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	
	@Override
	public List<Book> getAllBooks() {
		return bookDao.findAllBooks();
	}

	@Override
	public Book getBookById(Integer idBook) {
		Book book = bookDao.findBookById(idBook);
		return book;
	}

	@Override
	public List<Book> getBooksByAuthor(Integer idAuthor) {
		List<Book> books = bookDao.findBooksByAuthor(idAuthor);
		return books;
	}
	
	
}
