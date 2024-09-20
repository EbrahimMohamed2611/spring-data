package org.gov.iti.jets.springdata.models;

import lombok.*;

// import javax.persistence.*;

// @Setter
// @Getter
// @NoArgsConstructor
// @AllArgsConstructor
// @Builder
// @Entity(name = "StudentIdCard")
// @Table(name = "student_id_card", uniqueConstraints = @UniqueConstraint(name =
// "uk_student_id_card", columnNames = "card_number"))
// public class StudentIdCard {

// @Id
// @SequenceGenerator(name = "student_id_card_sequence", sequenceName =
// "student_id_card_sequence_db", initialValue = 1, allocationSize = 20)
// @GeneratedValue(generator = "student_id_card_sequence", strategy =
// GenerationType.SEQUENCE)
// private Long id;

// @Column(name = "card_number",length = 250, nullable = false)
// private String cardNumber;

// @OneToOne(cascade = CascadeType.ALL)
// @JoinColumn(name = "student_id", referencedColumnName = "id")
// private Student student;
// }
