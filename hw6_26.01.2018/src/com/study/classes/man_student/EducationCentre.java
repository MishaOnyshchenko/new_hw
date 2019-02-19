package com.study.classes.man_student;

/*10 Создать класс Man (человек), с полями: имя, возраст, пол и вес. Определить методы задания имени, возраста и веса.
Создать производный класс Student, имеющий поле года обучения. Определить методы задания и увеличения года обучения. */

public class EducationCentre {

    public static void main(String[] args) {

        Student student = new Student("Kipyatkov", 11, 'm', 52.8);
        student.setGrade(6);
        System.out.println(student.toString());

        student.nextGrade();
        System.out.println(student.toString());

    }
}
