package com.practice.students;

//���������� ������� 40 ���������, � ������� �� ������� ������ ���� ������ �������
// (������������ � ��������� �� 7 �� 16 ���, randomNum = ThreadLocalRandom.current().nextInt(min, max + 1) -��� � ������) � ���.

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class School {
    static final int LENGTH = 1;

    public static void main(String[] args) {

        createSetOfStudents(40);


    }

//  ���������� ������� 40 ���������, � ������� �� ������� ������ ���� ������ �������
// (������������ � ��������� �� 7 �� 16 ���, randomNum = ThreadLocalRandom.current().nextInt(min, max + 1) -��� � ������) � ���.
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
