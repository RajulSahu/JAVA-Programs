package com.rajul;

public class Binary_Search {

    public static void main(String[] args) {
        // The Array should be sorted in ascending or descending order before applying binary search.
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target = 36;
        System.out.println(binarySearch(arr, target));
    }

    // return index if found
    // return -1 if not found
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
