package com.example.demo_com_jpa;

import com.example.demo_com_jpa.entities.Student;
import com.example.demo_com_jpa.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoComJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoComJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
		return runner -> {
			saveStudent(new Student("Primero nome test", "Sobrenome teste", "email teste"),
					studentRepository);
		};
	}

	private void saveStudent(Student student, StudentRepository studentRepository) {
		studentRepository.save(student);
	}

}
