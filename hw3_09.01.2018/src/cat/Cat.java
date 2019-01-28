package cat;

/*создать класс Cat.
Кот имеет свойства имя, вес, цвет, рост, длина
и зависящее от веса, роста и длины свойство - сила.
Класс Cat должен иметь параметры по умолчанию.*/
public class Cat {

    private String name;
    private String color;

    private double weightInKg;
    private double lengthInCm;
    private double heightInCm;

    private int power;

    public Cat() {
        name = "Tom";
        color = "black";

        weightInKg = 3.6;
        lengthInCm = 75;
        heightInCm = 35;

        setPower();
    }

    public Cat(String name, String color, double weightInKg, double lengthInCm, double heightInCm) {
        this.name = name;
        this.color = color;
        this.weightInKg = weightInKg;
        this.lengthInCm = lengthInCm;
        this.heightInCm = heightInCm;

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
