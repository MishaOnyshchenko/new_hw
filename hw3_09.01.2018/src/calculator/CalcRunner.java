package calculator;

import java.util.Scanner;

/*Доработать калькулятор:
добавить возможность выйти из программы в любой момент
возможность считать дробные числа
добавить проверку и возможность работать с дробными числами
добавить возможность считать проценты, а также умножать, отнимать, делить и добавлять проценты*/

public class CalcRunner {

    public static void main(String[] args) throws Exception {
        start();
    }

    public static void start() throws Exception {
        Calculator c = new Calculator();
        System.out.println("Result: " + c.calc(c.getNumber(), c.getOperation()));
        repeat();
    }

    public static void repeat() throws Exception {
        System.out.print("\nDo you want to continue? Your answer(y/n): ");
        Scanner scn = new Scanner(System.in);
        char answer = scn.next().charAt(0);
        if (answer != 'n') {
            System.out.println();
            start();
        }
    }
}
