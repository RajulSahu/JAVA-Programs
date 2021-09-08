package com.rajul;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int n = sc.nextInt();
        int temp = n;
        int ans = 0;
        while(n > 0){
            int d = n % 10;
            ans += (Math.pow(d,3));
            n = n / 10;
        }
        if(ans == temp) System.out.println("Armstrong");
        else System.out.println("Not a Armstrong");
    }
}
