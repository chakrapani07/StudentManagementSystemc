package com.chakrapani.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chakrapani.StudentManagementSystem.entity.Student;


public interface StudentRepository extends JpaRepository <Student, Long> {

}
