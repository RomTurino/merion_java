package com.company.lesson8;

import java.util.Objects;

public class Animal {
    protected String name;
    protected int weight;
    protected int currentPosition;

    protected Boolean canFly = false;

    public static class WeightException extends RuntimeException {
        public WeightException() {
            super("Нельзя создавать животных с отрицательным весом");
        }
    }


    public Animal(String name, int weight){
        if (weight < 0) {
            throw new WeightException();
        }
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
        System.out.println("I am " + this.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return weight == animal.weight && currentPosition == animal.currentPosition && Objects.equals(name, animal.name) && Objects.equals(canFly, animal.canFly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, currentPosition, canFly);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight){
        if (weight < 0) {
            throw new WeightException();
        }
        this.weight = weight;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public Boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(Boolean canFly) {
        this.canFly = canFly;
    }
}
