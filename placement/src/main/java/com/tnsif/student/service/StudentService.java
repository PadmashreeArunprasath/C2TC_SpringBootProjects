package com.tnsif.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.student.entity.Student;
import com.tnsif.student.repository.StudentRepository;

import java.util.List;
//import jakarta.transaction.Transactional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }
    
    public void updateStudent(Student student) {
    	studentRepository.save(student);
    }
}
