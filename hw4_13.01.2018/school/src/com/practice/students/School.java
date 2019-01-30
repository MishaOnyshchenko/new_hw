package com.practice.students;

//Необходимо создать 40 студентов, у каждого из которых должен быть указан возраст
// (произвольный в диапазоне от 7 до 16 лет, randomNum = ThreadLocalRandom.current().nextInt(min, max + 1) -вам в помощь) и имя.

//После чего нужно создать класс А и класс Б(это уже будут объекты на основании класса ClassRoom).
//В класс А записать (добавить студентов) возрастом от 7 до 12 лет, остальных в класс Б.
//При чем, каждый класс имеет макс кол-во студентов. Для А -12, для Б -15.
//Собственно для всех мест не хватит.
//После добавления мы должны видеть сколько студентов не смогло записаться в класс и какие именно.

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class School {
//  still not enrolled students (applicants)
    private static Student[] applicants;

    public static void main(String[] args) {
//      write 40 students (applicants)
        Student[] allStudents = createSetOfStudents(40);
        System.out.println("All students which are pretending to enter the school: " + Arrays.toString(allStudents));

//      write all undistributed by classes students (applicants) to static array
        applicants = allStudents;
//        System.out.println("Rest: " + Arrays.toString(applicants));

//      create an array of students for class A (max 12 students to 12 years old)
        Student[] arrayClassA = createStudentsArray(applicants, 12, 12);
        System.out.println("Array classA: " + Arrays.toString(arrayClassA));

//      create an array of students for class B (max 15 students to 16 years old)
        Student[] arrayClassB = createStudentsArray(applicants, 15, 16);
        System.out.println("Array classB: " + Arrays.toString(arrayClassB));

        System.out.println("Array of applicants Now: " + Arrays.toString(applicants));

        ClassRoom classA = new ClassRoom("A", 12, arrayClassA);
        ClassRoom classB = new ClassRoom("B", 15, arrayClassB);


    }

    //В класс А записать (добавить студентов) возрастом от 7 до 12 лет, остальных в класс Б.
    //При чем, каждый класс имеет макс кол-во студентов. Для А -12, для Б -15.
    public static Student [] createStudentsArray(Student[] allStudents, int maxStudents, int maxAge) {
        int rightAge = 0;
        int toOtherClasses = 0;

        Student[] studentsArray = new Student[maxStudents];

//      count students with correct age;
        for (Student student : allStudents) {
            if (student.getAge() <= maxAge) {
                rightAge++;
            }
        }

//      check how many students should go to other classes
//   a) if students with correct age more than places in this class,
//      we should take only maxSize students to this class
//      and the rest will be send to static array with undistributed students(applicants)
        if (rightAge > maxStudents) {
            toOtherClasses = allStudents.length - maxStudents;
        }
//   b) if places more than students with correct age, we should send all other students
//      to static array with undistributed students(applicants)
        else {
            toOtherClasses = allStudents.length - rightAge;
        }

//      set size for static array with undistributed students(applicants)
        applicants = new Student[toOtherClasses];

        for (int i = 0, j = 0, k = 0; i < allStudents.length; i++ ){
            if(j < studentsArray.length){
                if(allStudents[i].getAge() <= maxAge){
                    studentsArray[j] = allStudents[i];
                    j++;
                }
                else{
                    applicants[k] = allStudents[i];
                    k++;
                }
            }
            else{
                applicants[k] = allStudents[i];
                k++;
            }

        }
//        System.out.println("Array to A class: " + Arrays.toString(studentsArray));
//        System.out.println("Rest array Now: " + Arrays.toString(applicants));

        return studentsArray;

    }





    //  Необходимо создать 40 студентов, у каждого из которых должны быть указаны имя и возраст
    // (произвольный в диапазоне от 7 до 16 лет, randomNum = ThreadLocalRandom.current().nextInt(min, max + 1).
    public static Student[] createSetOfStudents(int size) {
        Student[] studentsArray = new Student[size];

        for (int i = 0; i < size; i++) {
            String name = "Student" + (i + 1);
            int age = ThreadLocalRandom.current().nextInt(7, 17);
            Student student = new Student(name, age);
            studentsArray[i] = student;
        }
//        for (Student student : studentsArray) {
//            System.out.println(student.getName() + " " + student.getAge());
//        }
        return studentsArray;
    }


}


