package com.rajul;


//          *
//         * *
//        * * *
//       * * * *
//      * * * * *
//       * * * *
//        * * *
//         * *
//          *

public class Pattern_28 {
    public static void main(String[] args) {
        pattern28(5);
    }
    static void pattern28(int n){
        for (int row = 1; row <= n * 2; row++) {
            int totalColsInRow = row > n ? (2 * n - row) : row;
            for (int sp = 1; sp <= (n - totalColsInRow); sp++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
