public class Runner {
    /*

4.Вывести на экран числа от -10 до 25 с помощью всех известных циклов.

5.Вывести на экран все числа от 1 до 100, которые делятся на 5 без остатка.

6.Заполнить массив short типа числами от 100 до 0.

7.Найти в массиве чисел элементы с наибольшим(max) и наименьшим(min) значениями. Вывести эти 2 элемента на экран, а также посчитать и вывести сумму всех остальных элементов (min и max в сумму не входят).

8. Создать строку с произвольным словом или набором букв. Преобразовать в массив. Вывести массив каждую букву(символ).
*/
    public static void main(String[] args) {
        //checkIfEven(223);
        closerToTen(-11.5, 12.5);
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
}
