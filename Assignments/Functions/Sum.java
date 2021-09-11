package com.rajul;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = sum(a,b);
        System.out.println("The sum is: " + ans);
    }
    static int sum(int a, int b){
        return a + b;
    }
}
