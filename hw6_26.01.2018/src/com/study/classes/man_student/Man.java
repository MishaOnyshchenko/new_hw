package com.study.classes.man_student;


/*10 Создать класс Man (человек), с полями: имя, возраст, пол и вес. Определить методы задания имени, возраста и веса.
Создать производный класс Student, имеющий поле года обучения. Определить методы задания и увеличения года обучения. */

public class Man {

    private String name;
    private int age;
    private char gender;
    private double weight;

    public Man(String name, int age, char gender, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", weight=" + weight +
                '}';
    }
}
