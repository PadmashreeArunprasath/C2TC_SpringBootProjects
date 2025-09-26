package com.tnsif.student.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
    @Column(name="id")
    private int id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="email", unique = true, nullable = false)
    private String email;
    
    @Column(name="course")
    private String course;
    
    @Column(name="age")
    private Integer age;
    
    @Column(name="dept")
    private String department;
    
    @Column(name="phone")
    private String phone;
    
    @Column(name="address")
    private String address;

    
    public Student() {}

    public Student(int id, String name, String email, String course, Integer age, String department, String phone, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.course = course;
        this.age = age;
        this.department = department;
        this.phone = phone;
        this.address = address;
    }

    // ✅ Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", course=" + course + ", age=" + age
				+ ", department=" + department + ", phone=" + phone + ", address=" + address + "]";
	}
}
