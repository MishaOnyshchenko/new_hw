package com.study.classes.complexNumbers;


import java.util.Objects;

/*12 Составить описание класса для представления комплексных чисел
с возможностью задания вещественной и мнимой частей как числами типов double, так и целыми числами.
Обеспечить выполнение операций сложения, вычитания и умножения комплексных чисел.*/
public class ComplexNumber {

    /*For the complex number a + bi,
    a is called the real part,
    and b is called the imaginary part.*/

    private double realPart;
    private double imaginaryPart;
    private static final char I = 'i';

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber(int realPart, int imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }


    public void printComplexNumber(){
            System.out.println("z = " + realPart + " + " + imaginaryPart + I);
    }

    //(a+bi) + (c+di) = (a+c) + (b+d)i
    public static void addition(ComplexNumber a, ComplexNumber b){
        System.out.println("z = " + (a.realPart + b.realPart) + " + " + (a.imaginaryPart + b.imaginaryPart) + I);
    }

    //(a+bi) + (c+di) = (a-c) + (b-d)i
    public static void subtraction(ComplexNumber a, ComplexNumber b){
        System.out.println("z = " + (a.realPart - b.realPart) + " + " + (a.imaginaryPart - b.imaginaryPart) + I);
    }

    //(a+bi)(c+di) = ac + adi + bci + bdi2
    public static void multiplication(ComplexNumber a, ComplexNumber b){
        System.out.println("z = " + (a.realPart * b.realPart) + " + " + (a.realPart * b.imaginaryPart) + " + " +(a.imaginaryPart * b.realPart) + " + " + (a.imaginaryPart * b.imaginaryPart) + I);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return Double.compare(that.realPart, realPart) == 0 &&
                Double.compare(that.imaginaryPart, imaginaryPart) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(realPart, imaginaryPart);
    }

    @Override
    public String toString() {
        return "ComplexNumber{" +
                "realPart=" + realPart +
                ", imaginaryPart=" + imaginaryPart +
                '}';
    }
}
