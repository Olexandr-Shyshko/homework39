package com.ua.homework39.dao;

import com.ua.homework39.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface StudentRepository extends JpaRepository <Student,Integer> {
}
