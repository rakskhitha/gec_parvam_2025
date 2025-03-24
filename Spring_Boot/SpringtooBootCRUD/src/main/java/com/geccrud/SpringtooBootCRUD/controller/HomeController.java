package com.geccrud.SpringtooBootCRUD.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.geccrud.SpringtooBootCRUD.dto.StudentDTO;
import com.geccrud.SpringtooBootCRUD.models.Student;
import com.geccrud.SpringtooBootCRUD.service.StudentService;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class HomeController {
//     @GetMapping("")
//     public String getHomepage() {
//	     return "home";
//}
	
	
	
	private final StudentService studentService;
	//create constructor
	public HomeController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	
	@GetMapping({"","/"})
	public String getAllStudents(Model  model) {
		List<Student> students = studentService.getAllstudents();
		model.addAttribute("students",students);
 		return "students";
	}

	
	@GetMapping("/add_student")
	public String add_student(Model model) {
		StudentDTO studentDTO = new StudentDTO();
		model.addAttribute("studentDTO", studentDTO);
		return "add_student";
	}
	
	@PostMapping("/add_student")
	public String saveStudent(@ModelAttribute StudentDTO studentDTO) {
		studentService.saveStudent(studentDTO);
		return "redirect:/";
	}
	
	@GetMapping("/edit-student")
	public String getStudent(@RequestParam Long id, Model model) {
		Student student = studentService.getStudent(id);
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setfName(student.getFname());
		studentDTO.setlName(student.getLname());
		studentDTO.setEmail(student.getEmail());
		studentDTO.setPhone(student.getPhone());
		studentDTO.setAddress(student.getAddress());
		model.addAttribute("studentDTO",studentDTO);
		model.addAttribute("student",student);
		System.out.println(studentDTO.getfName());
		
		return "edit-student";
	}
	
	@PostMapping("/edit-student")
	public String updateStudent(@ModelAttribute StudentDTO studentDTO,@RequestParam Long id) {
		studentService.updateStudent(studentDTO,id);
		
		return "redirect:/";
	}	
	
	@GetMapping("/delete-student")
	public String getMethodName(@RequestParam Long id) {
		studentService.deleteStudent(id);
		return "redirect:/";
	}
	
	
	
	
}







