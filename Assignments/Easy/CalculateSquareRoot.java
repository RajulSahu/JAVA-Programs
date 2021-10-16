package com.rajul;

public class CalculateSquareRoot {

    public static void main(String[] args) {
        int x = 8;
        int ans = mySqrt(x);
        System.out.println(ans);
    }
    static int mySqrt(int x) {
        if (x == 0 || x == 1){
            return x;
        }
        int start = 2;
        int end = x/2;
        while(start<=end) {
           int mid = start + (end-start) / 2;
           if (mid > x/mid){
               end = mid - 1;
           }
           else{
               if ((mid+1) > x/(mid+1)) return mid;
               start = mid + 1;
           }
       }
        return end;
    }
}
