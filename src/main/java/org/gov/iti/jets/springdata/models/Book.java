package org.gov.iti.jets.springdata.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "books")
@ToString
public class Book {

    @Id
    private String id;

    private String bookName;

    private String author;

}
