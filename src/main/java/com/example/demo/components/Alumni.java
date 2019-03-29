package com.example.demo.components;

import com.example.demo.classroom.Instructor;
import com.example.demo.classroom.Instructors;
import com.example.demo.classroom.Student;
import com.example.demo.classroom.Students;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class Alumni {

    Students students;
    Instructors instructors;


    public Alumni(Instructors instructors, @Qualifier("previousStudents") Students students) {
        this.instructors = instructors;
        this.students = students;
    }

    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    @PostConstruct
    public void executeBootCamp() {
        List<Student> classStudents = students.findAll();
        List<Instructor> classInstructors = instructors.findAll();

        classStudents.forEach(student -> student.learn(1200.0));

        int numberOfInstructors = instructors.size();
        int numberOfStudents = students.size();
        double numberOfHoursToTeachEachStudent = 1200;
        double numberOfHoursToTeach = numberOfHoursToTeachEachStudent * numberOfStudents;
        double numberOfHoursPerInstructor = numberOfHoursToTeach / numberOfInstructors;

        classInstructors.forEach(instructor -> instructor.setTotalTimeTeached(numberOfHoursPerInstructor));

    }

}
