package com.rajul;

//      * * * * *
//       * * * *
//        * * *
//         * *
//          *
//          *
//         * *
//        * * *
//       * * * *
//      * * * * *

public class Pattern_12 {
    public static void main(String[] args) {
        pattern12(5);
    }
    static void pattern12(int n){
        for (int row = 1; row <= n; row++) {
            for (int sp = 1; sp < row; sp++) {
                System.out.print(" ");
            }
            for (int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            for (int sp = 1; sp <= n - row; sp++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
