package com.FormValidation.FormValidation.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.FormValidation.FormValidation.dto.StudentDTO;
import com.FormValidation.FormValidation.models.Student;
import com.FormValidation.FormValidation.repository.StudentRepository;
import com.FormValidation.FormValidation.service.StudentService;

import jakarta.validation.Valid;

@Controller
public class StudentController {
	//to create object constructor injection
	private final StudentService studentservice;
		
	
	
//public StudentController(StudentService studentservice) {
//		super();
//		this.studentservice = studentservice;
//		this.studentrepository = null;
//	}
//to create object constructor injection
private final StudentRepository studentRepository;




public StudentController(StudentService studentservice, StudentRepository studentRepository) {
	super();
	this.studentservice = studentservice;
	this.studentRepository = studentRepository;
}



@GetMapping({"","/"})
public String home(Model model) {
List<Student>  students =	studentservice.getAllStudents();
model.addAttribute("students", students);
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
public String addstudent(@Valid @ModelAttribute StudentDTO studentDTO, BindingResult result,Model model,RedirectAttributes attributes) {
	if(studentDTO.getImage().isEmpty()) {
		result.addError(new FieldError("studentDTO","image", "image is required"));
	}
	
	
	if(result.hasErrors()) {
		return "add_student";
	}
	//System.out.println(studentDTO.getName()+"2");
	studentservice.saveStudent(studentDTO);
	attributes.addFlashAttribute("success","student added successfully");
	return "redirect:/";
}
@GetMapping("/std-delete")
	public String deleteStudent(@RequestParam Long id ,RedirectAttributes attributes) {
		studentservice.deleteStudent(id);
		attributes.addFlashAttribute("success","student deleted successfully");

		return "redirect:/";
	}

@GetMapping("/std-edit")
public String editStudent(@RequestParam Long id,Model model) {
	StudentDTO studentDTO = studentservice.editStudent(id);
	Student student = studentRepository.findById(id).get();
	model.addAttribute("studentDTO", studentDTO);
	model.addAttribute("student", student);
	return "edit_student";
	
}


@PostMapping("/edit-student")
public String updateStudnet(@Valid @ModelAttribute StudentDTO studentDTO, BindingResult result ,@RequestParam Long id ,Model model,RedirectAttributes attributes) {
if(result.hasErrors()) {
	Student student= studentRepository.findById(id).get();
	model.addAttribute("student" ,student);
	return "edit_student";
}
studentservice.updateStudent(studentDTO,id);
attributes.addFlashAttribute("success","student edited successfully");
return "redirect:/";

}


}

