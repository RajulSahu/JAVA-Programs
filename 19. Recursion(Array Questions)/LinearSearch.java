package com.rajul;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {0,2,4,6,8,10};
        int target = 10;
        boolean ans = linearSearch(nums, target, 0);
        System.out.println(ans);
    }
    static boolean linearSearch(int[] nums, int target, int index) {
        if(index > nums.length-1){
            return false;
        }
        return  nums[index] == target || linearSearch(nums, target, index+1);
    }
}
