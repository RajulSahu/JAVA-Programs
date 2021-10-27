package com.rajul;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int fact = calculateFactorial(n);
        System.out.println(fact);
    }
    static int calculateFactorial(int n){
        if(n <= 2){
            return 2;
        }
        return n * calculateFactorial(n-1);
    }
}
