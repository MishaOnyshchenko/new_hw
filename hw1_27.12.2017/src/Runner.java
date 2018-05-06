import java.util.Arrays;
import java.util.Random;

public class Runner {

    public static void main(String[] args) {
        checkIfEven(223);
        closerToTen(-11.5, 12.5);
        printWithLoops();
        multiplyToFive();
        fillArray();
        sumFromMinToMax();
        stringToCharArray("The\ngrass\nwas\ngreener");
    }

    /*Создать программу, проверяющую и сообщающую на экран,
    является ли целое число записанное в переменную n, чётным либо нечётным.*/
    public static void checkIfEven(int n){
        boolean isEven = false;
        if(n%2 == 0){
            isEven = true;
        }
        System.out.println("Number " + n + " is even: " + isEven);
    }

    /*Создать программу, выводящую на экран ближайшее к 10 из двух чисел,
    записанных в переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.*/
    public static void closerToTen(double m, double n){
        double result, closeToTenM, closeToTenN;
        closeToTenM = 10 - m;
        closeToTenN = 10 - n;

        if(Math.abs(closeToTenM) < Math.abs(closeToTenN)){
            result = m;
        }
        else {
            result = n;
        }
        System.out.println("Closer to 10: " + result);
    }

    /*Вывести на экран числа от -10 до 25 с помощью всех известных циклов.*/
    public static void printWithLoops(){

        System.out.println("while loop");
        int w = -10;
        while(w < 26){
            System.out.println("w = " + w);
            w++;
        }

        System.out.println("\ndo-while loop");
        int dw = -10;
        do{
            System.out.println("dw = " + dw);
            dw++;
        }
        while(dw < 26);

        System.out.println("\nfor loop");
        for(int i = -10; i < 26; i++){
            System.out.println("i = " + i);
        }
    }

    /*Вывести на экран все числа от 1 до 100, которые делятся на 5 без остатка.*/
    public static void multiplyToFive(){
        for(int i = 1; i < 101; i++){
            if(i%5 == 0){
                System.out.println("i = " + i);
            }
        }
    }

    /*Заполнить массив short типа числами от 100 до 0.*/
    public static void fillArray(){
        short[] arr = new short[101];
        for(short i = 0; i < 101; i++){
            arr[i] = i;
        }
        System.out.println("arr = " + Arrays.toString(arr));
    }

    /*Найти в массиве чисел элементы с наибольшим(max) и наименьшим(min) значениями.
    Вывести эти 2 элемента на экран, а также посчитать и вывести сумму всех остальных элементов
    (min и max в сумму не входят).*/
    public static void sumFromMinToMax(){
        //create and fill array
        final int SIZE = 10;
        int[] arr = new int [SIZE];
        for (int i = 0; i < SIZE; i++){
            arr[i] = (int)(Math.random() * 50 + 5);
        }
        System.out.println("arr = " + Arrays.toString(arr));
        //find min and max with foreach loop (without Arrays.sort())
        int min = arr[0];
        int max = arr[0];
        for (int i: arr) {
            if (i < min){
                min = i;
            }
            if(i > max){
                max = i;
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        //sort array and find sum except first and last elements
        Arrays.sort(arr);
        System.out.println("sorted arr = " + Arrays.toString(arr));
        int sum = 0;
        for (int i = 1; i < SIZE - 1; i++){
            sum += arr[i];
        }
        System.out.println("sum = " + sum);
    }

    /*Создать строку с произвольным словом или набором букв. Преобразовать в массив.
    Вывести массив каждую букву(символ).*/
    public static void stringToCharArray(String str){
        System.out.println(str);
        char [] arr = str.toCharArray();
        for (char w: arr) {
            System.out.println(w);
        }
    }
}
