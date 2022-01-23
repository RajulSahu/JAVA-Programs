package com.rajul;
import java.util.*;

public class MergeSort {

    public static void main(String[] args) {
        int[] nums = {5,2,6,3,2,1,4,8};
        int[] ans = mergeSort(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] mergeSort(int[] nums){
        if(nums.length == 1){
            return nums;
        }

        int mid = nums.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));

        return mergeSortedArrays(left, right);

    }
    static int[] mergeSortedArrays(int[] first, int[] second){
        int i = 0;
        int j = 0;
        int index = 0;
        int[] ans = new int[first.length + second.length];
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                ans[index] = first[i];
                i++;
            }
            else{
                ans[index] = second[j];
                j++;
            }
            index++;
        }
        while(i < first.length){
            ans[index] = first[i];
            i++;
            index++;
        }
        while(j < second.length){
            ans[index] = second[j];
            j++;
            index++;
        }
        return ans;
    }
}
