package com.rajul;

import java.util.Arrays;

public class CellsWithOddValuesInMatrix {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {{0,1}, {1,1}};
        int ans = oddCells(m,n,indices);
        System.out.println(ans);
    }
    static int oddCells(int m, int n, int[][] indices){
        int[][] matrix = new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];
            increment(matrix, row, col, m, n);
        }
        int odds = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] % 2 != 0) odds++;
            }
        }
        return odds;
    }
    static void increment(int[][] matrix, int row, int col, int m, int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == row) matrix[i][j] += 1;
                if (j == col) matrix[i][j] += 1;
            }
        }
    }
}
