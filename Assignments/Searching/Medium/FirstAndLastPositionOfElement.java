package com.rajul;
import java.util.Arrays;

public class FirstAndLastPositionOfElement {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] nums, int target) {
        if (nums.length == 1) {
            if (nums[0] == target) return new int[]{0,0};
            else return new int[]{-1,-1};
        }
        int startIndex  = searchIndex(nums, target, true);
        if (startIndex == -1){
            return new int[]{-1,-1};
        }
        int endIndex  = searchIndex(nums, target, false);
        return new int[]{startIndex,endIndex};
    }
    static int searchIndex(int[] nums, int target, boolean findFirst){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while (start <= end){
            int mid = start +(end-start) / 2;
            if (target < nums[mid]){
                end = mid - 1;
            }
            else if (target > nums[mid]){
                 start = mid + 1;
            }
            else{
                ans = mid;
                if (findFirst){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
