package cat;

/*создать класс Cat.
Кот имеет свойства имя, вес, цвет, рост, длина
и зависящее от веса, роста и длины свойство - сила.
Класс Cat должен иметь параметры по умолчанию.*/
public class Cat {

    private String name = "Tom";
    private String color = "black";

    private double weightInKg = 3.6;
    private double lengthInCm = 75;
    private double heightInCm = 35;

    private int power;

    public Cat() {
        setPower();
    }

    public void setPower() {
        if((weightInKg > 2.5) && (lengthInCm > 60) && (heightInCm > 25)){
            this.power = 2;
        }
        else{
            this.power = 1;
        }
    }

    public int getPower() {
        return power;
    }
}
