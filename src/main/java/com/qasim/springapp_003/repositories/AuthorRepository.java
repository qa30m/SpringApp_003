package com.qasim.springapp_003.repositories;

import com.qasim.springapp_003.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
