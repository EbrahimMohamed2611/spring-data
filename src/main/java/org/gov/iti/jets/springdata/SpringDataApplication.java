package org.gov.iti.jets.springdata;

import com.github.javafaker.Faker;
import org.gov.iti.jets.springdata.models.Student;
import org.gov.iti.jets.springdata.models.StudentIdCard;
import org.gov.iti.jets.springdata.repositories.StudentIdCardRepository;
import org.gov.iti.jets.springdata.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner{

    @Autowired
    private StudentIdCardRepository studentIdCardRepository;
    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Faker faker = new Faker();
        List<StudentIdCard> studentIdCards = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String firstName = faker.name().firstName();
            String lastName = faker.name().lastName();

            studentIdCards.add(StudentIdCard.builder().student(Student.builder().firstName(firstName).lastName(lastName).email(String.format("%s.%s@elrouby.edu", firstName, lastName))
                            .age(faker.number().numberBetween(18, 56))
                            .build())
                    .cardNumber(UUID.randomUUID().toString()).build());
        }
        studentIdCardRepository.saveAll(studentIdCards);
        studentRepository.save(Student.builder().firstName("Ebrahim").lastName("Mohamed").email(String.format("%s.%s@elrouby.edu", "Ebrahim", "Mohamed"))
                .age(faker.number().numberBetween(18, 56))
                .build());
    }
}
