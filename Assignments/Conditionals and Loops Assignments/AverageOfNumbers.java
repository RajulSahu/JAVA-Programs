package com.rajul;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of inputs to give: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a Number: ");
            int num = sc.nextInt();
            sum += num;
        }
        double ans = (double)sum/n;
        System.out.println("The Average is: " + ans);
    }
}
