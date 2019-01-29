package com.practice.students;

//Создать класс Student с полями name, age.

public class Student {

    private String name;
    private int age;


    public Student() {
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }


}
