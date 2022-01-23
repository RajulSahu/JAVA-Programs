package com.rajul;

import java.util.*;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] nums = {5,2,6,3,2,1,4,8};
        mergeSortInPlace(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    static void mergeSortInPlace(int[] nums, int s, int e) {
        if(e - s == 1){
            return;
        }

        int mid = (s + e) / 2;

        mergeSortInPlace(nums, s, mid);
        mergeSortInPlace(nums, mid, e);

        mergeSortedArraysInPlace(nums, s, mid, e);
    }
    static void mergeSortedArraysInPlace(int[] nums, int s, int mid, int e){
        int i = s;
        int j = mid;
        int index = 0;
        int[] ans = new int[e - s];
        while(i < mid && j < e){
            if(nums[i] < nums[j]){
                ans[index] = nums[i];
                i++;
            }
            else{
                ans[index] = nums[j];
                j++;
            }
            index++;
        }
        while(i < mid){
            ans[index] = nums[i];
            i++;
            index++;
        }
        while(j < e){
            ans[index] = nums[j];
            j++;
            index++;
        }

        for (int k = 0; k < ans.length; k++) {
            nums[s+k] = ans[k];
        }
    }
}
