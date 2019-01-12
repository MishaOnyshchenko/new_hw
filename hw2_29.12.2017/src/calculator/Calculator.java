package calculator;

import java.util.Scanner;

public class Calculator {

    private int number;
    private char operation;
    private int result;

    /*Метод int getInt() - должен считывать с консоли целое число и возвращать его*/
    public int getInt() {
        System.out.print("Enter a number: ");
        Scanner scn = new Scanner(System.in);
        number = scn.nextInt();
        scn.close();
        return number;
    }

    /*-Метод char getOperation() - должен считывать с консоли какое-то значение
    и возвращать символ с операцией (+, -, * или /)*/
    public char getOperation() {
        System.out.print("Enter an operation (+, -, *, /): ");
        Scanner scn = new Scanner(System.in);
        operation = scn.next().charAt(0);
        scn.close();
        return operation;
    }

    /*-Метод int calc(int num1, int num2, char operation) - должен выполнять над числами num1 и num2
    арифметическую операцию, заданную operation.*/
    public int calc(int num1, int num2, char operation) {
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Incorrect operation");
                break;
        }
        return result;
    }
}
