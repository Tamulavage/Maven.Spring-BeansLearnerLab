package com.example.demo.configurations;

import com.example.demo.classroom.Classroom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @Autowired
    StudentConfig studentConfig;

    @Autowired
    InstructorsConfig instructorsConfig;

    @Bean
    @Qualifier("currentClass")
    @DependsOn({"instructors", "currentStudents"})
    public Classroom currentCohort() {
        return new Classroom(instructorsConfig.instructors(), studentConfig.currentStudents());
    }

    @Bean
    @Qualifier("previousClass")
    @DependsOn({"instructors", "previousStudents"})
    public Classroom previousCohort() {

        return new Classroom(instructorsConfig.instructors(), studentConfig.previousStudents());
    }
}
