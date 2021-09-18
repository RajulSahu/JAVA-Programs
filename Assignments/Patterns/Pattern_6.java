package com.rajul;


//            *
//          * *
//        * * *
//      * * * *
//    * * * * *

public class Pattern_6 {

    public static void main(String[] args) {
        pattern6(5);
    }
    static void pattern6(int n){
        for (int row = 1; row <= n; row++) {
            for (int sp = 1; sp <= (n-row)*2; sp++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
