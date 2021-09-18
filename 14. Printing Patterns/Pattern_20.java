package com.rajul;

//        ****
//        *  *
//        *  *
//        *  *
//        ****

public class Pattern_20 {
    public static void main(String[] args) {
        pattern20(5);
    }
    static void pattern20(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-1; col++) {
                if(row == 1 || col == 1 || row == n || col == n-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
