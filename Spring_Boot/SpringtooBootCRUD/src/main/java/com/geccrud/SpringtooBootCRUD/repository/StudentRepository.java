package com.geccrud.SpringtooBootCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geccrud.SpringtooBootCRUD.models.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{


}
