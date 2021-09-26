package com.rajul;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindRotation {
    public static void main(String[] args) {
        int[][] mat = {{0,1}, {1,1}};
        int[][] target = {{0,1}, {1,1}};
        boolean ans = findRotation(mat, target);
        System.out.println(ans);
    }
    static boolean findRotation(int[][] mat, int[][] target){
        for (int i = 1; i <= 4; i++) {
            mat = transpose(mat);
            for(int[] matrix: mat){
                reverse(matrix);
            }
            if (areEqual(mat, target)) return true;
        }
        return false;
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
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static boolean areEqual(int[][] a,int[][] b){
        for(int i=0; i < a.length; i++){
            for(int j=0; j < a[0].length; j++){
                if (a[i][j] != b[i][j]) return false;
            }
        }
        return true;
    }

}
