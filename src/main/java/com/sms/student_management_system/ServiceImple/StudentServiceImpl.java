package com.sms.student_management_system.ServiceImple;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sms.student_management_system.Entity.Student;
import com.sms.student_management_system.RepositoryDao.StudentRepository;
import com.sms.student_management_system.Services.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;
    
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student editStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudentById(Long id){
        studentRepository.deleteById(id);
    }
}
