package cat;

/*создать класс Cat.
Кот имеет свойства имя, вес, цвет, рост, длина
и зависящее от веса, роста и длины свойство - сила.
Класс Cat должен иметь параметры по умолчанию.*/
public class CatRunner {
    public static void main(String[] args) {

        Cat cat = new Cat();

        System.out.println("Cat's power is " + cat.getPower());
    }
}
