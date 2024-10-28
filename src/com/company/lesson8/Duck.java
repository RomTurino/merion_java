package com.company.lesson8;

public class Duck extends Bird{
    public static final String VOICE = "Quack!";
    public static final Integer SPEED_FLY = 50;
    public static final Integer SPEED_WALK = 10;
    public Duck() {
    }

    @Override
    public void voice() {
        System.out.println(VOICE);
    }

    public void showSpeed() {
        if (flyModeActive){
            System.out.println("Duck speed: "+SPEED_FLY);
        }
        else {
            System.out.println("Duck speed: " + SPEED_WALK);
        }
    }

}
