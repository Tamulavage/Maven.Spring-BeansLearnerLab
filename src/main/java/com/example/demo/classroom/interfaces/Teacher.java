package com.example.demo.classroom.interfaces;

import com.example.demo.classroom.interfaces.Learner;

public interface Teacher {
    void teach(Learner learner, Double numberOfHours);
    void lecture(Iterable<? extends  Learner> learners, Double numberOfHours);
}
