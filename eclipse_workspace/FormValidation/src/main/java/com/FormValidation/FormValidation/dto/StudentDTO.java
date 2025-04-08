package com.FormValidation.FormValidation.dto;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class StudentDTO {
    @NotBlank(message="student name is required")
    private String name;
    
    @Min(10)
    private int age;
    
    @NotBlank(message="student email is required")
    @Email
    private String email;
    
    @NotBlank(message="student password is required")
    private String password;
    
    private MultipartFile image;  // Image field
    private MultipartFile document;  // PDF field
    
    // Getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public MultipartFile getImage() {
        return image;
    }
    public void setImage(MultipartFile image) {
        this.image = image;
    }
    public MultipartFile getDocument() {
        return document;
    }
    public void setDocument(MultipartFile document) {
        this.document = document;
    }
}
