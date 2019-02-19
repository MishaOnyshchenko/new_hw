package com.study.classes.education;

public class Schoolboy {

    private String name;
    private int age;

    private int grade;

    public Schoolboy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
