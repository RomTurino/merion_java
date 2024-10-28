package com.company.lesson8;

public class Bird extends Animal{
    protected boolean flyModeActive = false;

    public Bird() {
        this.flyModeActive = true;
    }

    public void takeOff(){
        this.flyModeActive = true;
    }

    public boolean isFlyModeActive() {
        return flyModeActive;
    }

    public void setFlyModeActive(boolean flyModeActive) {
        this.flyModeActive = flyModeActive;
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
