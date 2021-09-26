package com.rajul;

import java.util.Arrays;

public class BuildArrayFromPermutation {

    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
       int[] ans = buildArray1(nums);
       System.out.println(Arrays.toString(ans));
    }
    static int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }
    static int[] buildArray1(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] + (n * (nums[nums[i]] % n));
        }
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] / n;
        }
        return nums;
    }

}
