package com.rajul;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        int missing = firstMissingPositive(nums);
        System.out.println(missing);
    }
    // This Question can be solved using insertion sort technique.
    static int firstMissingPositive(int[] nums) {
        int temp;
        int index = 0;
        while (index < nums.length) {
            int correctIndex = nums[index]-1;
            if (nums[index] > 0 && nums[index] <= nums.length && nums[correctIndex] != nums[index]){
                temp = nums[correctIndex];
                nums[correctIndex] = nums[index];
                nums[index]  = temp;
            }
            else {
                index++;
            }
        }
        int ans = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i+1){
                ans = i+1;
                break;
            }
        }
        return (ans == -1) ? nums.length+1:ans;
    }

}
