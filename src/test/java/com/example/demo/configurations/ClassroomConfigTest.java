package com.example.demo.configurations;

import com.example.demo.classroom.Classroom;
import com.example.demo.classroom.Instructors;
import com.example.demo.classroom.Students;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class ClassroomConfigTest {

    @Autowired
    @Qualifier("currentStudents")
    Students currentStudents;

    @Autowired
    @Qualifier("previousStudents")
    Students previousStudents;

    @Autowired
    @Qualifier("instructors")
    Instructors allInstructors;

    @Autowired
    ClassroomConfig classroomConfig;


    @Autowired
    @Qualifier("currentClass")
    Classroom currentClassroom;

    @Autowired
    @Qualifier("previousClass")
    Classroom prevClassroom;

    @Test
    public void testCurrentClassStudents(){
        // Given
        Students expected = currentStudents;

        // When
        Students actual =  classroomConfig.currentCohort().getStudents();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCurrentClassInstructor(){
        // Given
        Instructors expected = allInstructors;

        // When
        Instructors actual =  classroomConfig.currentCohort().getInstructors();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPrevClassStudents(){
        // Given
        Students expected = previousStudents;

        // When
        Students actual =  classroomConfig.previousCohort().getStudents();

        // Then
        Assert.assertEquals(expected, actual);
    }

}