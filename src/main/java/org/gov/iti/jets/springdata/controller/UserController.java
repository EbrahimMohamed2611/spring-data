package org.gov.iti.jets.springdata.controller;

//import org.gov.iti.jets.springdata.models.Student;
//import org.gov.iti.jets.springdata.repositories.StudentRepository;
//import org.gov.iti.jets.springdata.service.StudentService;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class UserController {
//
//    private final StudentRepository studentRepository;
//    private final StudentService studentService;
//
//    public UserController(StudentRepository studentRepository, StudentService studentService) {
//        this.studentRepository = studentRepository;
//        this.studentService = studentService;
//    }
//
//    @PostMapping
//    public ResponseEntity<Student> addNewStudent(@RequestBody Student student) {
//        return ResponseEntity.status(HttpStatus.CREATED).body(studentRepository.save(student));
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Student>> getAllStudent() {
//        return ResponseEntity.status(HttpStatus.OK).body(studentService.getAllStudent());
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<HttpStatus> deleteStudent(@PathVariable Long id) {
////        studentService.deleteStudentById(id);
//        return ResponseEntity.ok().build();
//    }
}
