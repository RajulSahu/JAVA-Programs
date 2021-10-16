package com.rajul;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] matrix =  {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        int target = 11;
        boolean found = searchMatrix(matrix, target);
        System.out.println(found);
    }
    static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        int up = 0;
        int down = matrix.length-1;
        while(up <= down){
            int mid = up + (down - up) / 2;
            int rightMost = matrix[mid][matrix[0].length-1];
            if (target == rightMost){
                return true;
            }
            if (target == matrix[mid][0]){
                return true;
            }
            else if (target > rightMost){
                up = mid + 1;
            }
            else if (target > matrix[mid][0]){
                return binarySearch(matrix, mid, target);
            }
            else{
                down = mid - 1;
            }
        }
        return false;
    }
    static boolean binarySearch(int[][] matrix, int row, int target) {
        int start = 0;
        int end = matrix[row].length-1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target == matrix[row][mid]){
                return true;
            }
            else if (target > matrix[row][mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }
    static boolean searchMatrix2(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int start = 0;
        int end = m*n-1;
        int cols = matrix[0].length;
        while (start <= end){
            int mid = start + (end - start) / 2;
            int element = matrix[mid/cols][mid%cols];
            if (target == element){
                return true;
            }
            if (target > element){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }
}
