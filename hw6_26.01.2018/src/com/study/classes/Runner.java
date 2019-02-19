package com.study.classes;

import com.study.classes.education.Slave;
import com.study.classes.evolution.Animal;
import com.study.classes.evolution.Ape;
import com.study.classes.evolution.Fish;
import com.study.classes.evolution.Human;
import com.study.classes.firstHumans.Adam;
import com.study.classes.firstHumans.Eva;
import com.study.classes.mobile.AppleIPhone;
import com.study.classes.mobile.SamsungGalaxyS2;
import com.study.classes.religion.Christianity;
import com.study.classes.religion.Islam;
import com.study.classes.religion.Judaism;


public class Runner {

    public static void main(String[] args) {

        /*1 Написать два класса Adam(Адам) и Eve(Ева).
        Унаследовать Еву от Адама.*/
        Adam adam = new Adam();
        Eva eva = new Eva();
        System.out.println(adam.toString());
        System.out.println(eva.toString());
        eva.eatApple();

        /*2 Написать два класса AppleIPhone и SamsungGalaxyS2.
        Унаследовать SamsungGalaxyS2 от AppleIPhone.*/
        AppleIPhone iPhone = new AppleIPhone();
        SamsungGalaxyS2 galaxyS2 = new SamsungGalaxyS2();
        System.out.println(iPhone.toString());
        System.out.println(galaxyS2.toString());

        /*3 Написать четыре класса: Fish(Рыбы), Animal(Животные), Ape(Обезьяны), Human (Человек).
        Унаследовать животных от рыб, обезьян от животных и человека от обезьян.*/
        Fish salmon = new Fish("Goldy", 4, true);
        System.out.println(salmon.toString());
        salmon.checkCanSwim();

        Animal sloan = new Animal("Bamby", 20, true, 4,true);
        System.out.println(sloan.toString());
        sloan.checkCanRun();
        sloan.checkCanSwim();

        Ape gibbon = new Ape("Garry", 17, true, true);
        System.out.println(gibbon.toString());
        gibbon.checkCanRun();
        gibbon.checkCanSwim();
        gibbon.takeAStick();

        Human man = new Human("Adam", 23, true, true);
        System.out.println(man.toString());
        man.message();

        /*4 Написать три класса: Judaism(Иудаизм), Christianity(Христианство), Islam(Мусульманство).
        Унаследовать христианство от иудаизма и мусульманство от христианства.*/
        Judaism judaism = new Judaism("Judaism", "Tanah");
        System.out.println(judaism);

        Christianity christianity = new Christianity("Christianity", "the Bable");
        System.out.println(christianity);

        Islam islam = new Islam("Islam", "Coran");
        System.out.println(islam);

        /*5 Написать четыре класса: Schoolboy(школьник), Student(студент), Worker(Сотрудник), Slave(Раб).
        Унаследовать студента от школьника, сотрудника от студента, раба от сотрудника.*/
        Slave slave = new Slave("Average Joe", 34);
        slave.setGrade(12);
        slave.setMajor("builder");
        slave.setProfession("roofer");
        slave.setPrice(2000);
        System.out.println(slave.toString());
    }
}
