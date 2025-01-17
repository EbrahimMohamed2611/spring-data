package org.gov.iti.jets.springdata.repositories;


import org.gov.iti.jets.springdata.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, String> {
    List<Book> findByAuthor(String author);

}
