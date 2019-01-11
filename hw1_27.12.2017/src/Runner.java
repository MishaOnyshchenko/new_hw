import java.util.Arrays;
import java.util.Random;

public class Runner {

    public static void main(String[] args) {
        checkIfEven(27);
        closerToTen(-11.5, 32.5);
        printWithLoops();
        multiplesOfFive();
        fillShortArray();
        sumFromMinToMax();
        stringToCharArray("\nThe\ngrass\nwas\ngreener");
    }

    /*Создать программу, проверяющую и сообщающую на экран,
    является ли целое число записанное в переменную n, чётным либо нечётным.*/
    public static void checkIfEven(int n) {
        boolean isEven = false;
        if (n % 2 == 0) {
            isEven = true;
        }
        System.out.println("Number " + n + " is even: " + isEven);
    }

    /*Создать программу, выводящую на экран ближайшее к 10 из двух чисел,
    записанных в переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.*/
    public static void closerToTen(double m, double n) {
        double result, closeToTenM, closeToTenN;
        closeToTenM = Math.abs(10 - m);
        closeToTenN = Math.abs(10 - n);

        if (closeToTenM < closeToTenN) {
            result = m;
        } else {
            result = n;
        }
        System.out.println("Closer to 10 (" + m + " or " + n + "): " + result);
    }

    /*Вывести на экран числа от -10 до 25 с помощью всех известных циклов.*/
    public static void printWithLoops() {

        System.out.println("While loop (from -10 to 25):");
        int w = -10;

        while (w <= 25) {
            System.out.println("w = " + w);
            w++;
        }


        System.out.println("\nDo-while loop (from -10 to 25):");
        int dw = -10;
        do {
            System.out.println("dw = " + dw);
            dw++;
        }
        while (dw <= 25);


        System.out.println("\nFor loop (from -10 to 25):");
        for (int i = -10; i <= 25; i++) {
            System.out.println("i = " + i);
        }
        System.out.println();
    }

    /*Вывести на экран все числа от 1 до 100, которые делятся на 5 без остатка.*/
    public static void multiplesOfFive() {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i + " multiple of 5");
            }
        }
    }

    /*Заполнить массив short типа числами от 100 до 0.*/
    public static void fillShortArray() {
        short[] arr = new short[101];
        for (short i = 100; i >= 0; i--) {
            arr[i] = i;
        }
        System.out.println("\nshort[] arr = " + Arrays.toString(arr));
    }

    /*Найти в массиве чисел элементы с наибольшим (max) и наименьшим (min) значениями.
    Вывести эти 2 элемента на экран, а также посчитать и вывести сумму всех остальных элементов
    (min и max в сумму не входят).*/
    public static void sumFromMinToMax() {
        //create and fill an array
        final int SIZE = 10;
        int[] randomArray = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            randomArray[i] = (int) (Math.random() * 50 + 5);
        }
        System.out.println("\nint[] randomArray = " + Arrays.toString(randomArray));
        //find min and max with foreach loop (without Arrays.sort())
        int min = randomArray[0];
        int max = randomArray[0];
        for (int i : randomArray) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        //sort an array and find sum except the first and the last elements
        Arrays.sort(randomArray);
        System.out.println("Sorted randomArray = " + Arrays.toString(randomArray));
        int sum = 0;
        for (int i = 1; i < SIZE - 1; i++) {
            sum += randomArray[i];
        }
        System.out.println("Sum of all elements (except min = " + min + " and max = " + max + ") = "  + sum);
    }

    /*Создать строку с произвольным словом или набором букв. Преобразовать в массив.
    Вывести массив каждую букву (символ).*/
    public static void stringToCharArray(String str) {
        System.out.println("\nString for transforming to char array: " + str);
        char[] arr = str.toCharArray();

        System.out.print("\nchar[] arr = ");
        for (char i : arr) {
            System.out.print("'" + i + "' ");
        }
    }
}
