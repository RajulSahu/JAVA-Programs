package com.rajul;
import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n = sc.nextInt();
        boolean ans = isArmstrong(n);
        System.out.println(ans);
    }

    static boolean isArmstrong(int n){
        int num = n;
        int d;
        int r = 0;
        while(n != 0) {
            d = n % 10;
            r = r + (d * d * d);
            n = n / 10;
        }
        return (num == r);
        }
}
