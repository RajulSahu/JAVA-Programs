package com.rajul;

public class Palindrome {
    public static void main(String[] args) {
        int n = 12321;
        boolean palindrome = checkPalindrome(n);
        System.out.println(palindrome);
    }
    static boolean checkPalindrome(int n){
        int rev = reverseNum(n);
        return n == rev;
    }
    static int reverseNum(int n){
        if (n % 10 == n){
            return n;
        }
        return (n%10) * (int)(Math.pow(10, (int)(Math.log10(n+0.0)))) + reverseNum(n/10);
    }

}
