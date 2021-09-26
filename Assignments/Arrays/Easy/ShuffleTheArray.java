package com.rajul;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] ans = shuffle(nums, n);
        System.out.println(Arrays.toString(ans));
    }
    static int[] shuffle(int[] nums, int n) {
        int len = n*2;
        int[] result = new int[len];
        int index = 0;
        for (int i = 0; i < len; i+=2) {
            result[i] = nums[index];
            result[i+1] = nums[index+n];
            index++;
        }
        return result;
    }
}
