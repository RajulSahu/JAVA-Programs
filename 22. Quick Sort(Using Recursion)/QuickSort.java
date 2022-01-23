package com.rajul;
import java.util.*;

public class QuickSort {

    public static void main(String[] args) {
        int[] nums = {1,3,5,6,4,2};
        quickSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    static void quickSort(int[] nums, int low, int hi) {
        if(low >= hi){
            return;
        }

        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while(nums[s] < pivot){
            s++;
        }
        while(nums[e] > pivot){
            e--;
        }

        if(s <= e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }

        quickSort(nums, low, e);
        quickSort(nums, s, hi);
    }
}
