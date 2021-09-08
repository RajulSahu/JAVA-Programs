package com.rajul;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n = sc.nextInt();
        System.out.println((perfect(n)) ? "Perfect" : "Not Perfect");
    }
    static boolean perfect(int n){
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return (n == sum);
    }
}
