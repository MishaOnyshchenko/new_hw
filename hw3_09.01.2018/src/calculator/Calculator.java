package calculator;

import java.util.Scanner;

/*Доработать калькулятор :
добавить возможность выйти из программы в любой момент;
добавить возможность считать дробные числа;
добавить проверку на возможность работать с дробными числами;
добавить возможность счить проценты, а также умножать, отнимать, делить и добавлять проценты*/

public class Calculator {

    private double number;
    private char operation;
    private double result;

    public double getNumber() throws Exception {
        System.out.print("Enter a number: ");
        try {
            Scanner scn = new Scanner(System.in);
            number = scn.nextDouble();
        } catch (Exception exc) {
            System.out.println("Incorrect input for double. Please type it one more time with ',' instead of '.'");
            getNumber();
        }
        return number;
    }

    public char getOperation() {
        System.out.print("Enter an operation (+, -, *, /, %, =): ");
        Scanner scn = new Scanner(System.in);
        return operation = scn.next().charAt(0);
    }

    public double calc(double num, char operation) throws Exception {
        boolean flag = true;
        switch (operation) {
            case '+':
                result = num + getNumber();
                break;
            case '-':
                result = num - getNumber();
                break;
            case '*':
                result = num * getNumber();
                break;
            case '/':
                result = num / getNumber();
                break;
            case '%':
                result = num * getNumber()/100;
                break;
            case '=':
                flag = false;
                break;
            default:
                System.out.println("Incorrect operation.");
                calc(num, getOperation());
                flag = false;
        }
        if(flag){
            calc(result, getOperation());
        }
        return result;
    }
}


