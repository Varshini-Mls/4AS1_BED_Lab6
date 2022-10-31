package com.StudentManagement.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentManagement.entity.*;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}