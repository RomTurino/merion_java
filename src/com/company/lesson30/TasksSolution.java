package com.company.lesson30;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class TasksSolution {

    public static int getRectangleSquare(int a, int b) {
        return a*b;
    }

    public static boolean isEven(int a) {
        return a%2==0;
    }

    public static int getFactorial(int a) {
        if (a==1) {
            return 1;
        }
        return a*getFactorial(a-1);
    }

    public static int CelciusToFahrenheit(int a) {
        return a*9/5+32;
    }

    public static int getMax(int[] array){
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static String stringReverse(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str){
        return str.equals(stringReverse(str));
    }

    public static class GuessGame{
        private final int secretNumber;
        private int guessNumber;
        private int attempts = 5;
        private final BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in));

        public GuessGame(){
            secretNumber = (int)(Math.random()*10) + 1;
        }

        private void setGuessNumber(){
            System.out.println("Введите число от 1 до 10");
            try{
                this.guessNumber = Integer.parseInt(reader.readLine());
            } catch (Exception e){
                System.out.println("Вы ввели не число");
                setGuessNumber();
            }
        }


        public void run(){
            System.out.println("Компьютер загадал число от 1 до 10. Попробуй угадать его.");
            while (attempts > 0){
                setGuessNumber();
                if (guessNumber == secretNumber){
                    System.out.println("Вы угадали!");
                    break;
                }
                else if (guessNumber > secretNumber){
                    System.out.println("Ваше число больше секретного");
                }
                else {
                    System.out.println("Ваше число меньше секретного");
                }
                attempts--;
                System.out.println("У вас осталось " + attempts + " попыток");
                if (attempts == 0){
                    System.out.println("Вы проиграли!");
                }
            }
        }
    }

    public static int getSumInterval(int start, int end){
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    public static boolean isPrimeNumber(int number){
        if (number < 2) {
            return false;
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number%i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static int[] getFibonacci(int n){
        if (n <= 0)
            return null;
        int[] array = new int[n];
        array[0] = 0;
        if (n > 1)
            array[1] = 1;
        for (int i = 2; i < n; i++) {
            array[i] = array[i-1] + array[i-2];
        }
        return array;
    }

    public static int getMin(int[] array){
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
                break;
            }
        }
        return min;
    }

    public static String fromDecToBin(int number){
        StringBuilder result = new StringBuilder();
        while (number > 0) {
            result.append(number%2);
            number /= 2;
        }
        return result.reverse().toString();

    }

    public static ArrayList<Integer>getPrimeNumbers(int start, int end){
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPrimeNumber(i)){
                array.add(i);
            }
        }
        return array;
    }

    public static String reverseOrderOfLines(String str){
        StringBuilder result = new StringBuilder();
        String[] lines = str.split("\n");
        for (int i = lines.length - 1; i >= 0; i--) {
            result.append(lines[i]).append("\n");
        }
        return result.toString().trim();
    }


    public static void main(String[] args) {
        System.out.println(getRectangleSquare(2,3));
        System.out.println(isEven(2));
        System.out.println(getFactorial(5));
        System.out.println(CelciusToFahrenheit(10));
        System.out.println(getMax(new int[]{1,2,3,4,5,6,7,8,9,10}));
        System.out.println(stringReverse("Hello"));
        System.out.println(isPalindrome("madam"));
        GuessGame game = new GuessGame();
        System.out.println(getSumInterval(1,10));
        System.out.println(isPrimeNumber(1997));
        System.out.println(Arrays.toString(getFibonacci(10)));
        System.out.println(getMin(new int[]{1,2,3,4,5,6,7,8,9,10}));
        System.out.println(fromDecToBin(255));
        System.out.println(getPrimeNumbers(1,100));
        System.out.println(reverseOrderOfLines("Hello\nWorld"));

    }
}
