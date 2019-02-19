package com.study.classes.evolution;

public class Fish {

    private String name;
    private int age;
    private boolean canSwim;

    public Fish(String name, int age, boolean canSwim) {
        this.name = name;
        this.age = age;
        this.canSwim = canSwim;
    }

    public void checkCanSwim(){
        if(canSwim){
            System.out.println("Sure I am swimming");
        }
        else{
            System.out.println("No, I can't swim");
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{name='" + name + '\'' +
                ", age=" + age +
                ", canSwim=" + canSwim +
                '}';
    }
}
