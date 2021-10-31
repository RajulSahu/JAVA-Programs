package com.rajul;

public class FindIndexOfElementInArray {
    public static void main(String[] args) {
        int[] nums = {0,2,4,6,8,10};
        int target = 10;
        int ans = findIndex(nums, target, 0);
        System.out.println(ans);
    }
    static int findIndex(int[] nums, int target, int index){
        if (index == nums.length){
            return -1;
        }
        if(nums[index] == target){
            return index;
        }
        else{
            return findIndex(nums, target, index+1);
        }
    }
}
