package com.study.classes.car;

public class Lorry extends Car{

    private int capacity;


    public Lorry(String model, int weight, int power) {
        super(model, weight, power);
    }

    public void setModel(String model){
       super.setModel(model);
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "capacity=" + capacity +
                "} " + super.toString();
    }
}
