package com.example.library.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.library.model.Book;

public interface LibRepo extends CrudRepository<Book, Long> {

}
