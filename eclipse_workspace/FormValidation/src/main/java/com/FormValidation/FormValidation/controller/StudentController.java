package com.FormValidation.FormValidation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.FormValidation.FormValidation.dto.StudentDTO;
import com.FormValidation.FormValidation.service.StudentService;

import jakarta.validation.Valid;

@Controller
public class StudentController {
	//to create object constructor injection
	private final StudentService studentservice;
		
	
	
public StudentController(StudentService studentservice) {
		super();
		this.studentservice = studentservice;
	}


@GetMapping({"","/"})
public String home() {
	return "home";
}



//get method to fill the data



@GetMapping("/add-student")
public String addstudent(Model model) {
	model.addAttribute("studentDTO", new StudentDTO());
	return "add_student";
}


//after filling the form hast post it back to database
@PostMapping("/add-student")
public String addstudent(@Valid @ModelAttribute StudentDTO studentDTO, BindingResult result,Model model) {
	if(result.hasErrors()) {
		return "add_student";
	}
	//System.out.println(studentDTO.getName()+"2");
	studentservice.saveStudent(studentDTO);
	return "redirect:/";
}

}
