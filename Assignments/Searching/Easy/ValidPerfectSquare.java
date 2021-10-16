package com.rajul;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        int x = 5;
        boolean ans = isPerfectSquare(x);
        System.out.println(ans);
    }
    static boolean isPerfectSquare(int num){
        long lo = 1;
        long hi = num/2;
        while(lo <= hi){
            long mid = lo + (hi-lo) / 2;
            long sq = mid * mid;
            if (sq == num) return true;
            if (sq > num){
                hi = mid - 1;
            }
            else{
                lo = mid + 1;
            }
        }
        return false;
    }
    static boolean isPerfectSquare2(int num){
        int i=1;
        while(num>0){
            num -= i;
            i +=2;
            if(num == 0) return true;
        }
        return false;
    }
}
