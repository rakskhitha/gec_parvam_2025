
package com.geccrud.SpringBootEmployee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.geccrud.SpringBootEmployee.dto.EmployeeDTO;
import com.geccrud.SpringBootEmployee.models.Employee;
import com.geccrud.SpringBootEmployee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	private final EmployeeRepository employeeRepository;
	//create constructor

	public EmployeeService(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}
	
	
	 
   // to get list of employee
	public List<Employee> getAllEmployees(){
		List<Employee> employees= employeeRepository.findAll();
	    return employees;
	
    }
	
	
	public void saveEmployee(EmployeeDTO employeeDTO) {
		Employee employee= new Employee();
		employee.setFname(employeeDTO.getfName());
		employee.setLname(employeeDTO.getlName());
		employee.setEmail(employeeDTO.getEmail());
		employee.setPhone(employeeDTO.getPhone());
		employee.setAddress(employeeDTO.getAddress());
		employeeRepository.save(employee);
	}
	
	public Employee getEmployee(Long id) {
		Employee employee = employeeRepository.findById(id).get();
		return employee;
	}
	
	public void updateEmployee(EmployeeDTO employeeDTO, Long id) {
		Employee employee = employeeRepository.findById(id).get();
		employee.setFname(employeeDTO.getfName());
		employee.setLname(employeeDTO.getlName());
		employee.setEmail(employeeDTO.getEmail());
		employee.setPhone(employeeDTO.getPhone());
		employee.setAddress(employeeDTO.getAddress());
		employeeRepository.save(employee);
	}
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}
}
