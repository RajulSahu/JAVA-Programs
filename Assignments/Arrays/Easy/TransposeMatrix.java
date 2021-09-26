package com.rajul;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] ans = transpose(matrix);
        System.out.println(Arrays.deepToString(ans));
    }
    static int[][] transpose(int[][] matrix) {
        int[][] transpose_matrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose_matrix[j][i] = matrix[i][j];
            }
        }
        return transpose_matrix;
    }
}
