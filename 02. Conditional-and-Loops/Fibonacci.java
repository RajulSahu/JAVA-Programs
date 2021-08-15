package com.rajul;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of terms to print from Fibonacci Series: ");
        int n = input.nextInt();
        int a = -1;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}
