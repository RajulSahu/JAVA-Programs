package com.rajul;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,1,2};
        int target = 2;
        int ans = search(nums, target);
        System.out.println(ans);
    }
    static int search(int[] nums, int target) {
        int start = 0;
        int pivot = findPivot(nums);
        System.out.println(pivot);
        int end = nums.length-1;
        int ans = binarySearch(nums, target, start, pivot);
        if(ans != -1) return ans;
        else return binarySearch(nums, target, pivot+1, end);
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
    static int binarySearch(int[] nums, int target, int start, int end){
        while (start <= end) {
            int mid = start + (end-start) / 2;
            if (target == nums[mid]){
                return mid;
            }
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
