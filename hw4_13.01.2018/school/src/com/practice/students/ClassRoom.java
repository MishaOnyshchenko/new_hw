package com.practice.students;

//������� ����� ClassRoom � ������  String classWord; int classLimit; Student[] studArr;

/*����������� ������ ������������:
������� ������� ���� � ���������� ������
���� ��������� ������(�� ����� � �������)
���� ��������� ������(������ ���)
���� � ��������������� ������� �� ��������
�� �������� � ��������(������) �� ����� �����.*/


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
