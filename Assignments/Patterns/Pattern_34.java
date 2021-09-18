package com.rajul;

//        E D C B A
//        D C B A
//        C B A
//        B A
//        A

public class Pattern_34 {
    public static void main(String[] args) {
        pattern34(5);
    }
    static void pattern34(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 65+n-1-row; col >= 65; col--) {
                System.out.print((char)(col) + " ");
            }
            System.out.println();
        }
    }
}
