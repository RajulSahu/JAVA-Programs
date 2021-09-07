package com.rajul;
// In a Mountain Array the values increases first and then decreases.

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5,6,4,3,2};
        int ans = findPeak(nums);
        System.out.println(ans);
    }
    static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start != end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return arr[end];
    }
}
