package com.company;


import com.company.lesson8.Animal;
import com.company.lesson8.Cat;
import com.company.lesson8.Dog;
import com.company.lesson8.Duck;

public class Main {
    public static void main(String[] args) {


        Cat cat = new Cat();
        cat.voice();

        com.company.lesson6.Cat cat1 = new com.company.lesson6.Cat();
        cat1.voice();


        //lesson8

        Animal animal1 = new Animal();
        animal1.voice();

        Animal animal2 = new Animal("Eshka", 4);
        animal2.voice();



        // lesson 9  - Уровни методов в Java
        Dog dog = new Dog();
        for (int i = 0; i < 3; i++) {

            dog.goToStick(14);
            dog.whereIsDog();
        }

        // lesson 10 - Наследование
        Duck duck = new Duck();
        duck.voice();
        duck.takeOff();
        duck.isTheBirdFly();
        duck.landing();
        duck.isTheBirdFly();

    }
}
