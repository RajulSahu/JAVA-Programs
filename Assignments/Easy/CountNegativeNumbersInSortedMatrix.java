package com.rajul;

public class CountNegativeNumbersInSortedMatrix {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int ans1 = countNegatives(grid);
        int ans2 = countNegatives2(grid);
        System.out.println(ans1);
        System.out.println(ans2);
    }
    static int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] < 0) count++;
            }
        }
        return count;
    }

    static int countNegatives2(int[][] grid) {
        int rowLen = grid[0].length;
        int colLen = grid.length;

        int i = 0;
        int j = rowLen - 1;

        int total = 0;
        while (i < colLen && j >=0){
            if(grid[i][j] < 0){
                total += colLen - i;
                j -= 1;
            }
            else {
                i += 1;
            }
        }
        return total;
    }
}
