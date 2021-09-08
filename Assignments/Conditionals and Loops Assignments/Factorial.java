package com.rajul;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int temp = n;
        int fact = 1;
        while(n>0){
            fact *= n;
            n--;
        }
        System.out.printf("Factorial of %d is: %d", temp, fact);
    }
}
