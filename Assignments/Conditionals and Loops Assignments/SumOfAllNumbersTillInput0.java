package com.rajul;

import java.util.Scanner;

public class SumOfAllNumbersTillInput0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        boolean condition = true;
        while (condition) {
            System.out.print("Enter a Number: ");
            int n = sc.nextInt();
            if (n == 0) condition = false;
            sum += n;
        }
        System.out.println("The sum is: " + sum);
    }
}
