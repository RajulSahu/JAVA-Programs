package com.rajul;
import java.util.*;

public class LuckyNumbersInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        List<Integer> ans = luckyNumbers(matrix);
        System.out.println(ans);
    }
    static List<Integer> luckyNumbers (int[][] matrix){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int minimumInRow_colIndex = findMinIndex(matrix, i);
            int maximumInCol = findMax(matrix, minimumInRow_colIndex);
            if (matrix[i][minimumInRow_colIndex] == maximumInCol){
                result.add(maximumInCol);
            }
        }
        return result;
    }
    static int findMinIndex(int[][] matrix, int row){
        int minIndex = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[row][i] < matrix[row][minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }
    static int findMax(int[][] matrix, int col){
        int max = matrix[0][col];
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][col] > max){
                max = matrix[i][col];
            }
        }
        return max;
    }
}
