package com.rajul;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = product(a,b);
        System.out.println("The product is: " + ans);
    }
    static int product(int a, int b) {
        return a * b;
    }
}
