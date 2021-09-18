package com.rajul;

//        * * * * * * * * * *
//        * * * *     * * * *
//        * * *         * * *
//        * *             * *
//        *                 *
//        *                 *
//        * *             * *
//        * * *         * * *
//        * * * *     * * * *
//        * * * * * * * * * *

public class Pattern_18 {
    public static void main(String[] args) {
        pattern18(5);
    }
    static void pattern18(int n){
        n = 2*n;
        int start = (n-1)/2;
        int end = start + 1 ;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if(col <= start || col >= end){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            if (row < n/2-1) {
                start--;
                end++;
            }
            if (row >= n/2) {
                start++;
                end--;
            }
        }
    }
}
