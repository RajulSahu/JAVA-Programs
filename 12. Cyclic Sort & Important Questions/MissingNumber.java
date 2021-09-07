package com.rajul;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {0,1};
        int missing = findMissingNumber(nums);
        System.out.println(missing);
        System.out.println(Arrays.toString(nums));

    }
    static int findMissingNumber(int[] nums){
        int i = 0;
        int temp;
        int ans = -1;
        while(i < nums.length){
            int correct_index = nums[i];
            if(correct_index < nums.length && nums[i] != nums[correct_index]){
                temp = nums[i];
                nums[i] = nums[correct_index];
                nums[correct_index] = temp;
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(j != nums[j]){
                ans =  j;
                break;
            }
            else{
                ans= nums.length;
            }
        }
        return ans;
    }
}
