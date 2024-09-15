package com.company.lesson8;
import java.lang.annotation.*;

public class Dog extends Animal{
    public Dog(String name, int weight) {
        super(name, weight);
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface CustomAnnotation {
        String value() default "Default value";
        int count() default 1;
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

    @CustomAnnotation(count = 2)
    public void whereIsDog(){
        System.out.println("Dog is at position " + this.currentPosition);
    }

    public static Dog isHomeless(int weight){
        Dog dog = new Dog();
        dog.weight = weight;
        return dog;
    }

    @Override
    public void voice(){
        System.out.println("Woof!");
    }

    public static Dog of(String name, int weight){
        Dog dog = new Dog();
        dog.name = name;
        dog.weight = weight;
        return dog;
    }


    public static Dog[] getArray(){
        Dog[] dogs = new Dog[3];
        dogs[0] = Dog.of("Sharik", 10);
        dogs[1] = Dog.of("Bobik", 20);
        dogs[2] = Dog.of("Tuzik", 5);
        return dogs;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", currentPosition=" + currentPosition +
                '}';
    }
}
