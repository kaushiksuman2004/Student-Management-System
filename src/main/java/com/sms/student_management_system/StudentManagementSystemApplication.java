package com.sms.student_management_system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sms.student_management_system.Entity.Student;
import com.sms.student_management_system.RepositoryDao.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		
		// Student student1 = new Student("Krishna", "Kumar", "krishna@gmail.com");
		// Student student2 = new Student("Kamlesh", "Kumar", "kamlesh@gmail.com");

		// this.studentRepository.saveAll(List.of(student1, student2));

	}

}
