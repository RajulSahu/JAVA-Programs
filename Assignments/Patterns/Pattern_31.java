package com.rajul;

//        4 4 4 4 4 4 4
//        4 3 3 3 3 3 4
//        4 3 2 2 2 3 4
//        4 3 2 1 2 3 4
//        4 3 2 2 2 3 4
//        4 3 3 3 3 3 4
//        4 4 4 4 4 4 4

public class Pattern_31 {
    public static void main(String[] args) {
        pattern31(4);
    }
    static void pattern31(int n){
        int original_n = n;
        n = 2 * n;
        for (int row = 0; row <= n-2; row++) {
            for (int col = 0; col <= n-2; col++) {
                int atEveryIndex = original_n - Math.min(Math.min(row, col), Math.min(n-row, n-col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
