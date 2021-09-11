package com.rajul;

import java.util.Scanner;

public class sumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a limit: ");
        int n = sc.nextInt();

        int ans = sum(n);
        System.out.printf("Sum from 1 to %d is: %d", n, ans);
    }
    static int sum(int n){
        return n * (n+1) / 2;
    }
}
