package com.practice.students;

/*
Ќеобходимо создать 40 студентов, у каждого из которых должен быть указан возраст
(произвольный в диапазоне от 7 до 16 лет, randomNum = ThreadLocalRandom.current().nextInt(min, max + 1) -вам в помощь) и им€.

ѕосле чего нужно создать класс ј и класс Ѕ(это уже будут объекты на основании класса ClassRoom).
¬ класс ј записать (добавить студентов) возрастом от 7 до 12 лет, остальных в класс Ѕ.
ѕри чем, каждый класс имеет макс кол-во студентов. ƒл€ ј -12, дл€ Ѕ -15.
—обственно дл€ всех мест не хватит.
ѕосле добавлени€ мы должны видеть сколько студентов не смогло записатьс€ в класс и какие именно.
*/

/*
–еализовать методы показывающие:
сколько человек есть в конкретном классе
всех студентов класса(их имена и возраст)
всех студентов класса(только им€)
всех в отсортированном пор€дке по алфавиту
по возрасту и наоборот(реверс) по обоим пол€м.

метод который находит конкретного студента по имени в конкретном классе
метод который ищет и показывает в каких классах есть студент с таким именем если их несколько.
(возможно нужно будет добавить дополнительное поле в один из классов)

* доп задание - когда мы создаем студентов, создать метод который будет писать     произвольные - нормальные имена. (edited)
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


    }

    //  Ќеобходимо создать 40 студентов, у каждого из которых должны быть указаны им€ и возраст
    // (произвольный в диапазоне от 7 до 16 лет, randomNum = ThreadLocalRandom.current().nextInt(min, max + 1).
    public static Student[] createAllStudentsArray(int size) {
        Student[] studentsArray = new Student[size];

        for (int i = 0; i < size; i++) {
            studentsArray[i] = new Student();
        }
        return studentsArray;
    }

    /*
    ¬ класс ј записать (добавить студентов) возрастом от 7 до 12 лет, остальных в класс Ѕ.
    ѕри чем, каждый класс имеет макс кол-во студентов. ƒл€ ј -12, дл€ Ѕ -15.
    */
    public static Student[] createForClassStudentsArray(Student[] allStudents, int maxStudents, int maxAge) {
        int rightAge = 0;
        int sizeForApplicants;
//        array wit students which we put in this class
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
        and the rest will be send to static array with undistributed students(applicants)
        */
        if (rightAge > maxStudents) {
            sizeForApplicants = allStudents.length - maxStudents;
        }
        /*
        b) if places more than students with correct age,
        we should send all the rest students to static array with undistributed students(applicants)
        */
        else {
            sizeForApplicants = allStudents.length - rightAge;
        }

//      set size for static array with undistributed students(applicants)
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


    /*ѕосле добавлени€ мы должны видеть сколько студентов не смогло записатьс€ в класс и какие именно.*/
    public static void printApplicants() {
        System.out.println(applicants.length + " applicants at the moment: ");
        for (Student applicant : applicants) {
            System.out.println(applicant);
        }
    }
}


