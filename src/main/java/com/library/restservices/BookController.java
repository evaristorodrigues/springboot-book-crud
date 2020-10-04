package com.library.restservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.library.resources.Book;
import com.library.services.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@PostMapping(path = "/book")
	public void insertBook(@RequestBody Book book) {
		bookService.insertBook(book);
	}
	@PutMapping(path = "/book")
	public void updateBook(@RequestBody Book book) {
		bookService.updateBook(book);
	}
	
	@DeleteMapping(path = "/book")
	public void deleteBookById(@PathVariable Integer id) {
		bookService.deleteBookById(id);
	}
	
	@GetMapping(path = "/book")
	public Book findBook(@PathVariable Integer id) {
		return bookService.findBook(id);
	}

}
