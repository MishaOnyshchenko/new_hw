package com.practice.students;

import java.util.concurrent.ThreadLocalRandom;



/*Создать класс Student с полями name, age.*/

public class Student {

    private String name;
    private int age;



    public Student(){
        this.name = randomName();
        this.age = randomAge();
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String randomName(){
        String names [] = {"Kolya", "Sasha", "Petya", "Katya", "Olya", "Valera",
                "Anton", "Nina", "Kirill", "Bogdan","Taras", "Nazar", "Valya",
                "Vera", "Nadya", "Lyuba", "Ruslan", "Andrey", "Kostya", "Zina"};
        return names[ThreadLocalRandom.current().nextInt(0, names.length)];
    }

    public int randomAge(){
        return ThreadLocalRandom.current().nextInt(7, 17);
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
