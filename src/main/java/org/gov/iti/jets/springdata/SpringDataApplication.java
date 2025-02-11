package org.gov.iti.jets.springdata;

import lombok.RequiredArgsConstructor;
import org.gov.iti.jets.springdata.models.Book;
import org.gov.iti.jets.springdata.repositories.BookRepository;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringDataApplication implements CommandLineRunner {

    private final BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        bookRepository.saveAll(List.of(
                Book.builder().bookName("Java EE").author("Ebrahim").build(),
                Book.builder().bookName("Hibernate").author("JavaBrains").build(),
                Book.builder().bookName("Maven").author("Hamza").build(),
                Book.builder().bookName("JPA").author("Hamada").build()));
        bookRepository.findAll().forEach(System.out::println);
    }
}
