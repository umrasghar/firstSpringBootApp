package com.cwiztech;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cwiztech.entity.Student;
import com.cwiztech.repository.StudentRepository;

@SpringBootApplication
public class StudentmanagmentsystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagmentsystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student("Ahmad", "Asad", "ahmadasad@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Usman", "Ali", "usmanali@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Umar", "Asghar", "umarasghar@gmail.com");
//		studentRepository.save(student3);
		
	}

}
