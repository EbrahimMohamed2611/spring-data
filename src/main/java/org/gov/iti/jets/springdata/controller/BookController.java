package org.gov.iti.jets.springdata.controller;

//import org.gov.iti.jets.springdata.models.Student;
//import org.gov.iti.jets.springdata.repositories.StudentRepository;
//import org.gov.iti.jets.springdata.service.StudentService;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;

import org.gov.iti.jets.springdata.models.Book;
import org.gov.iti.jets.springdata.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<Book> addNewStudent(@RequestBody Book book) {
        return ResponseEntity.status(HttpStatus.CREATED).body(bookService.saveBook(book));
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllStudent() {
        return ResponseEntity.status(HttpStatus.OK).body(bookService.getAllBooks());
    }
}
