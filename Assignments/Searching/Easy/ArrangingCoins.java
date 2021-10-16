package com.rajul;

public class ArrangingCoins {
    public static void main(String[] args) {
        int n = 8;
        int ans1 = arrangeCoins(n);
        int ans2 = arrangeCoins2(n);
        int ans3 = arrangeCoins3(n);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
    }
    static int arrangeCoins(int n) {
        int coin = 1;
        while (n != 0){
            if(n-coin >= 0){
                n -= coin;
                coin++;
            }
            else{
                return coin-1;
            }
        }
        return coin-1;
    }
    static int arrangeCoins2(int n) {
        int start = 0;
        int end = n;
        while (start <= end) {
            int mid = start + (end-start)/2;
            int k = mid*(mid+1) / 2;
            if (k == n) return mid;
            if (k > n) end = mid - 1;
            else start = mid + 1;
        }
        return end;
    }
    static int arrangeCoins3(int n) {
        return (int)(Math.sqrt(2 * (long)n + 0.25) - 0.5);
    }

}
