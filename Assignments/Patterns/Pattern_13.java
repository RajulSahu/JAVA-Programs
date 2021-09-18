package com.rajul;

//        *
//       * *
//      *   *
//     *     *
//    *********

public class Pattern_13 {
    public static void main(String[] args) {
        pattern13(5);
    }
    static void pattern13(int n){
        for (int row = 1; row <= n; row++) {
            for (int sp = 1; sp <= n-row; sp++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*row-1; col++) {
                if(col == 1 || col == 2*row-1 || row == n) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
