package com.practice.students;

/*
���������� ������� 40 ���������, � ������� �� ������� ������ ���� ������ �������
(������������ � ��������� �� 7 �� 16 ���, randomNum = ThreadLocalRandom.current().nextInt(min, max + 1) -��� � ������) � ���.

����� ���� ����� ������� ����� � � ����� �(��� ��� ����� ������� �� ��������� ������ ClassRoom).
� ����� � �������� (�������� ���������) ��������� �� 7 �� 12 ���, ��������� � ����� �.
��� ���, ������ ����� ����� ���� ���-�� ���������. ��� � -12, ��� � -15.
���������� ��� ���� ���� �� ������.
����� ���������� �� ������ ������ ������� ��������� �� ������ ���������� � ����� � ����� ������.
*/

/*����������� ������ ������������:
������� ������� ���� � ���������� ������
���� ��������� ������(�� ����� � �������)
���� ��������� ������(������ ���)
���� � ��������������� ������� �� ��������
�� �������� � ��������(������) �� ����� �����.

����� ������� ������� ����������� �������� �� ����� � ���������� ������
����� ������� ���� � ���������� � ����� ������� ���� ������� � ����� ������ ���� �� ���������.
(�������� ����� ����� �������� �������������� ���� � ���� �� �������)

* ��� ������� - ����� �� ������� ���������, ������� ����� ������� ����� ������     ������������ - ���������� �����. (edited)
* */
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

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
        System.out.println("Array classA: " + Arrays.toString(arrayClassA));

//        create an array of students for class B (max 15 students to 16 years old)
        Student[] arrayClassB = createForClassStudentsArray(applicants, 15, 16);
        System.out.println("Array classB: " + Arrays.toString(arrayClassB));

        ClassRoom classA = new ClassRoom("A", 12, arrayClassA);
        ClassRoom classB = new ClassRoom("B", 15, arrayClassB);

        /*show all applicants which undistributed to classes*/
        printApplicants();

        showHowManyStudents(classA);
        showHowManyStudents(classB);

        showNameAndAge(classA);
        showNameAndAge(classB);


    }

    /*
    � ����� � �������� (�������� ���������) ��������� �� 7 �� 12 ���, ��������� � ����� �.
    ��� ���, ������ ����� ����� ���� ���-�� ���������. ��� � -12, ��� � -15.
    */
    public static Student[] createForClassStudentsArray(Student[] allStudents, int maxStudents, int maxAge) {
        int rightAge = 0;
        int sizeForApplicants;

//        array wit students which we put in this class
        Student[] studentsArray = new Student[maxStudents];

        // count students with correct age;
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


    //  ���������� ������� 40 ���������, � ������� �� ������� ������ ���� ������� ��� � �������
    // (������������ � ��������� �� 7 �� 16 ���, randomNum = ThreadLocalRandom.current().nextInt(min, max + 1).
    public static Student[] createAllStudentsArray(int size) {
        Student[] studentsArray = new Student[size];

        for (int i = 0; i < size; i++) {
            String name = "Student" + (i + 1);
            int age = ThreadLocalRandom.current().nextInt(7, 17);
            Student student = new Student(name, age);
            studentsArray[i] = student;
        }
        return studentsArray;
    }

    /*����� ���������� �� ������ ������ ������� ��������� �� ������ ���������� � ����� � ����� ������.*/
    public static void printApplicants(){
        System.out.println(applicants.length + " applicants at the moment: ");

        for (Student applicant : applicants) {
            System.out.println(applicant);
        }
    }

//    ������� ������� ���� � ���������� ������
    public static void showHowManyStudents(ClassRoom classRoom){
        int howManyStudents = 0;
        for (Student student : classRoom.getStudArr()) {
            if(student != null){
                howManyStudents++;
            }
        }
        System.out.println(howManyStudents + " students in the class " + classRoom.getClassWord());
    }

    /*����������� ������ ������������:
    ���� ��������� ������(������ ���)
    ���� � ��������������� ������� �� ��������
    �� �������� � ��������(������) �� ����� �����.*/
    public static void showNameAndAge(ClassRoom classRoom){
        System.out.println("All students from class " + classRoom.getClassWord());
        for (Student student : classRoom.getStudArr()) {
            System.out.println(student.getName() + ", " + student.getAge());
        }
    }

        /*����������� ������ ������������:
    ���� ��������� ������(�� ����� � �������)
    ���� ��������� ������(������ ���)
    ���� � ��������������� ������� �� ��������
    �� �������� � ��������(������) �� ����� �����.*/


}


