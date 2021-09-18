package com.rajul;

//        1
//        2  3
//        4  5  6
//        7  8  9  10
//        11 12 13 14 15

public class Pattern_21 {
    public static void main(String[] args) {
        pattern21(5);
    }
    static void pattern21(int n){
        int count = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(count);
                if(row < n) System.out.print("  ");
                else System.out.print(" ");
                count++;
            }
            System.out.println();
        }
    }
}
