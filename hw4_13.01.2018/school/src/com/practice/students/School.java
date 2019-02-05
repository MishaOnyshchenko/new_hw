package com.practice.students;

/*
Необходимо создать 40 студентов, у каждого из которых должен быть указан возраст
(произвольный в диапазоне от 7 до 16 лет, randomNum = ThreadLocalRandom.current().nextInt(min, max + 1) -вам в помощь) и имя.

После чего нужно создать класс А и класс Б(это уже будут объекты на основании класса ClassRoom).
В класс А записать (добавить студентов) возрастом от 7 до 12 лет, остальных в класс Б.
При чем, каждый класс имеет макс кол-во студентов. Для А -12, для Б -15.
Собственно для всех мест не хватит.
После добавления мы должны видеть сколько студентов не смогло записаться в класс и какие именно.
*/

/*
Реализовать методы показывающие:
сколько человек есть в конкретном классе
всех студентов класса(их имена и возраст)
всех студентов класса(только имя)
всех в отсортированном порядке по алфавиту
по возрасту и наоборот(реверс) по обоим полям.

метод который находит конкретного студента по имени в конкретном классе
метод который ищет и показывает в каких классах есть студент с таким именем если их несколько.
(возможно нужно будет добавить дополнительное поле в один из классов)

* доп задание - когда мы создаем студентов, создать метод который будет писать произвольные - нормальные имена. (edited)
*/

import java.util.Arrays;

public class School {

//    not enrolled students (applicants)
    private static Student[] applicants;

    public static void main(String[] args) {
//        create 40 students (applicants)
        Student[] allStudents = createAllStudentsArray(40);
        System.out.println("All students which are pretending to enter the school: " + Arrays.toString(allStudents));
//        put all undistributed to classes students (applicants) to static array
        applicants = allStudents;

//        create an array of students for class A (max 12 students to 12 years old)
        Student[] arrayClassA = createForClassStudentsArray(applicants, 12, 12);
        System.out.println("\nArray classA: " + Arrays.toString(arrayClassA));

//        create an array of students for class B (max 15 students to 16 years old)
        Student[] arrayClassB = createForClassStudentsArray(applicants, 15, 16);
        System.out.println("Array classB: " + Arrays.toString(arrayClassB));

        ClassRoom classA = new ClassRoom("A", 12, arrayClassA);
        ClassRoom classB = new ClassRoom("B", 15, arrayClassB);

        /*show all applicants which undistributed to classes*/
        printApplicants();

        classA.showHowManyStudents();
        classB.showHowManyStudents();

        classA.showNameAndAge();
        classB.showNameAndAge();

        classA.showName();

        classA.sortByName();
        classB.sortByName2();

        classA.sortByNameReverse();
        classB.sortByNameReverse2();

        classA.sortByAge();
        classB.sortByAge2();

        classA.sortByAgeReverse();
        classB.sortByAgeReverse2();

        classA.findStudentByName("Anton");
        classA.findStudentByName("Nazar");

        ClassRoom[] allClasses = {classA, classB};
        showAllStudentsByTheName(allClasses, "Katya");
    }

    //  Необходимо создать 40 студентов, у каждого из которых должны быть указаны имя и возраст
    // (произвольный в диапазоне от 7 до 16 лет, randomNum = ThreadLocalRandom.current().nextInt(min, max + 1).
    public static Student[] createAllStudentsArray(int size) {
        Student[] studentsArray = new Student[size];

        for (int i = 0; i < size; i++) {
            studentsArray[i] = new Student();
        }
        return studentsArray;
    }

    /*
    В класс А записать (добавить студентов) возрастом от 7 до 12 лет, остальных в класс Б.
    При чем, каждый класс имеет макс кол-во студентов. Для А -12, для Б -15.
    */
    public static Student[] createForClassStudentsArray(Student[] allStudents, int maxStudents, int maxAge) {
        int rightAge = 0;
        int sizeForApplicants;
//        array with students which were put in this class
        Student[] studentsArray = new Student[maxStudents];

//        count students with correct age;
        for (Student student : allStudents) {
            if (student.getAge() <= maxAge) {
                rightAge++;
            }
        }
        /*
        check how many students should go to other classes
        a) if students with correct age more than places in this class,
        we should take only maxSize students to this class
        and the rest will be sent to the static array with undistributed students(applicants)
        */
        if (rightAge > maxStudents) {
            sizeForApplicants = allStudents.length - maxStudents;
        }
        /*
        b) if places more than students with correct age,
        we should send all the rest students to the static array with undistributed students(applicants)
        */
        else {
            sizeForApplicants = allStudents.length - rightAge;
        }

//      set size for the static array with undistributed students(applicants)
        applicants = new Student[sizeForApplicants];
        /*
         * fill the studentsArray of the class by students with right age while it has free space
         * the rest of students go to static array with undistributed by classes students (applicants)
         * */
        for (int i = 0, j = 0, k = 0; i < allStudents.length; i++) {
            if (j < studentsArray.length) {
                if (allStudents[i].getAge() <= maxAge) {
                    studentsArray[j] = allStudents[i];
                    j++;
                } else {
                    applicants[k] = allStudents[i];
                    k++;
                }
            } else {
                applicants[k] = allStudents[i];
                k++;
            }

        }
        return studentsArray;
    }


    /*После добавления мы должны видеть сколько студентов не смогло записаться в класс и какие именно.*/
    public static void printApplicants() {
        System.out.println(applicants.length + " applicants at the moment: ");
        for (Student applicant : applicants) {
            System.out.println(applicant);
        }
    }

//    метод который ищет и показывает в каких классах есть студент с таким именем если их несколько.
//    возможно нужно будет добавить дополнительное поле в один из классов)
    public static void showAllStudentsByTheName(ClassRoom[] classes, String name){
        System.out.println("\nShow all students with name " + name + " in the school");

        for (ClassRoom c: classes) {
            for (Student s: c.getStudArr()) {
                if(s.getName().equals(name)){
                    System.out.println(s.getName() + " (" + s.getAge() + " years) in the class " + c.getClassWord());
                }
            }
        }
    }
}


