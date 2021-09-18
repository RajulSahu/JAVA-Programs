package com.rajul;

//              *
//            * * *
//          * * * * *
//        * * * * * * *
//      * * * * * * * * *

public class Pattern_8 {
    public static void main(String[] args) {
        pattern8(5);
    }
    static void pattern8(int n){
        for (int row = 1; row <= n; row++) {
            for (int sp = 1; sp <= n-row; sp++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2*row-1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
