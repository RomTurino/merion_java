package com.company.lesson8;

public class Duck extends Bird{
    public Duck() {
    }

    @Override
    public void voice() {
        System.out.println("Quack!");
    }

    public void showSpeed() {
        if (flyModeActive){
            System.out.println("Duck speed: 40");
        }
        else {
            System.out.println("Duck speed: 0");
        }
    }
}
