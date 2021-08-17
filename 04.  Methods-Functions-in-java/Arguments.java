package com.rajul;

import java.util.Scanner;

public class Arguments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        int ans = sum2(num1, num2);
        System.out.println(ans);
    }

    static int sum2(int a, int b){
        int sum = a + b;
        return sum;
    }


}
