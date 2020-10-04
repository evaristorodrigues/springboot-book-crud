package com.library.repository;

import org.springframework.data.repository.CrudRepository;

import com.library.resources.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

}
