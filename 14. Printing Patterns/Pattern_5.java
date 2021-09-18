package com.rajul;


//    *
//    * *
//    * * *
//    * * * *
//    * * * * *
//    * * * *
//    * * *
//    * *
//    *

public class Pattern_5 {

    public static void main(String[] args) {
        pattern5(5);
    }
    static void pattern5(int n){
        for (int row = 1; row <= n * 2; row++) {
            int totalColsInRow = row > n ? (2 * n - row) : row;
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
