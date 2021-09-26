package com.rajul;

import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3}, {3,2,1}};
        int ans = maximumWealth(nums);
        System.out.println(ans);
    }
    static int maximumWealth(int[][] accounts){
        int maxSum = -1;
        for (int i = 0; i < accounts.length; i++) {
            int currSum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                currSum += accounts[i][j];
            }
            if(currSum > maxSum){
                maxSum = currSum;
            }
        }
        return maxSum;
    }
}
