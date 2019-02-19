package com.study.classes.evolution;

public class Animal extends Fish{

    private int feet;
    private boolean canRun;

    public Animal(String name, int age, boolean canSwim, int feet, boolean canRun) {
        super(name, age, canSwim);
        this.feet = feet;
        this.canRun = canRun;
    }

    public void checkCanRun(){
        if(canRun){
            System.out.println("Yes, I can run");
        }
        else{
            System.out.println("No, I can't run");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "{feet=" + feet +
                ", canRun=" + canRun +
                "}";
    }
}
