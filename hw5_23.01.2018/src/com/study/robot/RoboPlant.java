package com.study.robot;

/*
Необходимо собрать робота по частям (голова, руки, ноги, туловище) - это будут ваши объекты,
которые в свою очередь должны быть полями робота.

Голова, должна уметь говорить, руки писать, ноги ходить.

Если я собрал робота верно - голова, 2 руки, 2 ноги - должен увидеть сообщение:
робот готов, я умею говорить,я умею ходить,я умею писать.

Если робот собран не полностью, должно выводится сообщение: требуется доработка.
- если есть только одна нога - выводится сообщение: могу только прыгать на одной ноге.
- если есть только одна рука - выводится сообщение: могу писать только одной рукой.
- если нет головы - выводится сообщение: не могу говорить.
*/

public class RoboPlant {
    public static void main(String[] args) {

        Head head = new Head();
        Arms arms = new Arms();
        Legs legs = new Legs();
        Body body = new Body();

        Robot robot = new Robot(head, arms, legs, body);
        robot.printDescription();

        Robot noHead = new Robot(arms, legs, body);
        noHead.printDescription();

        Robot noArms = new Robot(head, legs, body);
        noArms.printDescription();

        Robot noLegs = new Robot(head, arms, body);
        noLegs.printDescription();
    }
}
