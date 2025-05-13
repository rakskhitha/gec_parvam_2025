package com.geccrud.SpringBootEmployee.SpringBootEmployee.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.geccrud.SpringBootEmployee.SpringBootEmployee.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{


}

