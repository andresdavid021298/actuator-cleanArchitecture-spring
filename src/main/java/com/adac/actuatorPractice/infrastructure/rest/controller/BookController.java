package com.adac.actuatorPractice.infrastructure.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adac.actuatorPractice.domain.model.Book;
import com.adac.actuatorPractice.domain.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Book>> getAllBooks() {
		return ResponseEntity.ok(bookService.getAllBooks());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable Integer id) {
		Book book = bookService.getBookById(id);
		return ResponseEntity.ok(book);
	}
	
	@GetMapping("/byAuthor/{idAuthor}")
	public ResponseEntity<List<Book>> getBooksByAuthor(@PathVariable Integer idAuthor) {
		List<Book> books = bookService.getBooksByAuthor(idAuthor);
		return ResponseEntity.ok(books);
	}
	
}
