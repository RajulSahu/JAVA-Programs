package com.rajul;

public class CeilingOfANumberInArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 7;
        int ans1 = ceiling1(arr, target);
        int ans2 = ceiling2(arr, target);
        System.out.println(ans1 + " " + ans2);
    }
    static int ceiling1(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        if(target > nums[end]) return -1;

        if(target < nums[start]) return nums[start];

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target == nums[mid]){
                return target;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return nums[start];
    }

    static int ceiling2(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        if(target > nums[end]) return -1;

        if(target < nums[start]) return nums[start];

        while(end - start != 1){
           int mid = start + (end-start) / 2;
           if(target == nums[mid]){
               return target;
           }
           if(target > nums[mid]){
               start = mid;
           }
           else{
               end = mid;
           }
        }
        if(start == 0) return nums[start];
        else return nums[end];
    }

}
