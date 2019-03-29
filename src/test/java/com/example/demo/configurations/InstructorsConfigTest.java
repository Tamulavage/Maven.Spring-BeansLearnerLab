package com.example.demo.configurations;

import com.example.demo.classroom.Instructor;
import com.example.demo.classroom.Instructors;
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
public class InstructorsConfigTest {

    @Autowired
    @Qualifier("tcUsaInstructors")
    Instructors usaInstructors;

    @Autowired
    @Qualifier("tcUkInstructors")
    Instructors  ukInstructors;

    @Autowired
    @Qualifier("instructors")
    Instructors  instructors;

    @Test
    public void testUSAInstructors(){

        // Given
        String[] usaNames = {"Kris", "Leon"};
        List<String> expected = new ArrayList<>(Arrays.asList(usaNames));

        // When
        List<Instructor> actual = usaInstructors.findAll();

        // Then
        actual.forEach(instructor -> Assert.assertTrue(expected.contains(instructor.getName())));
    }

    @Test
    public void testUKInstructors(){
        // Given
        String[] ukNames = {"Dolio", "Nhu"};
        List<String> expected = new ArrayList<>(Arrays.asList(ukNames));

        // When
        List<Instructor> actual = ukInstructors.findAll();

        // Then
        actual.forEach(instructor -> Assert.assertTrue(expected.contains(instructor.getName())));
    }

    @Test
    public void testAllInstructors(){
        // Given
        String[] names = {"Kris", "Leon","Dolio", "Nhu"};
        List<String> expected = new ArrayList<>(Arrays.asList(names));

        // When
        List<Instructor> actual = instructors.findAll();

        // Then
        actual.forEach(instructor -> Assert.assertTrue(expected.contains(instructor.getName())));
    }


}