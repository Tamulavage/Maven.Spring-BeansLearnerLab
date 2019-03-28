package com.example.demo.configurations;

import com.example.demo.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents() {
        // todo
        return null;
    }

    @Bean
    public Students previousStudents() {
        // todo
        return null;
    }
}
