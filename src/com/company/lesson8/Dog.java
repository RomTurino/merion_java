package com.company.lesson8;

public class Dog extends Animal{
    public Dog(String name, int weight) {
        super(name, weight);
    }

    public Dog() {
    }

    /**
     * Идем до позиции палки. Чтобы дойти до палки, нужно определить разницу между текущей позицией и позицией палки.
     */
    public void goToStick(int stickPosition){
        int delta = stickPosition - this.currentPosition;
        runForward(delta);
    }
    public void whereIsDog(){
        System.out.println("Dog is at position " + this.currentPosition);
    }

    public static Dog isHomeless(int weight){
        Dog dog = new Dog();
        dog.weight = weight;
        return dog;
    }
}
