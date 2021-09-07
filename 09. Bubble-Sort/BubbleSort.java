package com.rajul;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = {1,2,2,56,4,8,96,3,1,56,98,99,25,100};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    // Bubble Sort also known as Sinking Sort and Exchange Sort.
    // This sorting algorithm is also a Stable Sorting Algorithm.
    static void bubbleSort(int[] nums){
        boolean swapped;
        for (int i = 0; i < nums.length; i++) {
            swapped = false;
            for (int j = 0; j < nums.length - (i+1); j++) {
                if(nums[j+1] < nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
           if(!swapped) break;
        }
    }
}
