package com.library.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.repository.BookRepository;
import com.library.resources.Book;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepository;
	
	public void insertBook(Book book) {
		System.out.println("insertBook");
		bookRepository.save(book);		
	}

	public void updateBook(Book book) {
		System.out.println("updateBook");
		bookRepository.save(book);		
	}

	public void deleteBookById(Integer id) {
		System.out.println("Delete");
		bookRepository.deleteById(id);
		
	}

	public Book findBook(Integer id) {
		System.out.println("FindBook");
		return bookRepository.findById(id).get();
	}

}
