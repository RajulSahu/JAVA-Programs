package com.rajul;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {1,3};
        int k = 1;
        int ans = findKthPositive(arr,k);
        System.out.println(ans);
    }
    static int findKthPositive(int[] arr, int k) {
        if (k < arr[0]) return k;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end-start) / 2;
            int x = arr[mid] - mid - 1;
            if (x >= k){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return start+k;
    }
}
