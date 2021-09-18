package com.rajul;

public class Pattern_14 {
    public static void main(String[] args) {
        pattern14(5);
    }
    static void pattern14(int n){
        for (int row = n; row >= 1; row--) {
            for (int sp = 1; sp <= n-row; sp++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*row-1; col++) {
                if (col == 1 || col == 2*row-1 || row == n) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
