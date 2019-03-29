package com.example.demo;

public class Instructor extends Person implements Teacher {

    public Double getTotalTimeTeached() {
        return totalTimeTeached;
    }

    public void setTotalTimeTeached(Double totalTimeTeached) {
        this.totalTimeTeached = totalTimeTeached;
    }

    private Double totalTimeTeached = 0.0;

    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, Double numberOfHours) {
        learner.learn(numberOfHours);

    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, Double numberOfHours) {
        Integer learnersCount = 0;

        for (Learner ele : learners) {
            learnersCount++;
        }

        Double increaseBy = learnersCount / numberOfHours;

        for (Learner ele : learners) {
            ele.learn(increaseBy);
        }

    }
}
