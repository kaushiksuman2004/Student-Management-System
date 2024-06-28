package com.sms.student_management_system.RepositoryDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sms.student_management_system.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
