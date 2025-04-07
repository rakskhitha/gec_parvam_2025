package com.FormValidation.FormValidation.service;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.FormValidation.FormValidation.dto.StudentDTO;
import com.FormValidation.FormValidation.models.Student;
import com.FormValidation.FormValidation.repository.StudentRepository;

@Service
public class StudentService {
	
	
	//object for repository to store in database
	
	private StudentRepository studentRepository;
	

	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	public List<Student> getAllStudents() {
		List<Student> students=studentRepository.findAll();
		return students;
	}

	public void saveStudent(StudentDTO studentDTO) {
		// TODO Auto-generated method stub
		MultipartFile image=studentDTO.getImage();
		Date createdDate=new Date();
		String storeImageName = createdDate.getTime()+"_"+image.getOriginalFilename();
		
		try {
			String uploadDir="public/images/"; 
			Path uploadPath= Paths.get(uploadDir);
			if(!Files.exists(uploadPath)) {
				Files.createDirectories(uploadPath); //to store uplodaed image and create directory if public /images not exits
				
			}
			
			try {
				InputStream inputStream = image.getInputStream();
				Files.copy(inputStream, Paths.get(uploadDir+storeImageName),StandardCopyOption.REPLACE_EXISTING);
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			

		}
		Student student=new Student();
		student.setName(studentDTO.getName());
		student.setAge(studentDTO.getAge());
		student.setEmail(studentDTO.getEmail());
		student.setPassword(studentDTO.getPassword());
		student.setImagePath(storeImageName);
		
		studentRepository.save(student);
		
	}

	public void deleteStudent(Long id) {
		// TODO Auto-generated method stub
		Student student =studentRepository.findById(id).get();
		//what is the image path os the student
		String uploadDir="public/images/";
		Path imagePath=Paths.get(uploadDir+student.getImagePath());
		try {
			Files.delete(imagePath);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		studentRepository.delete(student);
		
	}

	public StudentDTO editStudent(Long id) {
		// TODO Auto-generated method stub
		
		Student student = studentRepository.findById(id).get();
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setName(student.getName());
		studentDTO.setAge(student.getAge());
		studentDTO.setEmail(student.getEmail());
		studentDTO.setPassword(student.getPassword());
		
		return studentDTO;
	}
	
	
	public void updateStudent(StudentDTO studentDTO, Long id) {
		
		
		
		Student student = studentRepository.findById(id).get();
		
		if(!studentDTO.getImage().isEmpty()) {
			Path oldImagePath=Paths.get("public/images/"+student.getImagePath());
			try {
				Files.delete(oldImagePath);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				// TODO: handle exception
			}
			MultipartFile image=studentDTO.getImage();
			Date createAt=new Date();
			String storeImagename=createAt.getTime()+image.getOriginalFilename();
			String uploadDir = "public/images/";
			
			try {
				InputStream inputStream = image.getInputStream();
				Files.copy(inputStream, Paths.get(uploadDir+storeImagename), StandardCopyOption.REPLACE_EXISTING);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				// TODO: handle exception
			}
			student.setImagePath(storeImagename);		
			}
		student.setName(studentDTO.getName());
		student.setAge(studentDTO.getAge());
		student.setEmail(studentDTO.getEmail());
		student.setPassword(studentDTO.getPassword());
		studentRepository.save(student);
		
	}
	

}
