package com.study.classes.firstHumans;
/*
Написать два класса Adam(Адам) и Eve(Ева).
Унаследовать Еву от Адама.
*/
public class Adam {

    private String name;
    private String gender;

    public Adam() {
        this.name = "Adam";
        this.gender = "male";
    }

    protected Adam(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
