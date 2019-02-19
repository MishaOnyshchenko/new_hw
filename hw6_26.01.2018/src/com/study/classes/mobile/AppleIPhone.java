package com.study.classes.mobile;

public class AppleIPhone {

    private String name;
    private double price;

    public AppleIPhone() {
        this.name = "AppleIPhone";
        this.price = 424;
    }

    protected AppleIPhone(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
