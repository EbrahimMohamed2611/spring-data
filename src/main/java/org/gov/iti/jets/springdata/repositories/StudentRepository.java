package org.gov.iti.jets.springdata.repositories;

import org.gov.iti.jets.springdata.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
