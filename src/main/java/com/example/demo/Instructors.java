package com.example.demo;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Instructors extends People<Instructor> {

    public Instructors(Integer numOfStudents){
        for(Long i=0l; i<numOfStudents;i++){
            super.add(new Instructor(i, Long.toString(i)));
        }
    }

    @Override
    public Iterator<Instructor> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Instructor> action) {

    }

    @Override
    public Spliterator<Instructor> spliterator() {
        return null;
    }
}
