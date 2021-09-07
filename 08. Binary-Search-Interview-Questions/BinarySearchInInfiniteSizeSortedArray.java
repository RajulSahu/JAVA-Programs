package com.rajul;

public class BinarySearchInInfiniteSizeSortedArray {
    public static void main(String[] args) {
        int[] nums = {2,3,5,6,7,8,10,11,12,15,20,23,30}; // this will be an infinite array.
        int target = 7;
        int found_index = ans(nums, target);
        System.out.println(found_index);

    }

    static int ans(int[] nums, int target){
        int start = 0;
        int end = 1;
        while(target > nums[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(nums, target, start, end);
    }

    static int binarySearch(int[] nums, int target, int start, int end){

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target == nums[mid]) return mid;

            if (target < nums[mid]) {
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
