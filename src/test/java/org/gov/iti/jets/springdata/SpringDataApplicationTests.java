package org.gov.iti.jets.springdata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.gov.iti.jets.springdata.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDataApplicationTests {

    @Autowired
    private BookRepository bookRepository;

    // comment 2
    @Test
    void contextLoads() {
        // This is new comment
        // assertEquals(10, 6);
        bookRepository.findAll().forEach(System.out::println);
    }

}
