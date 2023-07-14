package com.studentmanagement.studentmanagement;

import com.studentmanagement.studentmanagement.entity.Student;
import com.studentmanagement.studentmanagement.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentmanagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagementApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

	}
}
