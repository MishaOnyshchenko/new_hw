package com.study.classes.complexNumbers;

import java.util.Arrays;

/*12 Составить описание класса для представления комплексных чисел
с возможностью задания вещественной и мнимой частей как числами типов double, так и целыми числами.
Обеспечить выполнение операций сложения, вычитания и умножения комплексных чисел.*/
public class ComplexRunner {
    public static void main(String[] args) {

        ComplexNumber complexNumber = new ComplexNumber(-3, 5);
        complexNumber.printComplexNumber();

        ComplexNumber complexNumber1 = new ComplexNumber(2, 3);
        complexNumber1.printComplexNumber();

        ComplexNumber complexNumber2 = new ComplexNumber(4, 6);
        complexNumber2.printComplexNumber();

        ComplexNumber complexNumber3 = new ComplexNumber(0, 6);
        complexNumber3.printComplexNumber();

        ComplexNumber.addition(complexNumber1, complexNumber2);

        ComplexNumber.subtraction(complexNumber1, complexNumber2);

        ComplexNumber.multiplication(complexNumber1, complexNumber2);

        ComplexNumber complexNumber9 = new ComplexNumber(33.02, 55.06);
        complexNumber9.printComplexNumber();

        String[] strings = new String[3];
        strings[0] = complexNumber1.toString();
        strings[1] = complexNumber2.toString();
        strings[2] = complexNumber3.toString();

        System.out.println(strings[1]);

    }
}
