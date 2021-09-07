package com.rajul;

public class FindRotationCountInARotatedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int count = findRotationCount(nums);
        System.out.println(count);
    }
    static int findRotationCount(int[] nums){
        int pivot = findPivot(nums);
        return pivot+1;
    }
    static int findPivot(int[] nums) {
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
