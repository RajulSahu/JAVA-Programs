package com.rajul;
import java.util.*;


public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,1,1}, {1,0,1}, {1,1,1}};
        setZeroesExtraSpace(matrix1);
        System.out.println(Arrays.deepToString(matrix1));

        int[][] matrix2 = {{1,1,1}, {1,0,1}, {1,1,1}};
        setZeroesWithoutSpace(matrix2);
        System.out.println(Arrays.deepToString(matrix2));

    }
    static void setZeroesExtraSpace(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> cols = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for (int i = 0; i < rows.size(); i++) {
            modifyMatrix(matrix, rows.get(i), cols.get(i));
        }
    }
    static void modifyMatrix(int[][] matrix, int row, int col){
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[row][i] = 0;
        }
    }

    static void setZeroesWithoutSpace(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        boolean isCol = false;

        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) isCol = true;
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (matrix[0][0] == 0){
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        if (isCol) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
