package com.rajul;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,11,13,65,88,98};
        int target = 88;
        int ans = binarySearch(arr, target, 0, arr.length-1);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        if (start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;

        if (arr[mid] == target){
            return mid;
        }
        if (target < arr[mid]){
            return binarySearch(arr, target, start, mid-1);
        }
        else{
            return binarySearch(arr, target, mid+1, end);
        }
    }
}
