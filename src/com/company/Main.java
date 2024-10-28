package com.company;


import com.company.lesson15.SwitchExample;
import com.company.lesson8.Animal;
import com.company.lesson8.Cat;
import com.company.lesson8.Dog;
import com.company.lesson8.Duck;

import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Cat cat = new Cat("Eshka", 4);
        cat.voice();



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
            dog.voice();
        }

        // lesson 10 - Наследование
        Duck duck = new Duck();
        duck.voice();
        duck.takeOff();
        duck.showSpeed();
        duck.isTheBirdFly();
        duck.landing();
        duck.isTheBirdFly();
        duck.showSpeed();


        // lesson 13 - массивы
        List<Dog> dogs = Arrays.asList(
                new Dog("Bob", 5),
                new Dog("Bib", 3),
                new Dog("Bub", 2));
        List<Dog> homelessDogs = Dog.randomArray();
        for (Dog sobaka : homelessDogs) {
            System.out.println(sobaka);
        }
        System.out.println(dogs.size());
        System.out.println(dogs.getFirst());
        System.out.println(dogs.getLast());
        System.out.println(dogs.get(1));

        Class<Dog> info = Dog.class;
        System.out.println(info.componentType());


        List<Dog> dogsLinkedList = new LinkedList<>();
        dogsLinkedList.add(Dog.of("Bob", 5));
        dogsLinkedList.add(Dog.of("Bob", 5));
        dogsLinkedList.add(Dog.of("Bob", 5));

        int indexLinkedList = 0;
        while (indexLinkedList < dogsLinkedList.size()) {
            System.out.println(dogsLinkedList.get(indexLinkedList));
            indexLinkedList++;
        }

        // Lesson 16 - Switch
        System.out.println("Lesson 16");
        for (int i = 0; i < 100; i++) {
            SwitchExample.run();
        }

        // Lesson 17 - Уровни доступа

        Animal animalExample = new Animal();
        animalExample.voice();

        //Lesson 18 - equals() and hashCode()
        Animal animal11 = new Animal("Eshka", 4);
        Animal animal12 = new Animal("Eshka", 4);
        System.out.println(animal11.equals(animal12));
        System.out.println(animal11.hashCode());
        System.out.println(animal12.hashCode());



    }

}
