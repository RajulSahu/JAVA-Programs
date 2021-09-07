package com.rajul;

import java.util.Arrays;

// Performs well than a Bubble Sort Algorithm.
// Is good for only small arrays only.
// Not a stable Algorithm.
public class SelectionSort {

    public static void main(String[] args) {
	int[] nums = {5,4,1,2,3};
    selectionSort(nums);
    System.out.println(Arrays.toString(nums));
    }

    static void selectionSort(int[] nums){
        int last_index = nums.length-1;
        int temp;
        for (int i = 0; i < nums.length-1; i++) {
            int max_index = getMaxIndex(nums, last_index);
            temp = nums[last_index];
            nums[last_index] = nums[max_index];
            nums[max_index] = temp;
            last_index--;
        }
    }
    static int getMaxIndex(int[] a, int end){
        int max_index = 0;
        for (int i = 0; i <= end; i++) {
            if(a[i] > a[max_index]){
                max_index = i;
            }
        }
        return max_index;
    }

}
