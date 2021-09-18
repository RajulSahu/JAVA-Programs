package com.rajul;

//        *
//       * *
//      * * *
//     * * * *
//    * * * * *

public class Pattern_10 {
    public static void main(String[] args) {
        pattern10(5);
    }
    static void pattern10(int n){
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
