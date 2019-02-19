package com.study.classes.education;

public class Slave extends Worker {

    int price;

    public Slave(String name, int age) {
        super(name, age);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() +
                "{price=" + price + "}";
    }
}
