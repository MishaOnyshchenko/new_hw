package com.study.classes.fraction;

/*
13 Создайте класс с именем fraction, содержащий два поля типа int - числитель и знаменатель обыкновенной дроби.
Конструктор класса должен инициализировать их заданным набором значений.
Создайте метод класса, который будет выводить дробь в текстовую строку в формате x / y;
метод, добавляющий (сложение) к текущей дроби дробь, переданную ему в параметре и возвращающий дробь - результат сложения;
*/

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void printFraction(){
        System.out.println(numerator + " / " + denominator);
    }

    public void addition(int n, int d){
        if(denominator == d){
            System.out.println((numerator + n) + " / " + denominator);
        }
        else{
            System.out.println((double)numerator/denominator + (double)n/d);
        }
    }

    public void multiplying(double n){
        System.out.println();

    }

    public static void main(String[] args) {
        Fraction fraction = new Fraction(4, 3);
        fraction.printFraction();
        fraction.addition(2,3);
        fraction.addition(2,6);
    }
}
