package com.qasim.springapp_003.repositories;

import com.qasim.springapp_003.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
