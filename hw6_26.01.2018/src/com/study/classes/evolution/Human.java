package com.study.classes.evolution;

public class Human extends Ape{

    private boolean makeStuff;

    public Human(String name, int age, boolean canSwim, boolean canRun) {
        super(name, age, canSwim, canRun);
        makeStuff = true;
    }

    public void message() {
        System.out.println("I can think so I can make stuff!");
    }

    @Override
    public String toString() {
        return super.toString() +
                "{makeStuff=" + makeStuff +
                "}";
    }
}
