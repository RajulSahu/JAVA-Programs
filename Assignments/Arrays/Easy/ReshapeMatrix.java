package com.rajul;
import java.util.*;

public class ReshapeMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};
        int r = 1;
        int c = 9;
        int[][] ans = matrixReshape(mat, r, c);
        System.out.println(Arrays.deepToString(ans));
    }
    static int[][] matrixReshape(int[][] mat, int r, int c) {
        if (r * c != mat.length * mat[0].length){
            return mat;
        }
        int[][] result = new int[r][c];
        int row = 0;
        int col = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                result[row][col] = mat[i][j];
                if (col < c-1) {
                    col++;
                }
                else{
                    row++;
                    col = 0;
                }
            }
        }
        return result;
    }
}
