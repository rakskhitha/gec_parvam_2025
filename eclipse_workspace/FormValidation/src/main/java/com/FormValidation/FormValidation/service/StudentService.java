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

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public void saveStudent(StudentDTO studentDTO) {
        MultipartFile image = studentDTO.getImage();
        MultipartFile document = studentDTO.getDocument();
        Date createdDate = new Date();

        // Handling image upload
        String storeImageName = createdDate.getTime() + "_" + image.getOriginalFilename();
        String uploadDir = "public/images/";

        try {
            // Ensure the image directory exists
            Path uploadPath = Paths.get(uploadDir);
            if (!Files.exists(uploadPath)) {
                Files.createDirectories(uploadPath);
            }

            InputStream inputStream = image.getInputStream();
            Files.copy(inputStream, Paths.get(uploadDir + storeImageName), StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Handling document upload (PDF)
        String storeDocumentName = createdDate.getTime() + "_" + document.getOriginalFilename();
        String documentDir = "public/documents/";

        try {
            // Ensure the documents directory exists
            Path documentPath = Paths.get(documentDir);
            if (!Files.exists(documentPath)) {
                Files.createDirectories(documentPath);
            }

            InputStream inputStream = document.getInputStream();
            Files.copy(inputStream, Paths.get(documentDir + storeDocumentName), StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Saving the student to the database
        Student student = new Student();
        student.setName(studentDTO.getName());
        student.setAge(studentDTO.getAge());
        student.setEmail(studentDTO.getEmail());
        student.setPassword(studentDTO.getPassword());
        student.setImagePath(storeImageName);
        student.setDocumentPath(storeDocumentName);

        studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        Student student = studentRepository.findById(id).get();
        
        // Delete image
        String uploadDir = "public/images/";
        Path imagePath = Paths.get(uploadDir + student.getImagePath());
        try {
            Files.delete(imagePath);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        // Delete document
        String documentDir = "public/documents/";
        Path documentPath = Paths.get(documentDir + student.getDocumentPath());
        try {
            Files.delete(documentPath);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        studentRepository.delete(student);
    }

    public StudentDTO editStudent(Long id) {
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
        
        if (!studentDTO.getImage().isEmpty()) {
            Path oldImagePath = Paths.get("public/images/" + student.getImagePath());
            try {
                Files.delete(oldImagePath);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
            MultipartFile image = studentDTO.getImage();
            String storeImageName = new Date().getTime() + "_" + image.getOriginalFilename();
            String uploadDir = "public/images/";

            try {
                InputStream inputStream = image.getInputStream();
                Files.copy(inputStream, Paths.get(uploadDir + storeImageName), StandardCopyOption.REPLACE_EXISTING);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            student.setImagePath(storeImageName);
        }

        if (!studentDTO.getDocument().isEmpty()) {
            Path oldDocumentPath = Paths.get("public/documents/" + student.getDocumentPath());
            try {
                Files.delete(oldDocumentPath);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
            MultipartFile document = studentDTO.getDocument();
            String storeDocumentName = new Date().getTime() + "_" + document.getOriginalFilename();
            String documentDir = "public/documents/";

            try {
                InputStream inputStream = document.getInputStream();
                Files.copy(inputStream, Paths.get(documentDir + storeDocumentName), StandardCopyOption.REPLACE_EXISTING);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            student.setDocumentPath(storeDocumentName);
        }

        student.setName(studentDTO.getName());
        student.setAge(studentDTO.getAge());
        student.setEmail(studentDTO.getEmail());
        student.setPassword(studentDTO.getPassword());
        studentRepository.save(student);
    }
}
