package com.example.demo;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Instructors<Instructor> extends People {

    public Instructors(List<Instructor> personList) {super(personList);}

    @Override
    public Iterator<Instructor> iterator() {
        return null;
    }



}
