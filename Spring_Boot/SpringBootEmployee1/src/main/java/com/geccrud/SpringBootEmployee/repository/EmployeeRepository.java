
package com.geccrud.SpringBootEmployee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geccrud.SpringBootEmployee.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{


}

