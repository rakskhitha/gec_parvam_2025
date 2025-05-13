package com.FormValidation.FormValidation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FormValidation.FormValidation.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
/*
 * spring data jpa->jpa->hybernate->jdbc->database
 * jpa connects with database using java objects
 * 
 * 
 * 1.to get all details= findAll();
 * 2.to get single data=findById(id);
 * 3.to delet single data=deleteById(id);
 * 4.to creat or update data= save(object)
 * 
 * 
 * */
	public Student findByEmail(String email);
}
