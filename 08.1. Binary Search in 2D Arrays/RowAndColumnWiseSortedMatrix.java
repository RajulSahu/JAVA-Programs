package com.rajul;

import java.util.Arrays;

public class RowAndColumnWiseSortedMatrix {

    public static void main(String[] args) {
        // The given matrix is row wise sorted and column wise sorted.
        // Hence, binary search can be applied, on this matrix.
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target = 29;
        int[] ans = binarySearch(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] binarySearch(int[][] arr, int target){
        int row = 0;
        int col = arr[0].length-1;
        while(row < arr.length && col > 0){
            int element = arr[row][col];
            if (target == element) return new int[]{row, col};
            else if (target < element) col--;
            else row++;
        }
        return new int[]{-1, -1};
    }
}
