package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student maria = new Student(
                    "Maria", "Jones", "maria.jones@demo.com", 21
            );
            studentRepository.save(maria);
            Student joe = new Student(
                    "Joe", "Jones", "joe.jones@demo.com", 29
            );
            studentRepository.save(joe);
        };
    }

}
