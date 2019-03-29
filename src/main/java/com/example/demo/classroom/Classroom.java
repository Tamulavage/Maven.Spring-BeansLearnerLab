package com.example.demo.classroom;

import com.example.demo.classroom.interfaces.Teacher;

public class Classroom {
    public Instructors getInstructors() {
        return instructors;
    }

    public Students getStudents() {
        return students;
    }

    private Instructors instructors;
    private Students students;

    public Classroom(Instructors instructors, Students students){
        this.instructors = instructors;
        this.students = students;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.findAll(), numberOfHours);
    }

}
