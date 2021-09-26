package com.rajul;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        int ans = diagonalSum(matrix);
        System.out.println(ans);
    }
    static int diagonalSum(int[][] mat){
        int m = mat.length;
        int n = mat[0].length;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == m-1) sum += mat[i][j];
            }
        }
        return sum;
    }
    static int diagonalSum1(int[][] mat){
        int sum = 0;
        int left = 0, right = mat.length-1;
        for (int[] element: mat) {
            sum += element[left] + element[right];
            left++;
            right--;
        }
        if (mat.length % 2 !=0) {
            sum -= mat[mat.length/2][mat.length/2];
        }
        return sum;
    }
}
