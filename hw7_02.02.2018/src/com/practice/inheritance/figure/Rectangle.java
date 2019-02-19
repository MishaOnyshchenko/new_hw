package com.practice.inheritance.figure;

public class Rectangle extends Figure{

    //length of side in mm
    int width;
    int height;

    public Rectangle(String figure, int width, int height) {
        super(figure);
        this.width = width;
        this.height = height;
    }

    @Override
    public void area() {
        //area = w × h
        double a = width * height;

        System.out.println("The area of the " + getFigure() + " is " + a + " mm2\n");
    }
}
