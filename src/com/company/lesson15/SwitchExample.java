package com.company.lesson15;

import java.util.Random;

public class SwitchExample {
    public static void run(){
        Random random = new Random();

        int example = random.nextInt(5);

//        if (example == 0){
//            System.out.println("Example 0");
//        } else if (example == 1){
//            System.out.println("Example 1");
//        } else if (example == 2){
//            System.out.println("Example 2");
//        } else if (example == 3){
//            System.out.println("Example 3");
//        }
//        else {
//            System.out.println("other digits");
//        }
        switch (example) {
            case 0:
                System.out.println("Example 0");
                break;
            case 1:
                System.out.println("Example 1");
                break;
            case 2:
                System.out.println("Example 2");
                break;
            case 3:
                System.out.println("Example 3");
                break;
            default:
                System.out.println("other digits");
        }
    }
}
