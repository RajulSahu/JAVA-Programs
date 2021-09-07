package com.rajul;


import java.util.*;


public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {1};
        int ans = findDuplicate(nums);
        System.out.println(ans);
        System.out.println(Arrays.toString(nums));
    }

    static int findDuplicate(int[] nums){
        int i = 0;
        int temp;
        int ans = -1;
        while(i < nums.length){
            int correct_index = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct_index]){
                temp = nums[i];
                nums[i]= nums[correct_index];
                nums[correct_index] = temp;
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(j != nums[j]-1){
                ans = j+1;
                break;
            }
            else{
                ans = nums.length + 1;
            }
        }
        return ans;
    }
}
