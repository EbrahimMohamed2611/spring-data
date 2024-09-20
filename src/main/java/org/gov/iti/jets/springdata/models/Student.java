package org.gov.iti.jets.springdata.models;

import lombok.*;

// import javax.persistence.*;

// @Setter
// @Getter
// @NoArgsConstructor
// @AllArgsConstructor
// @Builder
// @Entity(name = "student")
// @Table(name = "student",
// uniqueConstraints = @UniqueConstraint(name = "uk_student_email", columnNames
// = "email")
// )
// public class Student {

// @Id
// @SequenceGenerator(
// name = "student_sequence",
// sequenceName = "student_sequence_db",
// initialValue = 1,
// allocationSize = 50
// )
// @GeneratedValue(
// strategy = GenerationType.SEQUENCE,
// generator = "student_sequence"
// )
// private Long id;

// @Column(
// name = "first_name",
// columnDefinition = "TEXT",
// nullable = false
// )
// private String firstName;

// @Column(
// name = "last_name",
// columnDefinition = "TEXT",
// nullable = false
// )
// private String lastName;

// @Column(
// name = "email",
// columnDefinition = "TEXT",
// nullable = false
// )
// // @Column(
// // name = "email",
// // unique = true,
// // columnDefinition = "TEXT UNIQUE CONSTRAINT uk_employee_email",
// // nullable = false
// // )
// private String email;

// @Column(
// name = "age",
// nullable = false
// )
// private Integer age;

// @OneToOne(mappedBy = "student")
// private StudentIdCard studentIdCard;

// }