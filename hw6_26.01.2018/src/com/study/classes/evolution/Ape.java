package com.study.classes.evolution;

public class Ape extends Animal {

    private int arms;

    public Ape(String name, int age, boolean canSwim, boolean canRun) {
        super(name, age, canSwim, 2, canRun);
        this.arms = 2;
    }

    public void takeAStick() {
        System.out.println("I have arms and I can take a stick.");
    }

    @Override
    public String toString() {
        return super.toString() +
                "{arms=" + arms +
                "}";
    }
}
