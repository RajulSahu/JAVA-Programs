package com.rajul;

//        1 1 1 1 1 1
//        2 2 2 2 2
//        3 3 3 3
//        4 4 4
//        5 5
//        6

public class Pattern_26 {
    public static void main(String[] args) {
        pattern26(6);
    }
    static void pattern26(int n){
        int count = 1;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n-row; col++) {
                System.out.print(count + " ");
            }
            System.out.println();
            count++;
        }
    }
}
