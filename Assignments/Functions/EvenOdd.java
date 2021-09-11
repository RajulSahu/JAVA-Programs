package com.rajul;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.println(isEven(a) ? "Even" : "Odd");
    }
    static boolean isEven(int num){
        return (num % 2 == 0);
    }
}
