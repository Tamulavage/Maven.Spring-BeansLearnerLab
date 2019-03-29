package com.example.demo.classroom;

import com.example.demo.classroom.People;

import java.util.Iterator;
import java.util.List;

public class Students<Student> extends People {


    public Students(List<Student> personList) {super(personList);}

    @Override
    public Iterator iterator() {
        return null;
    }


}
