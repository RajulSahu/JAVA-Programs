package com.rajul;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 12345;
        int fact = reverseNum(n);
        System.out.println(fact);
    }
    static int reverseNum(int n){
        if (n % 10 == n){
            return n;
        }
        return (n%10) * (int)(Math.pow(10, (int)(Math.log10(n+0.0)))) + reverseNum(n/10);
    }
}
