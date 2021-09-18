package com.rajul;

//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1

public class Pattern_22 {
    public static void main(String[] args) {
        pattern22(5);
    }
    static void pattern22(int n){
        for (int row = 1; row <= n; row++) {
            int c = (row % 2 == 0) ? 0 : 1;
            for (int col = 1; col <= row; col++) {
                System.out.print(c + " ");
                if(c == 1) c--;
                else c++;
            }
            System.out.println();
        }
    }
}

