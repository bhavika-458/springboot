package com.example.firstapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.firstapp.repository.StudentRepository;

@Service
public class StudentService {

@Autowired

 private StudentRepository studentRepository;
 
 public List<Student> getAllStudents(){
    return StudentRepository.findAll();
 }
    public student 
}
