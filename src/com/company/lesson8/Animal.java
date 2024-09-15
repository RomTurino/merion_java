package com.company.lesson8;

public class Animal {
    protected String name;
    protected int weight;
    protected int currentPosition;

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    protected void runForward(int length) {
        this.currentPosition += length;
    }

    public Animal() // конструктор по умолчанию
    {

    }

    public void voice() {
        System.out.println("I am " + name);
    }

}
