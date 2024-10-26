package org.gov.iti.jets.springdata.service;


import org.gov.iti.jets.springdata.models.Book;
import org.gov.iti.jets.springdata.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book saveBook(Book book){
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

}
