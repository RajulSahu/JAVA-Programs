package com.rajul;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        // Given a sorted array, but don't know it sorted in ascending order or descending order
        // in this case order agnostic approach is followed.
        int[] arr1 = {2,4,6,9,11,12,14,20,36,48};
        int[] arr2 = {98,52,50,40,32,26,18,15,12,9,6,2,1,0};
        int target1 = 36;
        int target2 = 6;
        System.out.println(orderAgnosticBinarySearch(arr2, target2));
    }

    private static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // Find whether the array is sorted in ascending or descending.
        boolean isAsc = arr[start] < arr[end];
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            else{
                if(target < arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
