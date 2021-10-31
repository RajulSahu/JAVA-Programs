package com.rajul;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {2,3,1,32,12,45,3};
        bubbleSort(nums, nums.length-1, 0);
        System.out.println(Arrays.toString(nums));
    }
    static void bubbleSort(int[] nums, int lastIndex, int indexStart){
        if (lastIndex == 0){
            return;
        }
        if(indexStart < lastIndex){
            if(nums[indexStart] > nums[indexStart+1]){
                int temp = nums[indexStart];
                nums[indexStart] = nums[indexStart+1];
                nums[indexStart+1] = temp;
            }
            bubbleSort(nums, lastIndex, indexStart+1);
        }
        else{
            bubbleSort(nums,lastIndex-1, 0);
        }
    }
}
