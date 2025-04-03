package com.FormValidation.FormValidation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FormValidation.FormValidation.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
