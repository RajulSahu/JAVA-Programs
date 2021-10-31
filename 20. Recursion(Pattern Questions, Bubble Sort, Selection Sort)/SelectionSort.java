package com.rajul;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {2,3,1,32,12,45,3};
        selectionSort(nums, nums.length, 0, 0);
        System.out.println(Arrays.toString(nums));
    }
    static void selectionSort(int[] nums, int lastIndex, int index, int maxSoFar){
        if(lastIndex == 0){
            return;
        }
        if(index < lastIndex){
            if(nums[index] > nums[maxSoFar]){
                selectionSort(nums, lastIndex, index+1, index);
            }
            else{
                selectionSort(nums, lastIndex, index+1, maxSoFar);
            }
        }
        else{
            int temp = nums[maxSoFar];
            nums[maxSoFar] = nums[lastIndex-1];
            nums[lastIndex-1] = temp;
            selectionSort(nums, lastIndex-1, 0, 0);
        }
    }
}
