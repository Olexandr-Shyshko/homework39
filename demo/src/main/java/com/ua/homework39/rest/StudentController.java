package com.ua.homework39.rest;

import com.ua.homework39.domain.Student;
import com.ua.homework39.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/allStudents")
    public List<Student> findAllStudents(){
        return studentService.findAllStudents();
    }

    @GetMapping("/student/{id}")
    public Optional<Student> findStudentById(@PathVariable int id ){
        return studentService.findStudentById(id);
    }


    @PostMapping("/saveStudent")
    public void saveStudent (@RequestBody Student st){
        studentService.saveStudent(st);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudent (@PathVariable int id){
        studentService.deleteStudent(id);
    }

    @PutMapping("/updateStudent")
    public void updateStudent (@RequestBody Student st){
        studentService.updateStudent(st);
    }
}
