package com.example.demo.classroom;

import java.util.ArrayList;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {
    private List<PersonType> personList;

    public People() {
        personList = new ArrayList<>();
    }

    public People(List<PersonType> personList) {
        this.personList = personList;
    }


    public void add(PersonType person) {
        this.personList.add(person);
    }

    public void remove(PersonType person) {
        this.personList.remove(person);
    }

    public Integer size() {
        return this.personList.size();
    }

    public void clear() {
        this.personList.clear();
    }

    public void addAll(Iterable<PersonType> persons) {
        for(PersonType ele:persons){
            personList.add(ele);
        }

    }

    public PersonType findById(Long id) {
        PersonType person = null;
        for (PersonType ele : personList) {
            if (id.equals(ele.getId())) {
                person = ele;
            }
        }
        return person;
    }

    public List<PersonType> findAll() {
        return personList;
    }
}
