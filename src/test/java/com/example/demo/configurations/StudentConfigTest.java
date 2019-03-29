package com.example.demo.configurations;

import com.example.demo.classroom.Student;
import com.example.demo.classroom.Students;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class StudentConfigTest {

    @Autowired
    @Qualifier("currentStudents")
    Students currentStudents;

    @Autowired
    @Qualifier("previousStudents")
    Students previousStudents;


    @Test
    public void currentStudentsTest() {

        // Given
        String[] currentStudentsNames = {"Swapna", "Davis", "Julian", "Thao", "Mark", "Katherine",
                "Neela", "Sean M.", "Will", "Delenda", "Joe", "Ashley B.",
                "Laxmi", "Yang", "Aswathy", "Swarthi", "Shuchi", "Cara",
                "Reese", "Sravani", "Eric", "Alex", "Ashley", "Brian", "David", "Ashley R.", "Eleanor",
                "Leah", "Nirmala", "Kyle", "Charlie", "Marlys", "Marshilla",
                "Ajah", "James", "Mike", "Robyn", "Francisco", "Sean R.", "Sunhyun"};
        List<String> expected = new ArrayList<>(Arrays.asList(currentStudentsNames));

        // When
        List<Student> actual = currentStudents.findAll();

        // Then
        actual.forEach(student -> Assert.assertTrue(expected.contains(student.getName())));

    }

    @Test
    public void previousStudentsTest() {
        // Given
        String[] previousStudentsNames = {"Khalil", "Kevin", "Ned", "Demetrius", "Andrea", "Ray",
                "Eugene", "Allison", "Brandon", "Jon", "Sean", "Connor",
                "Jenn", "Veronica", "Frankie", "Simran", "Chad", "Rachelle",
                "Nafis", "Vince", "April", "Michelle", "Jess", "Xzavia", "Ryan", "Vinny Vero"};
        List<String> expected = new ArrayList<>(Arrays.asList(previousStudentsNames));

        // When
        List<Student> actual = previousStudents.findAll();

        // Then
        actual.forEach(student -> Assert.assertTrue(expected.contains(student.getName())));

    }

}