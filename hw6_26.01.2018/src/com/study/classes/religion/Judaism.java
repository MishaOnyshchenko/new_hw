package com.study.classes.religion;

public class Judaism {

    private String name;
    private String hollyScripture;

    public Judaism(String name, String hollyScripture) {
        this.name = name;
        this.hollyScripture = hollyScripture;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{name='" + name + '\'' +
                ", hollyScripture='" + hollyScripture + '\'' +
                '}';
    }
}
