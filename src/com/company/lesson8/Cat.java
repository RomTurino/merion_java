package com.company.lesson8;

public class Cat extends Animal{

    public Cat(String name, Integer weight) {
        super(name, weight);
    }

    public Cat() {
    }

    private int heightCoefficient(int weight) {
        if (this.weight > 10)
            return 120;
        return 90;
    }

    public int jumpHeight() {
        if (this.weight == 0)
            return 300;
        return heightCoefficient(this.weight);
    }
}
