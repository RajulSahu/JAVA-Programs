package com.rajul;

//             1
//           2 1 2
//         3 2 1 2 3
//       4 3 2 1 2 3 4
//         3 2 1 2 3
//           2 1 2
//             1


public class Pattern_17 {
    public static void main(String[] args) {
        pattern17(4);
    }
    static void pattern17(int n){
        for (int row = 1; row <= 2 * n; row++) {
            int c = row > n ? (2 * n - row) : row;
            for (int sp = 0; sp < (n-c); sp++) {
                System.out.print("  ");
            }
            for (int col = c ;col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
