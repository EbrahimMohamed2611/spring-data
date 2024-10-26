package org.gov.iti.jets.springdata;

import org.gov.iti.jets.springdata.models.Book;
import org.gov.iti.jets.springdata.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
//

@SpringBootApplication
public class SpringDataApplication {
//public class SpringDataApplication implements CommandLineRunner {


//    @Autowired
//    private BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        bookRepository.saveAll(List.of(
//                Book.builder().bookName("Java").author("Ebrahim").build(),
//                Book.builder().bookName("Hibernate").author("JavaBrains").build(),
//                Book.builder().bookName("Maven").author("Hamza").build(),
//                Book.builder().bookName("JPA").author("Hamada").build()
//        ));
//
//    }
}
