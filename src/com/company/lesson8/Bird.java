package com.company.lesson8;

public class Bird extends Animal{
    protected boolean flyModeActive = false;

    public void takeOff(){
        this.flyModeActive = true;
    }


    public void landing(){
        this.flyModeActive = false;
    }

    public void isTheBirdFly(){
        System.out.println(
                this.flyModeActive ? "Bird is flying" : "Bird is not flying"
        );
    }
}
