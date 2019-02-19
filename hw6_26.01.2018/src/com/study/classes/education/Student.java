package com.study.classes.education;

public class Student extends Schoolboy {

    private String major;


    public Student(String name, int age) {
        super(name, age);
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString() +
                "{major='" + major + "'}";
    }
}

