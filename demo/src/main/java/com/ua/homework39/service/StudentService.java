package com.ua.homework39.service;

import com.ua.homework39.dao.StudentRepositoryMySQL;
import com.ua.homework39.domain.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {

   private StudentRepositoryMySQL studentRepositoryMySQL = new StudentRepositoryMySQL();

    public List<Student> findAllStudents() {
        return studentRepositoryMySQL.findAllStudents();
    }

    public Optional<Student> findStudentById(int id) {
        return Optional.of(studentRepositoryMySQL.findStudentById(id));
    }

    public void saveStudent(Student st) {
        studentRepositoryMySQL.saveStudent(st);
    }
    public void updateStudent(Student st) {
        studentRepositoryMySQL.updateStudent(st);
    }

    public void deleteStudent(int id) {
        studentRepositoryMySQL.deleteStudentById(id);
    }
}
