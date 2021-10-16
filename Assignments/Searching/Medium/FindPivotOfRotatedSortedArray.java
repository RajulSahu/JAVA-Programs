package com.rajul;

public class FindPivotOfRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,1,2};
        int ans = findPivot(nums);
        System.out.println(ans);
    }
    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while (start <= end){
            int mid = start + (end-start) / 2;
            if (mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if (mid > start && nums[mid-1] > nums[mid]){
                return mid-1;
            }
            if (nums[start] >= nums[mid]){
                end = mid - 1;
            }
            if (nums[start] < nums[mid]){
                start = mid + 1;
            }
        }
        return -1;
    }
}
