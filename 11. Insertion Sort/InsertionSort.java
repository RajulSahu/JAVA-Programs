package com.rajul;

import java.util.Arrays;

public class InsertionSort {

    // Number of swaps are reduced as compared to Bubble Sort and Selection Sort.
    // Works well when array is partially Sorted.
    // Also, not suitable for Huge Arrays.
    // Is a Stable Algorithm.
    public static void main(String[] args) {
	int[] nums = {3,4,5,2,1,2};
    insertionSort(nums);
    System.out.println(Arrays.toString(nums));
    }

    static void insertionSort(int[] nums){
        int temp;
        int index;
        for (int i = 0; i < nums.length; i++) {
            index = i;
            for (int j = i - 1; j >= 0 ; j--) {
                if(nums[index] < nums[j]){
                    temp = nums[index];
                    nums[index] = nums[j];
                    nums[j] = temp;
                    index = j;
                }
                else break;
            }
        }
    }
}
