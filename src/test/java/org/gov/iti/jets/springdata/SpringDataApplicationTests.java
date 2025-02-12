package org.gov.iti.jets.springdata;

import org.gov.iti.jets.springdata.models.Book;
import org.gov.iti.jets.springdata.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class SpringDataApplicationTests {


    @Autowired
    private BookRepository bookRepository;

    // comment 2
    @Test
    void contextLoads() {
        bookRepository.saveAll(List.of(
                Book.builder().bookName("Java EE").author("Ebrahim").build(),
                Book.builder().bookName("Hibernate").author("JavaBrains").build(),
                Book.builder().bookName("Maven").author("Hamza").build(),
                Book.builder().bookName("JPA").author("Hamada").build()));
        bookRepository.findAll().forEach(System.out::println);
    }


}
