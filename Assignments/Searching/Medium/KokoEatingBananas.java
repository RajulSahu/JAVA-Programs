package com.rajul;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {332484035,524908576,855865114,632922376,222257295,690155293,112677673,679580077,337406589,290818316,877337160,901728858,679284947,688210097,692137887,718203285,629455728,941802184};
        int h = 823855818;
        int ans = minEatingSpeedBinary(piles, h);;
        System.out.println(ans);
    }
    static int minEatingSpeedBinary(int[] piles, int h) {
        if (piles.length == 1){
            return (int) Math.ceil((piles[0] + 0.0)/h);
        }
        int maxPile = findMax(piles);
        int lo = 1;
        int hi = maxPile;
        int res = Integer.MAX_VALUE;
        while (lo <= hi){
            int k = lo + (hi-lo)/2;
            int hour = 0;
            for (int pile : piles){
                hour += (int) Math.ceil((pile + 0.0)/k);
            }
           if(hour <= h){
                res = k;
                hi = k - 1;
            }
            else{
                lo = k + 1;
            }
        }
        return res;
    }
    static int findMax(int[] nums){
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max){
                max = num;
            }
        }
        return max;
    }
}
