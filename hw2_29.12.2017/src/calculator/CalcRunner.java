package calculator;

/*-Метод int getInt() - должен считывать с консоли целое число и возвращать его
-Метод char getOperation() - должен считывать с консоли какое-то значение и возвращать символ с операцией (+, -, * или /)
-Метод int calc(int num1, int num2, char operation) - должен выполнять над числами num1 и num2 арифметическую операцию, заданную operation.
-Метод main() - должен считывать 2 числа (с помощью getInt()), считать операцию (с помощью getOperation()),
передать все методу calc() и вывести на экран результат.
-Организовать ввод чисел из консоли с помощью сканера
калькулятор тоже запаковать в самозапускающийся джарник. */
public class CalcRunner {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Result: " + c.calc(c.getInt(), c.getInt(), c.getOperation()));
    }
}
