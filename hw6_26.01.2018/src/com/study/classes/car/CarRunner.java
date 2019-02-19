package com.study.classes.car;

public class CarRunner {
    public static void main(String[] args) {

        Car car = new Car("Ferrari", 1500, 800);
        System.out.println(car);

        Lorry truck = new Lorry("Man", 12000, 440);
        truck.setCapacity(10);
        System.out.println(truck);

        truck.setModel("IVECO");
        truck.setCapacity(20);
        System.out.println(truck);



    }
}
