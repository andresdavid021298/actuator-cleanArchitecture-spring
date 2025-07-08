package com.adac.actuatorPractice.infrastructure.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adac.actuatorPractice.domain.dto.NewAuthorDto;
import com.adac.actuatorPractice.domain.model.Author;
import com.adac.actuatorPractice.domain.service.AuthorService;
import com.adac.actuatorPractice.infrastructure.converter.AuthorMapper;
import com.adac.actuatorPractice.infrastructure.rest.request.NewAuthorRequest;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/author")
public class AuthorController {

	@Autowired
	private AuthorService authorService;

	@Autowired
	private AuthorMapper authorMapper;

	@ApiResponses(
			value = { 
			@ApiResponse(responseCode = "404", description = "Author not found"),
			@ApiResponse(responseCode = "302", description = "Author founded")
	})
	@GetMapping("/{id}")
	public ResponseEntity<Author> getAuthorById(@PathVariable Integer id) {
		Author author = authorService.getAuthorById(id);
		HttpStatus httpStatus = author != null ? HttpStatus.FOUND : HttpStatus.NOT_FOUND;
		return ResponseEntity.status(httpStatus).body(author);
	}

	@ApiResponse(responseCode = "201", description = "Author created sucessfully")
	@PostMapping("/new")
	public ResponseEntity<Integer> saveAuthor(@RequestBody NewAuthorRequest request) {
		NewAuthorDto newAuthorDto = authorMapper.convertNewAuthorRequestToNewAuthorDto(request);
		Integer idAuthor = authorService.saveAuthor(newAuthorDto);
		HttpStatus httpStatus = idAuthor != null ? HttpStatus.CREATED : HttpStatus.INTERNAL_SERVER_ERROR;
		return ResponseEntity.status(httpStatus).body(idAuthor);
	}

}
