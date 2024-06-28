package com.sms.student_management_system.Services;

import java.util.List;

import com.sms.student_management_system.Entity.Student;

public interface StudentService {
    List<Student> getAllStudent();
    Student saveStudent(Student student);
    Student getStudentById(Long id);
    Student editStudent(Student student);
    void deleteStudentById(Long id);
}
