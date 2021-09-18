package com.rajul;

//        *                 *
//        * *             * *
//        *   *         *   *
//        *     *     *     *
//        *       * *       *
//        *     *     *     *
//        *   *         *   *
//        * *             * *
//        *                 *

public class Pattern_24 {
    public static void main(String[] args) {
        pattern24(5);
    }
    static void pattern24(int n){
        n = n*2;
        int start = 1;
        int end = n;
        for (int row = 1; row < n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col == start || col == end || col==1 || col == n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
            if(row < n/2) {
                start++;
                end--;
            }
            else {
                start--;
                end++;
            }
        }
    }
}
