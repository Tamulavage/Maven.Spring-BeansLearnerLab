package com.example.demo.components;

import com.example.demo.Instructor;
import com.example.demo.Student;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@SpringBootTest
@RunWith(SpringRunner.class)
public class AlumniTest {

    @Autowired
    Alumni alumni;

    @Test
    public void testAlumniAddHours(){
        // Given
        Double expected = 1200d;

        // When
        List<Student> actual = alumni.getStudents().findAll();

        // Then
        actual.forEach(student -> Assert.assertEquals(expected, student.getTotalStudyTime()));

    }

    @Test
    public void testInstructorsHours(){
        //given
        Double expected = 7800d;

        // when
        List<Instructor> actual = alumni.getInstructors().findAll();

        // then
        actual.forEach(instructor -> Assert.assertEquals(expected, instructor.getTotalTimeTeached()));
    }

}