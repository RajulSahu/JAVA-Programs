package com.rajul;

//        * * * * *
//         * * * *
//          * * *
//           * *
//            *

public class Pattern_11 {
    public static void main(String[] args) {
        pattern11(5);
    }
    static void pattern11(int n){
        for (int row = 1; row <= n; row++) {
            for (int sp = 1; sp < row; sp++) {
                System.out.print(" ");
            }
            for (int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
