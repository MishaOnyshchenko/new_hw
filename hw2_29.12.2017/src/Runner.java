public class Runner {

    /*- вывести строку str, но заменить все буквы В на :-)
    -  вывести каждый четный символ
    - вывести кол-во повторов слова альбом из следующего текста:

Был и я среди донцов...
Была пора: наш праздник молодой...
В альбом (Гонимый рока самовластьем...)
В альбом (Долго сих листов заветных...)
В альбом А. О. Смирновой
В альбом княжны А. Д. Абамалек
В альбом Павлу Вяземскому
В еврейской хижине лампада...
В крови горит огонь желанья...
В мои осенние досуги...
В начале жизни школу помню я...
В поле чистом серебрится Снег...*/
    public static void main(String[] args) {

        String text = "Был и я среди донцов...\n" +
                "Была пора: наш праздник молодой...\n" +
                "В альбом (Гонимый рока самовластьем...)\n" +
                "В альбом (Долго сих листов заветных...)\n" +
                "В альбом А. О. Смирновой\n" +
                "В альбом княжны А. Д. Абамалек\n" +
                "В альбом Павлу Вяземскому\n" +
                "В еврейской хижине лампада...\n" +
                "В крови горит огонь желанья...\n" +
                "В мои осенние досуги...\n" +
                "В начале жизни школу помню я...\n" +
                "В поле чистом серебрится Снег...";

        //replaceToSmile(text);
        //printEvenChar(text);
        countRepeats(text);

    }

    /*- вывести строку str, но заменить все буквы В на :-)*/
    public static void replaceToSmile(String str) {
        System.out.println(str.replace("В", ":-)"));
    }

    /*- вывести каждый четный символ*/
    public static void printEvenChar(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0) {
                System.out.print("\'" + arr[i] + "\' ");
            }
        }
    }

    /*- вывести кол-во повторов слова альбом из следующего текста:*/
    public static void countRepeats(String str) {
        //create variable for counting albums
        int cnt = 0;

        //create foreach loop to separate each word by str.split(" ") method
        // and count each album by equals("album") method
        for (String s : str.split(" ")) {
            if (s.equals("альбом")) {
                cnt++;
            }
        }
        System.out.println("Album indicated " + cnt + " times");
    }
}
