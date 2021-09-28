package com.rajul;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2};
        int k = 4;
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
    static void rotate(int[] nums, int k) {
        int n = nums.length;
        if (k > n) {
          k = k % n;
        }
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }
    static void reverse(int[] nums, int start, int end){
        int temp;
        while (start < end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
