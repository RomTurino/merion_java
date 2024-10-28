package com.company.lesson30;

public class LambdaExample {
    public static void main(String[] args) {
        LambdaOperator lambdaOperator = ((x,y) -> x + y + x);

        System.out.println(lambdaOperator.anyNameOfMethod(10,10));
    }
}
