package com.cwiztech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cwiztech.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	
}
