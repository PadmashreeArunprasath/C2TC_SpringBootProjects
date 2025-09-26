package com.tnsif.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tnsif.student.entity.Student;
import com.tnsif.student.service.StudentService;

import java.util.List;


import jakarta.persistence.NoResultException;

@RestController
@RequestMapping("/api/students")
public class StudentController {

	@Autowired
	private StudentService c;

	@GetMapping
	public List<Student> list() {
		return c.getAllStudents();
	}

	@PostMapping
	public void add(@RequestBody Student s1) {
		
		c.saveStudent(s1);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Student> get (@PathVariable Integer id) {
			try {
				Student c2= c.getStudentById(id);
				return new ResponseEntity<Student>(c2, HttpStatus.OK);
			}
			catch (NoResultException e) {
				return new ResponseEntity<Student> (HttpStatus.NOT_FOUND);
			}
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		c.deleteStudent(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Student> update(@PathVariable Integer id,@RequestBody Student update_c){
		try {
			Student exist_c=c.getStudentById(id);
			exist_c.setName(update_c.getName());
			exist_c.setEmail(update_c.getEmail());
			exist_c.setCourse(update_c.getCourse());
			exist_c.setAge(update_c.getAge());
			exist_c.setDepartment(update_c.getDepartment());
			exist_c.setPhone(update_c.getPhone());
			exist_c.setAddress(update_c.getAddress());
			c.updateStudent(exist_c);
			return new ResponseEntity<Student>(exist_c,HttpStatus.OK);
		}catch(NoResultException e) {
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
			
		}
	}
			

}
