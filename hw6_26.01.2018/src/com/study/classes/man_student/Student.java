package com.study.classes.man_student;

public class Student extends Man{

    private int grade;

    public Student(String name, int age, char gender, double weight) {
        super(name, age, gender, weight);
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void nextGrade(){
        this.grade = ++grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                "} " + super.toString();
    }
}
