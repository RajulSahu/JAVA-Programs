package com.rajul;

public class SearchInRotatedSortedArray2 {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,1,2};
        int target = 2;
        int ans = search(nums, target);
        System.out.println(ans);
    }
    static int search(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while (start <= end) {
            int mid = start + (end-start) / 2;
            if (target == nums[mid]) return mid;

            if (nums[mid] >= nums[start]) {
                if (target >= nums[start] && target <= nums[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }

            else if (nums[mid] < nums[start]) {
                if (target >= nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
