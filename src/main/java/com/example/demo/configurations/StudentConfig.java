package com.example.demo.configurations;

import com.example.demo.Student;
import com.example.demo.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {

    private String[] currentStudentsNames = {"Swapna", "Davis", "Julian", "Thao", "Mark", "Katherine",
            "Neela", "Sean M.", "Will", "Delenda", "Joe", "Ashley B.",
            "Laxmi", "Yang", "Aswathy", "Swarthi", "Shuchi", "Cara",
            "Reese", "Sravani", "Eric", "Alex", "Ashley", "Brian", "David", "Ashley R.", "Eleanor",
            "Leah", "Nirmala", "Kyle", "Charlie", "Marlys", "Marshilla",
            "Ajah", "James", "Mike", "Robyn", "Francisco", "Sean R.", "Sunhyun"};

    private String[] previousStudentsNames = {"Khalil", "Kevin", "Ned", "Demetrius", "Andrea", "Ray",
            "Eugene", "Allison", "Brandon", "Jon", "Sean", "Connor",
            "Jenn", "Veronica", "Frankie", "Simran", "Chad", "Rachelle",
            "Nafis", "Vince", "April", "Michelle", "Jess", "Xzavia", "Ryan", "Vinny Vero"};

    @Bean(name = "currentStudents")
    public Students currentStudents() {

        return getStudents(currentStudentsNames);
    }

    @Bean
    public Students previousStudents() {
        return getStudents(previousStudentsNames);
    }

    private Students getStudents(String[] studentsNames) {
        List<Student> studentsList = new ArrayList<>();

        for (int i = 0; i < studentsNames.length; i++) {

            Student student = new Student((long) i, studentsNames[i]);
            studentsList.add(student);

        }
        return new Students(studentsList);
    }

}
