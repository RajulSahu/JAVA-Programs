package com.rajul;

import java.util.Arrays;

public class TwoSum2InputArrayIsSorted {
    public static void main(String[] args) {
        int[] numbers = {2,25,75};
        int target = 100;
        int[] ans = twoSum(numbers, target); // [0,3]
        System.out.println(Arrays.toString(ans));
    }
    static int[] twoSum(int[] numbers, int target) {
        int a = 0;
        int b = numbers.length - 1;
        while (a < b) {
            if (numbers[a] + numbers[b] == target) return new int[]{a+1, b+1};
            if (numbers[a] + numbers[b] < target) a++;
            else b--;
        }
        return new int[]{0, 0};
    }
}
