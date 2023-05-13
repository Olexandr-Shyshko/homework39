package com.ua.homework39.service;

import com.ua.homework39.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    public List<Student> findAllStudents() {
        return List.of(new Student(1, "Ivan", 4, "UDF-05"),
                new Student(2, "Mariya", 1, "FM-03"));
    }

    public Optional<Student> findStudentById(int id) {
        return Optional.of(new Student(4, "Lesya", 2, "IT-4"));
    }

    public void printStudent (Student st){
        System.out.println(st);
    }
}
