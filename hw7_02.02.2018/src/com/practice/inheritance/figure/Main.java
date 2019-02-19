package com.practice.inheritance.figure;

/*02.02.18
Создать класс фигура, которая содержит метод рисовать, и метод подсчета площади.
Основываясь на полученных знаниях, создать классы треугольник, квадрат, прямоугольник, круг.
В классе Main создать экземпляр каждого класса, и вывести для каждого, что он рисует, и его площадь.
*/

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle("triangle", 30, 40, 50);
        triangle.draw();
        triangle.area();

        Square square = new Square("square", 30);
        square.draw();
        square.area();

        Rectangle rectangle = new Rectangle("rectangle", 20,40);
        rectangle.draw();
        rectangle.area();

        Circle circle = new Circle("circle", 250);
        circle.draw();
        circle.area();
    }
}
