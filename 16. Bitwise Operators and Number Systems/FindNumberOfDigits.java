package com.rajul;

public class FindNumberOfDigits {
    public static void main(String[] args) {
        int n = 2; // number whose digits are to be found
        int base = 10; // decimal can be 2 for binary.

        int digits = (int)(Math.log(n) / Math.log(base)) + 1;

        System.out.println(digits);
        System.out.println();
    }
}
