package com.rajul;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] ans = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] getConcatenation(int[] nums){
        int n = nums.length;
        int[] result = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            result[i] = nums[i % n];
        }
        return result;
    }
}
