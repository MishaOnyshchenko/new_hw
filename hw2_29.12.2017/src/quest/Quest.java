package quest;

import java.util.Random;
import java.util.Scanner;

public class Quest {

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        System.out.print("\nНаступили выходные и вы захотели провести их за пределами своего города. \n" +
                "\nКуда желаете отправиться?\n" +
                "\n1. Петриковка\n" +
                "2. Кицмань\n" +
                "3. Тернополь\n" +
                "\nВведите порядковый номер города: ");
        Scanner scn = new Scanner(System.in);
        int answer = scn.nextInt();
        //starting next method which checking an answer
        chooseTheDestination(answer);
    }

    public static void chooseTheDestination(int answer) {
        switch (answer) {
            case 1:
                System.out.println("\nВы решили поехать на фестиваль петриковской росписи.");
                break;
            case 2:
                System.out.println("\nВы захотели отправиться за западным колоритом в Кицмань.");
                break;
            case 3:
                System.out.println("\nВас посетило странное желание побывать в Тенополе.");
                break;
            default:
                System.out.println("\nПохоже, что вы издеваетесь... т.к. данный вариант отсутствует, " +
                        "то вас отправили посетить \"файне мiсто Тернопiль\".");
                break;
        }
        //starting method with next round
        nextRound();
    }

    public static void nextRound() {
        System.out.print("\nВ электричке вы встречаете компанию приятных молодых людей, которые предлагают вам:\n" +
                "1. Выпить\n" +
                "2. Сыграть в напёрстки\n" +
                "\nВаш выбор(введите цифру): ");
        Scanner scn = new Scanner(System.in);
        int answer = scn.nextInt();
        //starting method which checking an answer
        choseTheRest(answer);
    }

    public static void choseTheRest(int answer) {
        switch (answer) {
            case 1: // finishing the game
                System.out.println("\nВы очнулись в больнице с отравлением клофелином и вынуждены " +
                        "провести остаток выходных на больничной койке...\n" + "Продолжение следует...");
                break;
            case 2: // starting game with cups
                System.out.println("\nВы принимаете заманчивое предложение сыграть в напёрстки.");
                playCups();
                break;
            default: // finishing the game
                System.out.println("\nРебята не поняли вашего юмора и на ближайшей станции вас забрали " +
                        "на скорой помощи с переломами нижних конечностей.\n" + "Продолжение следует...");
                break;
        }
    }

    // play in cups and finish the quest
    public static void playCups() {
        //put the ball under one of 3 cups and show it to player
        Random rnd = new Random(System.currentTimeMillis());
        int limit = 3;//how many cups
        int cup = 1 + rnd.nextInt(limit);

        //mix cups and randomly put the ball under one of them
        System.out.println("Катала кладёт шарик под напёрсток № " + cup + " и начинает их вращать между собой.");
        Random rnd2 = new Random(System.currentTimeMillis());
        int newCup = 1 + rnd2.nextInt(limit);
        //System.out.println("New: " + newCup);

        System.out.print("\nИтак! Есть 3 напёрстка:\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "\nУкажите номер напёрстка под которым сейчас находится шарик: ");
        Scanner scn = new Scanner(System.in);
        int choice = scn.nextInt();
        scn.close();
        //check the answer
        if (newCup == choice) {
            System.out.println("\nПримите наши поздравления! Вы выиграли и благополучно достигли пункта назначения. The end.\n");
        } else {
            System.out.println("\nПростите, но вы ошиблись и лишились всех денег. The end.\n");
        }
    }
}
