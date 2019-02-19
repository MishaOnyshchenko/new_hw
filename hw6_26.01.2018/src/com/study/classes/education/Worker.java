package com.study.classes.education;

public class Worker extends Student{

    private String profession;


    public Worker(String name, int age) {
        super(name, age);
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return super.toString() +
                "{profession='" + profession + "'}";
    }
}
