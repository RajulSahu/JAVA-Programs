package com.rajul;

public class FindArrayIsSortedOrNot {

    public static void main(String[] args) {
        int[] nums = {0,2,4,6,8,7};
        boolean ans = checkSorted(nums, 0);
        System.out.println(ans);
    }
    static boolean checkSorted(int[] nums, int index){
        if(index == nums.length - 1){
            return true;
        }
        return nums[index + 1] >= nums[index] && checkSorted(nums, index + 1);
    }
}
