package com.rajul;


public class AllocateMinimumNumberOfPages {
    public static void main(String[] args) {
        int[] pages = {20,10,30,40};
        int m = 2;
        int ans = minPages(pages, m);
        System.out.println(ans);
    }
    static int minPages(int[] arr, int m){
        int sum = 0;
        int max = 0;
        for (int val : arr) {
            sum += val;
            max = Math.max(max,val);
        }

        int lo = max;
        int hi = sum;
        int ans = 0;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if(isPossible(arr, mid, m)){
                ans = mid;
                hi = mid - 1;
            }
            else{
                lo = mid + 1;
            }
        }
        return ans;
    }
    static boolean isPossible(int[] arr, int mid, int m) {
        int student = 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum > mid){
                student++;
                sum = arr[i];
            }
        }
        return student <= m;
    }
}
