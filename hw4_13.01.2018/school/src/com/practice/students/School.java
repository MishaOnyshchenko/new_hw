package com.practice.students;

//Ќеобходимо создать 40 студентов, у каждого из которых должен быть указан возраст
// (произвольный в диапазоне от 7 до 16 лет, randomNum = ThreadLocalRandom.current().nextInt(min, max + 1) -вам в помощь) и им€.

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class School {
    static final int LENGTH = 1;

    public static void main(String[] args) {

        createSetOfStudents(40);


    }

//  Ќеобходимо создать 40 студентов, у каждого из которых должен быть указан возраст
// (произвольный в диапазоне от 7 до 16 лет, randomNum = ThreadLocalRandom.current().nextInt(min, max + 1) -вам в помощь) и им€.
    public static void createSetOfStudents(int size){

        Student[] studentsArray = new Student[size];

        for(int i = 0; i < size; i++){
            String name = "Student" + (i + 1);
            int age = ThreadLocalRandom.current().nextInt(7, 17);
            Student student = new Student(name, age);
            studentsArray[i] = student;
        }
        for (Student student : studentsArray) {
            System.out.println(student.getName() + " " + student.getAge());
        }
    }
}
