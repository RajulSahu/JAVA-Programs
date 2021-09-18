package com.rajul;


//             *      *
//           *   *  *   *
//         *      *      *


public class Pattern_23 {
    public static void main(String[] args) {
        pattern23(9);
    }
    static void pattern23(int n){
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= n; col++) {
                if ((row+col) % 4 == 0 || row == 2 && col % 4 == 0) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
