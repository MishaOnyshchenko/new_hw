package com.practice.students;

//Создать класс ClassRoom с полями  String classWord; int classLimit; Student[] studArr;

/*Реализовать методы показывающие:
сколько человек есть в конкретном классе
всех студентов класса(их имена и возраст)
всех студентов класса(только имя)
всех в отсортированном порядке по алфавиту
по возрасту и наоборот(реверс) по обоим полям.*/


public class ClassRoom {

    private String classWord;
    private int classLimit;
    private Student[] studArr;

    public ClassRoom(){

    }

    public ClassRoom(String classWord, int classLimit, Student[] studArr){
        this.classWord = classWord;
        this.classLimit = classLimit;
        this.studArr = studArr;
    }

    public String getClassWord() {
        return classWord;
    }

    public void setClassWord(String classWord) {
        this.classWord = classWord;
    }

    public int getClassLimit() {
        return classLimit;
    }

    public void setClassLimit(int classLimit) {
        this.classLimit = classLimit;
    }

    public Student[] getStudArr() {
        return studArr;
    }

    public void setStudArr(Student[] studArr) {
        this.studArr = studArr;
    }
}
