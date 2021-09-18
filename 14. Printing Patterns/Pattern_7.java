package com.rajul;

//    * * * * *
//      * * * *
//        * * *
//          * *
//            *

public class Pattern_7 {
    public static void main(String[] args) {
        pattern7(5);
    }
    static void pattern7(int n){
        for (int row = 1; row <= n; row++) {
            for (int sp = 1; sp <= row; sp++) {
                System.out.print("  ");
            }
            for (int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
