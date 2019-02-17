package com.study.robot;

public class Robot {

    private Head head;
    private Arms arms;
    private Legs legs;
    private Body body;

    private String message;

    public Robot(Head head, Arms arms, Legs legs, Body body) {
        this.head = head;
        this.arms = arms;
        this.legs = legs;
        this.body = body;
        this.message = getClass().getSimpleName() + " is ready!";
    }

    public Robot(Arms arms, Legs legs, Body body) {
        this.head = new Head("I don't have a had so I can't speak.");
        this.arms = arms;
        this.legs = legs;
        this.body = body;
        this.message = getClass().getSimpleName() + " is not completed!";
    }

    public Robot(Head head, Legs legs, Body body) {
        this.head = head;
        this.arms = new Arms("I don't have arms so I can't write.");
        this.legs = legs;
        this.body = body;
        this.message = getClass().getSimpleName() + " is not completed!";
    }

    public Robot(Head head, Arms arms, Body body) {
        this.head = head;
        this.arms = arms;
        this.legs = new Legs("I don't have legs so I can't walk.");
        this.body = body;
        this.message = getClass().getSimpleName() + " is not completed!";
    }

    public void printDescription(){
        System.out.println(message);
        System.out.println(head.getDescription());
        System.out.println(arms.getDescription());
        System.out.println(legs.getDescription());
        System.out.println(body.getDescription());
    }
}
