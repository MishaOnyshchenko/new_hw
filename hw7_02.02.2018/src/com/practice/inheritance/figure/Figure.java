package com.practice.inheritance.figure;

/*02.02.18
Создать класс фигура, которая содержит метод рисовать, и метод подсчета площади.
Основываясь на полученных знаниях, создать классы треугольник, квадрат, прямоугольник, круг.
В классе Main создать экземпляр каждого класса, и вывести для каждого, что он рисует, и его площадь.
*/

public abstract class Figure {

    private String figure;

    public Figure(String figure) {
        this.figure = figure;
    }

    public String getFigure() {
        return figure;
    }

    public void draw(){
        System.out.println("I am drawing a " + figure);
    }

    public abstract void area();
}
