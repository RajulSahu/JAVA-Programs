package com.rajul;

public class SmallestNumberGreaterThanTarget {
    public static void main(String[] args) {
        int[] nums = {3,5,9,11};
        int target = 9;
        int ans = smallestNumberGreaterThanTarget1(nums, target);
        System.out.println(ans);
    }
    static int smallestNumberGreaterThanTarget(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if(nums[start] > target) return nums[start];
        if(nums[end] < target) return -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                if (nums[mid+1] != target) return nums[mid+1];
                else start = mid + 1;
            }
            else if (nums[mid] > target){
                if (nums[mid - 1] <= target){
                    return nums[mid];
                }
                end = mid - 1;
            }
            else{
                if (nums[mid + 1] > target){
                    return nums[mid+1];
                }
                start = mid + 1;
            }
        }
        return -1;
    }
    static int smallestNumberGreaterThanTarget1(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }

        return nums[start % nums.length];
    }
}
