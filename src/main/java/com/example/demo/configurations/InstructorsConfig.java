package com.example.demo.configurations;

import com.example.demo.Instructor;
import com.example.demo.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {

    @Bean
    public Instructors tcUsaInstructors(){
        // todo
        return null;
    }

    @Bean
    public Instructors tcUkInstructors(){
        // todo
        return null;
    }

    @Bean
    @Primary
    public Instructors instructors(){
        // todo
        return null;
    }
}
