package com.rajul;

//         E
//         D E
//         C D E
//         B C D E
//         A B C D E

public class Pattern_32 {
    public static void main(String[] args) {
        pattern32(5);
    }
    static void pattern32(int n){
        for (int row = 0; row < n; row++) {
            for (int col = (65+n-1)-row; col < 65 + n; col++) {
                System.out.print((char)(col) + " ");
            }
            System.out.println();
        }
    }
}
