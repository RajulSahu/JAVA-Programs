package com.rajul;

public class Pattern_9 {
    public static void main(String[] args) {
        pattern9(5);
    }
    static void pattern9(int n){
        for (int row = 1; row <= n; row++) {
            for (int sp = 1; sp <= row-1; sp++) {
                System.out.print("  ");
            }
            for (int col = 2*n-1; col >= 2*row-1 ; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
