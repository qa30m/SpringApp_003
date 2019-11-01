package com.qasim.springapp_003.repositories;

import com.qasim.springapp_003.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
