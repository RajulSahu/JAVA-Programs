package com.rajul;

public class FindPivotInRotatedArrayWithDuplicates {
    public static void main(String[] args) {
        int[] nums = {2,9,1,2,2};
        int pivot = findPivotWithDuplicates(nums);
        System.out.println(pivot);
    }
    static int findPivotWithDuplicates(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(mid < end && nums[mid] > nums[mid+1]) return mid;
            if(mid > start && nums[mid-1] > nums[mid]) return mid-1;

            if(nums[mid] <= nums[start]) end = mid - 1;

            if(nums[mid] > nums[start]) start = mid + 1;
        }
        return -1;
    }
}
