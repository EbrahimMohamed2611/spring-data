package org.gov.iti.jets.springdata.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "Book")
@Table(name = "book")
public class Book {

    @Id
    @SequenceGenerator(
            name = "book_sequence",
            sequenceName = "book_sequence_db",
            initialValue = 1,
            allocationSize = 50
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "book_sequence"
    )
    private Long id;


    @Column(name = "book_name", nullable = false)
    private String bookName;

    @Column(name = "created_at", nullable = false, columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "student_id",nullable = false, referencedColumnName = "id", foreignKey = @ForeignKey(name = "student_book_fk"))
    private Student student;
}
