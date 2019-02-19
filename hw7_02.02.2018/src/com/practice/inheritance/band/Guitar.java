package com.practice.inheritance.band;

public class Guitar extends Instrument {
    @Override
    public void sound() {
        System.out.println("The Guitar is playing");
    }
}
