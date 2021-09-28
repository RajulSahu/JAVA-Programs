package com.rajul;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
//        int[] nums = {3,2,1,0,4};
//        int[] nums = {1,2,3};
        boolean canJump = canJump(nums);
        System.out.println(canJump);
    }
    // This is a Greedy Approach.
    static boolean canJump(int[] nums){
        int lastGoodPosition = nums.length - 1;
        for (int i = nums.length-1; i >= 0; i--) {
            if (i + nums[i] >= lastGoodPosition) {
                lastGoodPosition = i;
            }
        }
        return  lastGoodPosition == 0;
    }
}
