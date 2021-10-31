package com.rajul;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] nums = {5,6,7,8,9,1,2,3};
        int target = 8;
        int ans = rotatedBinarySearch(nums, target, 0, nums.length-1);
        System.out.println(ans);
    }
    static int rotatedBinarySearch(int[] nums, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(nums[mid] == target){
            return mid;
        }

        if(nums[start] <= nums[mid]){
            if(target >= nums[start] && target <= nums[mid]){
                return rotatedBinarySearch(nums, target, start, mid-1);
            }
            else{
                return rotatedBinarySearch(nums, target, mid+1, end);
            }
        }
        else{
            if(target >= nums[mid] && target <= nums[end]){
                return rotatedBinarySearch(nums, target, mid+1, end);
            }
            else{
                return rotatedBinarySearch(nums, target, start, mid-1);
            }
        }
    }
}
