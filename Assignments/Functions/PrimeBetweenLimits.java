package com.rajul;

import java.util.Scanner;

public class PrimeBetweenLimits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = sc.nextInt();
        System.out.print("Enter end: ");
        int end = sc.nextInt();
        printAllPrime(start, end);
    }
    static void printAllPrime(int start, int end){
        for (int i = start; i <= end ; i++) {
            int c = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) c++;
            }
            if (c == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
