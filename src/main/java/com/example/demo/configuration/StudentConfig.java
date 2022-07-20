package com.example.demo.configuration;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args->{
            Student Kasuni = new Student(1L, "Kasuni", "Matara", 22, "kasuni2000@gmail.com" );
            Student Nimal = new Student("Nimal", "Kalutara", 24, "nimal98@gmail.com");

            studentRepository.saveAll(List.of(Kasuni, Nimal));

        };
    }
}
