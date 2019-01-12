package more_than_five;

/*Напишите метод, который бы возвращал в консоль:
-true, если число больше 5
-и false, если число меньше 5*/
public class MoreThanFiveRunner {

    public static void main(String[] args) {
        double number = 4.99;
        System.out.println("Your number " + number + " is more than 5: " + checkIfMoreThanFive(number));
    }

    public static boolean checkIfMoreThanFive(double num) {
        return num > 5;
    }
}
