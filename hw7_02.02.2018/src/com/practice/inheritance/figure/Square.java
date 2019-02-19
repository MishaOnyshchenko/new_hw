package com.practice.inheritance.figure;

public class Square extends Figure {

    //length of side in mm
    int side;

    public Square(String figure, int side) {
        super(figure);
        this.side = side;
    }

    @Override
    public void area() {
        //area = a2
        double a = side * side;

        System.out.println("The area of the " + getFigure() + " is " + a + " mm2\n");
    }
}
