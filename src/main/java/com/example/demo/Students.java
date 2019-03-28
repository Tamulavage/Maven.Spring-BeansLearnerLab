package com.example.demo;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Students extends People<Student>{

    public Students(Integer numOfStudents){
        for(Long i=0l; i<numOfStudents;i++){
            super.add(new Student(i, Long.toString(i)));
        }
    }

    @Override
    public Iterator<Student> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Student> action) {

    }

    @Override
    public Spliterator<Student> spliterator() {
        return null;
    }
}
