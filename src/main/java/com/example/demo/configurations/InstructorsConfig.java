package com.example.demo.configurations;

import com.example.demo.classroom.Instructor;
import com.example.demo.classroom.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InstructorsConfig {

    private String[] usaNames = {"Kris", "Leon"};
    private String[] ukNames = {"Dolio", "Nhu"};

    @Bean
    public Instructors tcUsaInstructors() {
        return getInstructors(usaNames);
    }

    @Bean
    public Instructors tcUkInstructors() {
        return getInstructors(ukNames);
    }

    private Instructors getInstructors(String[] instructorNames) {
        List<Instructor> instructorList = new ArrayList<>();

        for (int i = 0; i < instructorNames.length; i++) {

            Instructor instructor = new Instructor((long) i, instructorNames[i]);
            instructorList.add(instructor);
        }
        return new Instructors(instructorList);
    }

    @Bean
    @Primary
    public Instructors instructors() {
        String[] instructors = new String[usaNames.length + ukNames.length];
        System.arraycopy(usaNames, 0, instructors, 0, usaNames.length);
        System.arraycopy(ukNames, 0, instructors, usaNames.length, ukNames.length);

        return getInstructors(instructors);
    }
}
