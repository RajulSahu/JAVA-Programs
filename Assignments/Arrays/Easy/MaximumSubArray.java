package com.rajul;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
//        int[] nums = {-1};
//        int[] nums = {5,4,-1,7,8};
        int ans1 = maxSubArray(nums);
        int ans2 = maxSubArrayKadaneAlgorithm(nums);
        System.out.println(ans1);
        System.out.println(ans2);
    }
    static int maxSubArray(int[] nums){
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int currSum = 0;
            for (int j = i; j < nums.length; j++) {
                currSum += nums[j];
                if (currSum > maxSum) maxSum = currSum;
            }
        }
        return maxSum;
    }
    static int maxSubArrayKadaneAlgorithm(int[] nums){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if(currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
}
