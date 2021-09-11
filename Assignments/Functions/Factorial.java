package com.rajul;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int ans = calculateFactorial(a);
        System.out.println("The Factorial is: " + ans);
    }
    static int calculateFactorial(int a){
        int fact = 1;
        while (a > 0){
            fact *= a;
            a--;
        }
        return fact;
    }
}
