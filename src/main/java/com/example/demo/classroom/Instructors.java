package com.example.demo.classroom;

import java.util.Iterator;
import java.util.List;

public class Instructors<Instructor> extends People {

    public Instructors(List<Instructor> personList) {super(personList);}

    @Override
    public Iterator<Instructor> iterator() {
        return null;
    }



}
