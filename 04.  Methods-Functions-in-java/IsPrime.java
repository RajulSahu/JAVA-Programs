package com.rajul;
import java.util.Scanner;
import java.lang.Math;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }

    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
