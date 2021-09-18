package com.rajul;

//              1
//            1   1
//          1   2   1
//        1   3   3   1
//      1   4   6   4   1

public class Pattern_16 {
    public static void main(String[] args) {
        pattern16(5);
    }
    static void pattern16(int n){

        for (int row = 0; row < n; row++) {
            for (int sp = 1; sp <= n-row; sp++) {
                System.out.print(" ");
            }
            int printChar = 1;
            int numerator = row;
            int denominator = 1;
            for (int col = 0; col <= row; col++) {
                System.out.print(printChar + " ");
                printChar *= numerator;
                printChar /= denominator;
                denominator++;
                numerator--;
            }
            System.out.println();
        }
    }
}
