package com.study.classes.car;

/*11 Создать базовый класс Саг, характеризуемый торговой маркой (строка), весом,? мощностью.
Определить методы переназначения и изменения мощности.
Создать производный класс Lorry (грузовик), характеризуемый также грузоподъемностью кузова.
Определить для него функции переназначения марки и изменения грузоподъемности.*/

public class Car {

    private String model;
    private int weight;
    private int power;

    public Car(String model, int weight, int power) {
        this.model = model;
        this.weight = weight;
        this.power = power;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", weight=" + weight +
                ", power=" + power +
                '}';
    }
}
