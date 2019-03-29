package com.example.demo;

public class Student extends Person implements Learner {

    private Double totalStudyTime=0.0;

    public Student(Long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(Double numberOfHours) {

        totalStudyTime = totalStudyTime + numberOfHours;
    }

    public Double getTotalStudyTime(){
        return this.totalStudyTime;
    }
}
