package com.geccrud.SpringBootEmployee.controller;
import java.util.List;



	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PostMapping;

	import com.geccrud.SpringBootEmployee.dto.EmployeeDTO ;
	import com.geccrud.SpringBootEmployee.models.Employee;
	import com.geccrud.SpringBootEmployee.service.EmployeeService;
	import org.springframework.web.bind.annotation.RequestParam;




	@Controller
	public class EmpController {
//	     @GetMapping("")
//	     public String getHomepage() {
//		     return "home";
	//}
		
		
		
		private final EmployeeService employeeService;
		//create constructor
		
		
		public EmpController(EmployeeService employeeService) {
			super();
			this.employeeService = employeeService;
		}


		@GetMapping({"","/"})
		public String getAllEmployees(Model  model) {
			List<Employee> employees = employeeService.getAllEmployees();
			model.addAttribute("employees",employees);
	 		return "employees";
		}

		
		@GetMapping("/add_employee")
		public String add_employee(Model model) {
			EmployeeDTO employeeDTO = new EmployeeDTO();
			model.addAttribute("employeeDTO", employeeDTO);
			return "add_employee";
		}
		
		@PostMapping("/add_employee")
		public String saveEmployee(@ModelAttribute EmployeeDTO employeeDTO) {
			employeeService.saveEmployee(employeeDTO);
			return "redirect:/";
		}
		
		@GetMapping("/edit-employee")
		public String getEmployee(@RequestParam Long id, Model model) {
			Employee employee = employeeService.getEmployee(id);
			EmployeeDTO employeeDTO = new EmployeeDTO();
			employeeDTO.setfName(employee.getFname());
			employeeDTO.setlName(employee.getLname());
			employeeDTO.setEmail(employee.getEmail());
			employeeDTO.setPhone(employee.getPhone());
			employeeDTO.setAddress(employee.getAddress());
			model.addAttribute("employeeDTO",employeeDTO);
			model.addAttribute("employee",employee);
			
			return "edit-employee";
		}
		
		@PostMapping("/edit-employee")
		public String updateEmployee(@ModelAttribute EmployeeDTO employeeDTO, @RequestParam Long id) {
			employeeService.updateEmployee(employeeDTO,id);
			return "redirect:/";
		}	
		
		@GetMapping("/delete-employee")
		public String getMethodName(@RequestParam Long id) {
			employeeService.deleteEmployee(id);
			return "redirect:/";
		}
	}
		
		
