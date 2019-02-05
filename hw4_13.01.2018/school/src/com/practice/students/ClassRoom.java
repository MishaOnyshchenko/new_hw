package com.practice.students;

//Создать класс ClassRoom с полями  String classWord; int classLimit; Student[] studArr;

/*Реализовать методы показывающие:
сколько человек есть в конкретном классе
всех студентов класса(их имена и возраст)
всех студентов класса(только имя)
всех в отсортированном порядке по алфавиту
по возрасту и наоборот(реверс) по обоим полям.*/


import java.util.Arrays;
import java.util.Comparator;

public class ClassRoom {

    private String classWord;
    private int classLimit;
    private Student[] studArr;

    public ClassRoom() {

    }

    public ClassRoom(String classWord, int classLimit, Student[] studArr) {
        this.classWord = classWord;
        this.classLimit = classLimit;
        this.studArr = studArr;
    }

    public String getClassWord() {
        return classWord;
    }

    public Student[] getStudArr() {
        return studArr;
    }


    //    сколько человек есть в конкретном классе
    public void showHowManyStudents() {
        int howManyStudents = 0;
        for (Student student : studArr) {
            if (student != null) {
                howManyStudents++;
            }
        }
        System.out.println(howManyStudents + " students in the class " + classWord);
    }


    //    всех студентов класса(их имена и возраст)
    public void showNameAndAge() {
        System.out.println("\nNames and ages of students from class " + classWord);
        for (Student student : studArr) {
            System.out.println(student.getName() + ", " + student.getAge());
        }
    }


    //    всех студентов класса(только имя)
    public void showName() {
        System.out.println("\nJust names of students from class " + classWord);
        for (Student student : studArr) {
            System.out.println(student.getName());
        }
    }


    //    всех в отсортированном порядке по алфавиту
    public void sortByName() {
//        Arrays.sort(studArr, (a, b) -> a.getName().compareTo(b.getName()));
        Comparator.comparing(Student::getName);
        System.out.println("\nStudents sorted by names from class " + classWord);
        System.out.println(Arrays.toString(studArr));
    }

    public void sortByName2() {
        Student temp;
        for (int i = 0; i < studArr.length - 1; i++) {
            for (int j = 0; j < studArr.length - 1 - i; j++) {
                if (studArr[j].getName().compareTo(studArr[j + 1].getName()) > 0) {
                    temp = studArr[j];
                    studArr[j] = studArr[j + 1];
                    studArr[j + 1] = temp;
                }
            }
        }
        System.out.println("\nVol.2 - students sorted by names from class " + classWord);
        System.out.println(Arrays.toString(studArr));
    }

    //    всех в отсортированном порядке по алфавиту (реверс)
    public void sortByNameReverse() {
        Arrays.sort(studArr, (a, b) -> b.getName().compareTo(a.getName()));
        System.out.println("\nStudents reverse-sorted by name from class " + classWord);
        System.out.println(Arrays.toString(studArr));
    }


    public void sortByNameReverse2() {
        Student temp;

        for (int i = 0; i < studArr.length - 1; i++) {
            for (int j = 0; j < studArr.length - 1 - i; j++) {
                if (studArr[j].getName().compareTo(studArr[j + 1].getName()) < 0) {
                    temp = studArr[j];
                    studArr[j] = studArr[j + 1];
                    studArr[j + 1] = temp;
                }
            }
        }
        System.out.println("\nVol.2 - revers-sorted by name from class " + classWord);
        System.out.println(Arrays.toString(studArr));
    }

    //    всех в отсортированном порядке по возрасту и наоборот(реверс).
    public void sortByAge(){
        Arrays.sort(studArr, (a, b) -> Integer.compare(a.getAge(), b.getAge()));
        System.out.println("\nStudents sorted by age from class " + classWord);
        System.out.println(Arrays.toString(studArr));
    }

    //    всех в отсортированном порядке по возрасту и наоборот(реверс).
    public void sortByAge2(){
        Student temp;
        for(int i = 0; i < studArr.length - 1; i++){
            for(int j = 0; j < studArr.length - 1 - i; j++){
                if(studArr[j].getAge() > studArr[j + 1].getAge()){
                    temp = studArr[j];
                    studArr[j] = studArr[j + 1];
                    studArr[j + 1] = temp;
                }
            }
        }
        System.out.println("\nVol.2 - sorted by age from class " + classWord);
        System.out.println(Arrays.toString(studArr));
    }

    //    всех в отсортированном порядке по возрасту и наоборот(реверс).
    public void sortByAgeReverse(){
        Arrays.sort(studArr, (a, b) -> Integer.compare(b.getAge(), a.getAge()));
        System.out.println("\nStudents reverse-sorted by age from class " + classWord);
        System.out.println(Arrays.toString(studArr));
    }

    //    всех в отсортированном порядке по возрасту и наоборот(реверс).
    public void sortByAgeReverse2(){
        Student temp;
        for(int i = 0; i < studArr.length - 1; i++){
            for(int j = 0; j < studArr.length - 1 - i; j++){
                if(studArr[j].getAge() < studArr[j + 1].getAge()){
                    temp = studArr[j];
                    studArr[j] = studArr[j + 1];
                    studArr[j + 1] = temp;
                }
            }
        }
        System.out.println("\nVol.2 - reverse-sorted by age from class " + classWord);
        System.out.println(Arrays.toString(studArr));
    }

//    метод который находит конкретного студента по имени в конкретном классе
    public void findStudentByName(String name){
        int count = 0;
        System.out.println("\nShow " + name + " in the class " + classWord);

        for (Student s: studArr) {
            if(s.getName().equals(name)){
                System.out.println(s.getName() + " (" + s.getAge() + " years)");
                count++;
            }
        }
        System.out.println("Total: " + count + " with name " + name + " in the class " + classWord);
    }
}
