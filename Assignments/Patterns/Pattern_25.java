package com.rajul;

//            *****
//           *   *
//          *   *
//         *   *
//        *****

public class Pattern_25 {
    public static void main(String[] args) {
        pattern25(5);
    }
    static void pattern25(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n * 2 - 1; col++) {
                if (row + col == n * 2 - 2 || row + col == n-1 || row == 0 && col >= n-1 || row == n-1 && col <= n-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
