package com.practice.inheritance.figure;

public class Circle extends Figure{

    //radius in mm
    int r;

    public Circle(String figure, int r) {
        super(figure);
        this.r = r;
    }

    @Override
    public void area() {
        //Area = π × r2
        double a = Math.PI * Math.pow(r, 2);

        System.out.println("The area of the " + getFigure() + " is " + a + " mm2\n");
    }
}
