package com.rajul;

//        *                 *
//        * *             * *
//        * * *         * * *
//        * * * *     * * * *
//        * * * * * * * * * *
//        * * * *     * * * *
//        * * *         * * *
//        * *             * *
//        *                 *

public class Pattern_29 {
    public static void main(String[] args) {
        pattern29(5);
    }
    static void pattern29(int n){
        n = n*2;
        int start = 1;
        int end = n;
        for (int row = 1; row < n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col <= start || col >= end) System.out.print("* ");
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
