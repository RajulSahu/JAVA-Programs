package com.rajul;

import java.util.Scanner;

public class LargestOfAllNumbersTillInput0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        boolean condition = true;
        while (condition) {
            System.out.print("Enter a Number: ");
            int n = sc.nextInt();
            if (n == 0) condition = false;
            if (n > max) max = n;
        }
        System.out.println("The Maximum Number you entered was: " + max);
    }
}
