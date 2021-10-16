package com.rajul;

public class FirstBadVersion {
    public static void main(String[] args) {
        int n = 4;
        int ans = firstBadVersion(n);
        System.out.println(ans);
    }
    static int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while(start <= end){
            int mid = start + (end-start)/2;

            if(isBadVersion(mid)){
                if(!isBadVersion(mid-1)) return mid;
                end = mid - 1;
            }
            else{
                if(isBadVersion(mid+1)) return mid+1;
                start = mid + 1;
            }
        }
        return 0;
    }
    static boolean isBadVersion(int n){
        return n == (1 + n)/2;
    }
}
