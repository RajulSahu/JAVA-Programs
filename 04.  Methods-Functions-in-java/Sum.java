package com.rajul;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Function Call
        sum();
        int ans = sum2();
        System.out.println(ans);
    }

    // Function Definition
    // This function does not return something
    static void sum(){
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum = 0;

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        sum = num1 + num2;
        System.out.println("Sum of two numbers you entered is: " + sum);
    }

    // This function returns an integer value
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum = 0;

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        sum = num1 + num2;
        return sum;
    }
}
