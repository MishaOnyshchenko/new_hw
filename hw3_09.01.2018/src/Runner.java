public class Runner {

    /*Напечатать таблицу умножения в обычном порядке и в реверсом варианте.
    Реализовать метод, который увеличивает переданное целое число на 10 процентов
    Нарисовать треугольник заполненный восьмерками*/

    public static void main(String[] args) {
        multiplicationTable();
        increaseToTenPercent(60);
        printTriangle();
    }

    /*Напечатать таблицу умножения в обычном порядке и в реверсном варианте.*/
    public static void multiplicationTable() {
        System.out.println();
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
        System.out.println("\n===============REVERSE=================\n");
        for (int i = 10; i > 0; i--) {
            for (int j = 10; j > 0; j--) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }

    /*Реализовать метод, который увеличивает переданное целое число на 10 процентов*/
    public static void increaseToTenPercent(int num) {
        System.out.println("\n" + num + " + 10% = " + (num + num * 10 / 100));
    }

    /*Нарисовать треугольник заполненный восьмерками*/
    public static void printTriangle() {
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
