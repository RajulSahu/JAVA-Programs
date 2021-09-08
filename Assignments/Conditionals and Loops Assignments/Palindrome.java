package com.rajul;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n = sc.nextInt();
        System.out.println((palindrome(n)) ? "Palindrome" : "Not Palindrome");
    }
    static boolean palindrome(int n){
        int temp = n;
        int rev = 0;
        while (n > 0){
            int d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        return (temp == rev);
    }
}
