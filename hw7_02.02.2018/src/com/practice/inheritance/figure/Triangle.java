package com.practice.inheritance.figure;

public class Triangle extends Figure {

    //length of side in mm
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(String figure, int sideA, int sideB, int sideC) {
        super(figure);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    /*
    1) S = (a + b + c) / 2
    2) A = √s(s - a)(s - b)(s - c)
    */
    @Override
    public void area() {
        //Calculate "s" (half of the triangles perimeter):
        int s = (sideA + sideB + sideC) / 2;

        //Then calculate the Area:
        double a = Math.sqrt(s *(s - sideA)*(s - sideB)*( s - sideC));

        System.out.println("The area of the " + getFigure() + " is " + a + " mm2\n");
    }
}
